package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.CartForm;
import starter.pageobjects.DemoBlazeHomeForm;
import starter.pageobjects.ProductForm;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class SelectProductSteps extends UIInteractionSteps {

    @Step("User select the product with the name {string}")
    public void selectProductByName(String name) {
        find(DemoBlazeHomeForm.ProductLinkByName(name)).click();
        withTimeoutOf(Duration.ofSeconds(3))
                .waitFor(presenceOfElementLocated(ProductForm.PRODUCT_NAME_LABEL));
    }

    @Step("User add the product to the cart")
    public void addProductToCart() {
        find(ProductForm.PRODUCT_ADD_TO_CART_BUTTON);
    }

    @Step("Check the product name")
    public String getProductName() {
        return find(ProductForm.PRODUCT_NAME_LABEL).getText();
    }

    @Step("Check the product price")
    public String getProductPrice() {
        return find(ProductForm.PRODUCT_PRICE_LABEL).getText();
    }
}
