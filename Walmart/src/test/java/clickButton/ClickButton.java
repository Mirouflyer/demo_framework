package clickButton;

import base.CommonAPI;
import org.testng.annotations.Test;

public class ClickButton extends CommonAPI {

    @Test
    public void test (){
        try{
            typeCSS("#global-search-input","water");
            Thread.sleep(3000);
            clickOnCss("#global-search-submit");
            Thread.sleep(3000);

        }catch (Exception exp){
            exp.getMessage();
            exp.getStackTrace();
        }

    }
}
