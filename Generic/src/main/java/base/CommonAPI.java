package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;
    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver","..\\Generic\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void cleanUO(){
        driver.close();
    }


    public void findElementById(String locator, String info){
        driver.findElement(By.id(locator)).sendKeys(info, Keys.TAB);
    }
    public void findElementByClassName(String locator, String info){
        driver.findElement(By.className(locator)).sendKeys(info,Keys.ENTER);
    }
    public void findElementByCssSelector(String locator, String info){
        driver.findElement(By.cssSelector(locator)).sendKeys(info,Keys.ENTER);
    }
    public void findElementByXpath(String selector, String info){
        driver.findElement(By.xpath(selector)).sendKeys(info,Keys.ENTER);
    }

    public void clickOnElementById(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void clickOnElementByCss(String location){
    }

    public void tryClickOnElement (String locator){
        try{
            driver.findElement(By.cssSelector(locator)).click();
        }catch (Exception ex1){
            try{
            System.out.println("using css was not successful");
            driver.findElement(By.name(locator)).click();
        }catch (Exception ex2){
            try{
                System.out.println("using name was not successful");
                driver.findElement(By.xpath(locator)).click();
            }catch (Exception ex3){
                System.out.println("using xpath was not successful");
                driver.findElement(By.id(locator)).click();
            }
            }
        }
    }
    public void clickOnCss(String selector){
        driver.findElement(By.cssSelector(selector)).click();
    }
    public void clickOnName(String locator){
        driver.findElement(By.className(locator));
    }

    public void clickOnWebElementXpath(String locator){

        driver.findElement(By.xpath(locator)).click();
    }

    public void navigateBack() {
        driver.navigate().back();
    }
}







