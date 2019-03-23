package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
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
        System.setProperty("webdriver.chrome.driver", "..\\Generic\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void cleanUO() {
        driver.close();
    }

    //**************************************************//

    public void typeOnId(String locator) {
        driver.findElement(By.id(locator)).sendKeys("books", Keys.ENTER);
    }

    public void typeOnCSS(String locator) {
        driver.findElement(By.cssSelector(locator)).sendKeys("cars", Keys.ENTER);
    }

    public void typeOnWebElement(String locator, String value) {
//        try {
//            driver.findElement(By.cssSelector(locator)).sendKeys("books", Keys.ENTER);
//        } catch(Exception Ex) {
//            System.out.println("Tried with CSS, did not work. will try by ID now: ");
//            driver.findElement(By.id(locator)).sendKeys("books", Keys.ENTER);
//
//        }

        try {
            driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception Ex1) {
            System.out.println("Id Locator did not work ");
        }
        try {
            driver.findElement(By.name(locator)).sendKeys("books", Keys.ENTER);
        } catch (Exception ex2) {
            System.out.println("Name Locator did not work");
        }
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex3) {
            System.out.println("CSS locator did not work");
        }
    }

    public String getCurrentPageUrl() {
        String urls = driver.getCurrentUrl();
        return urls;
    }

    public void navigateForward() {
        driver.navigate().forward();
    }

    //get the text from the webElements of the arrayList
    public static List<String> getTextFromWebElements(String locator) {

        List<WebElement> element = new ArrayList<WebElement>();


        List<String> text = new ArrayList<String>();

        element = driver.findElements(By.cssSelector(locator));
        for (WebElement web : element) {
            String st = web.getText();
            System.out.println(st);
            text.add(st);
        }

        return text;

    }

    // Te methods used to get Signed IN

    public void clickOnSingIn(String locator) {
        driver.findElement(By.id(locator)).click();
    }

    public void findElement(String locator, String info) {
        driver.findElement(By.id(locator)).sendKeys(info, Keys.TAB); // username

    }

    public void findElement2(String locator, String info) {

        driver.findElement(By.id(locator)).sendKeys(info, Keys.TAB); // password
    }

    public void clickButton(String locator) {

        driver.findElement(By.id(locator)).click(); // click sign im
    }
    public void clickButtonByXpath(String locator) {

        driver.findElement(By.xpath(locator)).click(); // click sign im

    }


    public static void sleepFor(int sec) throws InterruptedException {
        Thread.sleep(sec * 1000);
    }

    public void logOut1(String locator) {

        driver.findElement(By.id(locator)).click(); // click on Sign Out
    }

    public void logOut2(String locator) { // Sign out

        driver.findElement(By.xpath(locator)).click();
    }


    public void findElementByxPath(String loctor) {
        driver.findElement(By.xpath(loctor)).click();
    }



    }


