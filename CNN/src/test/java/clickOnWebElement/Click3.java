package clickOnWebElement;

import base.CommonAPI;
import org.testng.annotations.Test;

public class Click3  extends CommonAPI {
    @Test
    public void clickOnWebElement(){
        clickOnWebElementXpath("//*[@alt='LIVE: Updating results from Day 2 of March Madness ']");
    }
}
