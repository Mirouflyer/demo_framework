package clickOnWebElement;

import base.CommonAPI;
import org.testng.annotations.Test;

public class Click1 extends CommonAPI {
    @Test
    public void clickXpath(){
        clickOnWebElementXpath("//a[@data-analytics-header='main-menu_world']");
    }
}
