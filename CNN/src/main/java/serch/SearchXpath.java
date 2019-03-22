package serch;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchXpath extends CommonAPI {
    public void searchCode(){
        driver.findElement(By.xpath("//div[@id='search-button']")).click();
        driver.findElement(By.xpath("//*[@id='search-input-field']")).sendKeys("Leo Messi", Keys.ENTER);
    }
}
