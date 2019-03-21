package purchase;

import base.CommonAPI;
import org.testng.annotations.Test;

import java.net.CookieHandler;

public class PurchaseTest extends CommonAPI {


    @Test
    public void purchase(){
        typeOnCSS("#global-search-input","Samsung 10");

    }
}
