package pages;

import base.CommonAPI;
import database.ConnectToSqlDB;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MenuPage {
    public static void readMenuText(WebDriver driver1)throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> actualData = new ArrayList<>();
        List<String> listOfMenu = CommonAPI.getTextFromWebElements(".nav-search-dropdown.searchSelect option");
        SearchPage searchPage = PageFactory.initElements(driver1, SearchPage.class);
        searchPage.searchItemsAndSubmitButton(driver1);
        //To Be implemented, to read from database
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(listOfMenu, "itemList1" , "items");
        actualData = connectToSqlDB.readDataBase("itemList1","items" );
        for (String data:actualData){
            System.out.println(data);
        }
        List<String> menuData = new ArrayList<>();

        //Assert.assertEquals(menuData,actualData);
    }
}
