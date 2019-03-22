package search;

import base.CommonAPI;
import org.testng.annotations.Test;

import java.net.CookieHandler;

public class SearchTest extends CommonAPI {

    @Test
    public void search()throws  Exception{
     typeOnCSS("#search","Selenium");
     Thread.sleep(3000);

    }
}
