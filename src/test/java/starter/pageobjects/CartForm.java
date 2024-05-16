package starter.pageobjects;

import org.openqa.selenium.By;

public class CartForm {
    public static final By CART_TITLE_LABEL = By.xpath("(//div[@id='page-wrapper']//h2)[1]");
    public static final By CART_PRODUCT_NAME_LABEL = By.xpath("//tbody[@id='tbodyid']/tr[{0}]/td[2]");
    public static final By CART_PRODUCT_PRICE_LABEL = By.xpath("//tbody[@id='tbodyid']/tr[{0}]/td[3]");
}
