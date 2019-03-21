package signIn;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SignIn extends CommonAPI {

    @Test
    public void sign() throws Exception{
        clickOnCss("#header-account-toggle");
        clickOnXpath("//a[@title='Sign In']//div[@class='a35M3c a15HBc y9t7h a11c4I ZhdgG a2_BWe']");
        typeCSSTab("#email","samir_aitouarab@yahoo.fr");
        typeCSSTab("#password","1234");
        clickOnCss(".button.m-margin-top");

        Thread.sleep(4000);



    }
}
