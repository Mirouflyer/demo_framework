package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) {


        System.setProperty("webdriver.chrome.driver", "/Users/mirouflyer/Desktop/teamframework/demo_framework/Generic/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void cleanUO() {
        driver.close();
    }



    public void typeCSS(String locator, String keyword){
        driver.findElement(By.cssSelector(locator)).sendKeys(keyword);
    }

    public void typeCSSTab(String locator, String keyword){
        driver.findElement(By.cssSelector(locator)).sendKeys(keyword,Keys.TAB);
    }


    public void typeOnID(String locator, String keyword) {
        driver.findElement(By.id(locator)).sendKeys(keyword, Keys.ENTER);
    }

    public void typeOnCSS(String locator, String keyword) {
        driver.findElement(By.cssSelector(locator)).sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    //get the text from the webElements of the arrayList
    public static List<String> getTextFromWebElements(String locator) {
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver.findElements(By.cssSelector(locator));
        for (WebElement web : element) {
            String st = web.getText();
            text.add(st);
        }

        return text;
    }

    public void typeOnElement(String locator, String keyword) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(keyword);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(keyword);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(keyword);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(keyword);
                }
            }
        }
    }

    public void clickOnXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();

    }




}