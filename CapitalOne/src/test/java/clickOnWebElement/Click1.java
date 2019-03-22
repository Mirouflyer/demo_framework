package clickOnWebElement;

import click.ClickOnWebElement;
import org.testng.annotations.Test;

public class Click1 extends ClickOnWebElement {
    @Test
    public void test(){
        click("//img[@alt='View Your Credit Score']");
    }
    @Test
    public void test2(){
        tryClickOnElement("// img[@alt='Venture Card']");
    }


}
