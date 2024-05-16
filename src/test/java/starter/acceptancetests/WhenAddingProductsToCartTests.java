package starter.acceptancetests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.actions.NavigateSteps;
import starter.actions.SelectProductSteps;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenAddingProductsToCartTests {

    @Steps
    NavigateSteps navigate;

    @Steps
    SelectProductSteps selectProduct;

    @Test
    @DisplayName("Should be able to check the product data")
    void checkTheProductData() {
        String name = "Nokia lumia 1520";
        String price = "$820";

        navigate.opensTheHomePage();

        selectProduct.selectProductByName(name);

        assertThat(selectProduct.getProductName()).isEqualTo(name);
        assertThat(selectProduct.getProductPrice()).contains(price);
    }
}
