package checkElementsTest;

import checkElements.ElementChecking;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ElementListTest extends ElementChecking {
    ElementChecking elementChecking;

    @BeforeClass
    public void initialize() throws Exception {
        this.elementChecking = PageFactory.initElements(this.driver, ElementChecking.class);
       // this.elementChecking.navigateToPracticePage();
        Thread.sleep(3000);
    }

    @Test
    public void boxCheckingTest() throws Exception {
        findElementByxPath("//a[@title='Advanced Search']");
        sleepFor(3);

            this.elementChecking.clickAllElementChecking();


    }
}