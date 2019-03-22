package clickOnWebElement;

import base.CommonAPI;
import org.testng.annotations.Test;

public class Click2 extends CommonAPI {
    @Test
    public void clickCss(){
        clickOnCss("#nav-mobileTV");
    }
}
