package checkElementsTest;

import checkElements.ElementChecking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ElementListTest extends ElementChecking {
    // slect checkbox
    public static void checkBox(String locator) throws InterruptedException {
        List<WebElement> usWebElement = driver.findElements(By.xpath("//fieldset[2]//label"));
        List<String> searchIncludingBox = new ArrayList<String>();

        for (WebElement element : usWebElement) {
            String text2 = element.getText();
            element.click();
            Thread.sleep(1500);
            element.click();
            Thread.sleep(1500);
            searchIncludingBox.add(text2);
            System.out.println(text2);
        }
//        System.out.println(searchIncludingBox.size());
//        for (int i = 0; i < searchIncludingBox.size(); i++) {
//
//            System.out.println(searchIncludingBox.get(i));
//
//        }

    }
}