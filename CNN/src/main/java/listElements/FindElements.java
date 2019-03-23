package listElements;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FindElements extends CommonAPI {
    public void findWebElements(){
        List<WebElement> usWebElement = driver.findElements(By.xpath("//*[@class='m-footer__bucket m-footer__bucket__us']/li/ol"));
        List<String> us = new ArrayList<>();
        for (WebElement element:usWebElement) {
            String usOption = element.getText();
            us.add(usOption);
        }
        System.out.println(us.size());
        for (int i=0;i<us.size();i++) {
            System.out.println(us.get(i));

        }
    }
}
