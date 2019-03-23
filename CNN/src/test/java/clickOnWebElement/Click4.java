package clickOnWebElement;

import base.CommonAPI;
import org.testng.annotations.Test;

public class Click4 extends CommonAPI {
    @Test
    public void clickAndGOBack(){
        clickOnWebElementXpath("//*[@data-analytics-header='main-menu_business']");
        navigateBack();
    }

}
