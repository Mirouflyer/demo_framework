package menu;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.MenuPage;

import java.io.IOException;
import java.sql.SQLException;

public class MenuTest extends CommonAPI {
    @Test
    public void menu()throws Exception, IOException , SQLException, ClassNotFoundException{
        MenuPage.readMenuText(driver);
    }



}
