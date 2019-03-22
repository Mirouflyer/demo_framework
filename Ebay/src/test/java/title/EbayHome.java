package title;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EbayHome extends CommonAPI {
    @Test
    public void test() {
        String tittle = driver.getTitle();
        String Urls;
        System.out.println(tittle);
        Assert.assertEquals(tittle, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

         Urls = getCurrentPageUrl();

        Urls = driver.getCurrentUrl();
        System.out.println("The current url of the current window is: " + Urls);
    }

    @Test
    public void logIN() throws InterruptedException {
        clickOnSingIn("gh-ug");

        findElement("userid", "hargasyoucef@gmail.com");
        findElement2("pass", "17031991you");
        clickButton("sgnBt");
        sleepFor(7);
        logOut1("gh-ug");
        logOut2("gh-uo");
        sleepFor(5);
    }


}