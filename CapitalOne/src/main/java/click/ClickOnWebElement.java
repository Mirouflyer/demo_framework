package click;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ClickOnWebElement extends CommonAPI {

    public void click(String locator){
        driver.findElement(By.xpath(locator)).click();
        String current =driver.getWindowHandle();
        for(String windowHandle : driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
        String title = driver.getTitle();
        Assert.assertEquals(title, "Free Credit Score & Report Check with CreditWise | Capital One");
        driver.close();
        driver.switchTo().window(current);

    }


}
