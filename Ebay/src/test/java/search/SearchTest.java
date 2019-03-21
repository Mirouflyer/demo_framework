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
}
