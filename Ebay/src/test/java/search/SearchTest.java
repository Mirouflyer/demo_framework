package search;

import base.CommonAPI;
import checkElements.ElementChecking;
import checkElementsTest.ElementListTest;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {
//        @Test
//    public void search1(){
//
//        typeOnId("gh-ac");
//    }
//    @Test
//    public void search2(){
//
//        typeOnCSS("#gh-ac");
//    }
//
//    @Test
//    public void getWebElemnts() {
//        System.out.println(getTextFromWebElements("#gh-cat"));
//    }
    @Test  // Testing the advanced search
    public void serchPersonelizedItem() throws InterruptedException {
        findElementByxPath("//a[@title='Advanced Search']");
        sleepFor(3);
//        findElement("_nkw", "Laptop");
//        findElement("_ex_kw", "hp");
//        clickButton("e1-1");
//        findElementByxPath("//button[@type='submit']");


//    }
//    @Test
//    public void checkBoxButtom () throws InterruptedException {
//        findElementByxPath("//a[@title='Advanced Search']");
//        sleepFor(3);
//        findElement("_nkw", "Laptop");
//        findElement("_ex_kw", "hp");
        ElementListTest.checkBox("//fieldset[2]//label");
//        clickButtonByXpath("//input[@id='_mPrRngCbx']");
//        sleepFor(2);

//      findElement("//input[@name='_udlo']", "20");
//      findElement2("//input[@name='_udhi']", "80");
//      sleepFor(2);

        //input[@class='price']
//        ElementListTest.checkBox("//fieldset[3]//input");
    }

  //  @Test
//    public  void checkBoxtest(){
//        @FindBy(xpath = "//fieldset[2]//label");
//
//
//    }
}
