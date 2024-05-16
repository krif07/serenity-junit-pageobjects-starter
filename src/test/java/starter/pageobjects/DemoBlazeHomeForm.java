package starter.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoBlazeHomeForm extends PageObject {
    public static final By MENU_HOME_LINK = By.xpath("(//a[@class='nav-link'])[1]");
    public static final By MENU_CART_LINK = By.xpath("//a[text()='Cart']");
    public static final By LAT_MENU_CATEGORIES_LINK = By.cssSelector("a#cat");
    public static final Target PRODUCT_LINK_BY_NAME = Target.the("product link by name")
            .locatedBy("//h4/a[text()='{0}']");
    public static By ProductLinkByName(String name) {
        return By.xpath("//h4/a[text()='" + name + "']");
    }
}
