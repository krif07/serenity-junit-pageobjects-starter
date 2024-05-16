package starter.pageobjects;

import org.openqa.selenium.By;

public class ProductForm {
    public static final By PRODUCT_NAME_LABEL = By.cssSelector("h2.name");
    public static final By PRODUCT_PRICE_LABEL = By.cssSelector("h3.price-container");
    public static final By PRODUCT_ADD_TO_CART_BUTTON = By.xpath("//a[text()='Add to cart']");
}
