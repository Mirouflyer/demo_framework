package menu;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.MenuPage;

public class MenuListTest extends CommonAPI {

    @Test
    public void listSearch() throws Exception{
        MenuPage.readMenuText(driver);
    }
}
