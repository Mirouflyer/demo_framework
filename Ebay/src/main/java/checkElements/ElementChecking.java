package checkElements;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ElementChecking extends CommonAPI {
   String practicePageUrl = "https://www.ebay.com/sch/ebayadvsearch";

    @FindBy(xpath = "//fieldset[2]//label")
    List<WebElement> searchIncludingBox;


//    public void navigateToPracticePage() {
//        this.driver.navigate().to(this.practicePageUrl);
//    }

    // handling radio buttons
    public void clickAllElementChecking() throws Exception {
        for (WebElement element : searchIncludingBox) {
            Thread.sleep(1500);
            element.click();
            Thread.sleep(1500);
        }
    }

}
