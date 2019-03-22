package pages;

import datasource.DataBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchPage {

    DataBase dataBase = new DataBase();

    @FindBy(how = How.CSS, using ="#global-search-input" )
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using =".a1qUqR.a2GoU-.GlobalHeaderSearchbar-submit.a2btJm" )
    public static WebElement submitButtonWebElement;

    public WebElement getSearchInputWebElement(){
        return searchInputWebElement;
    }

    public WebElement getSubmitButtonWebElement(){
        return submitButtonWebElement;
    }

    public void searchFor(String value){
        getSearchInputWebElement().sendKeys(value);
    }


    public void submitSearchButton(){
        getSearchInputWebElement().click();
        try { Thread.sleep(2000);}
        catch (InterruptedException e) {}
    }

    public void clearInput(){
        getSearchInputWebElement().clear();
    }

    public void searchItemAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = dataBase.getItemListFromDB();
        for(int i = 0; i<list.size(); i++){
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }

}
