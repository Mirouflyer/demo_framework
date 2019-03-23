package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RadioBtn extends CommonAPI {


    @FindBy(id = "global-search-input")
    WebElement searchBar;

    @FindBy(xpath = "//div[@data-tl-id='Shipping & Pickup-Navigation']//div[@class='facets-bar']//div//div[@class='expander expanded']//label//input")
    List<WebElement> radioBtn;

    public void find() {
        searchBar.sendKeys("water", Keys.ENTER);
    }

    public void seleltRadioBtn() throws Exception {
        for (WebElement element : radioBtn) {
            System.out.println(element);
            Thread.sleep(3000);
            element.click();
            Thread.sleep(3000);
        }

    }
}






