package clickOnWebElement;

import base.CommonAPI;
import org.testng.annotations.Test;

public class Click2 extends CommonAPI {
    @Test
    public void cssClick(){
        clickOnCss(".site-header__navlink\n" +
                "                  \n" +
                "                ");
    }

}
