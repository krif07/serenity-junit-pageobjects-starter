package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.CartForm;
import starter.pageobjects.DemoBlazeHomeForm;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class NavigateSteps extends UIInteractionSteps {

    DemoBlazeHomeForm demoBlazeHomePage;

    @Step("User opens the blaze demo page")
    public void opensTheHomePage() {
        demoBlazeHomePage.open();
    }

    @Step("User go to the shopping cart")
    public void goToTheShoppingCart() {
        find(DemoBlazeHomeForm.MENU_CART_LINK).click();
        withTimeoutOf(Duration.ofSeconds(3))
                .waitFor(presenceOfElementLocated(CartForm.CART_TITLE_LABEL));
    }

    @Step("User go to the home page")
    public void goToTheHomePage() {
        find(DemoBlazeHomeForm.MENU_HOME_LINK).click();
        withTimeoutOf(Duration.ofSeconds(3))
                .waitFor(presenceOfElementLocated(DemoBlazeHomeForm.LAT_MENU_CATEGORIES_LINK));
    }
}
