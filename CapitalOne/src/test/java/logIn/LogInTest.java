package logIn;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends CommonAPI {

    @Test
    public void test() throws InterruptedException {
        findElementById("no-acct-uid","aaaaaa");
        findElementById("no-acct-pw","bbbbbb");
        clickOnElementById("no-acct-submit");
        WebDriverWait ddd = new WebDriverWait(driver,5);
        ddd.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='logo']"))));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Sign In");

//        WebElement webElement1 = driver.findElement(By.xpath("//span[text()='What you entered doesn’t match what we have on file.']"));
//        String error1 = webElement1.getText();
//
//        WebElement webElement2 = driver.findElement(By.xpath("//span[text()='We can help you with your']"));
//        String error2 = webElement2.getText();
//        Assert.assertEquals(error1, "What you entered doesn’t match what we have on file.");
//        Assert.assertEquals(error2, "We can help you with your");
    }
}
