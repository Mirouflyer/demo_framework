package search;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {
        @Test
    public void search1(){

        typeOnId("gh-ac");
    }
    @Test
    public void search2(){

        typeOnCSS("#gh-ac");
    }

    @Test
    public void getWebElemnts() {
        System.out.println(getTextFromWebElements("#gh-cat"));
    }
    @Test  // Testing the advanced search
    public void serchPersonelizedItem() throws InterruptedException {
        findElementByxPath("//a[@title='Advanced Search']");
        sleepFor(3);
        findElement("_nkw", "Laptop");
        findElement("_ex_kw", "hp");
        clickButton("e1-1");
        findElementByxPath("//button[@type='submit']");
    }
}
