package radiobtn;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.RadioBtn;

public class RadioBtnTest extends CommonAPI {


    @Test
    public void radioBtnTest() throws Exception{
        RadioBtn radioBtn = PageFactory.initElements(driver,RadioBtn.class);
        radioBtn.find();
        radioBtn.seleltRadioBtn();

    }

}
