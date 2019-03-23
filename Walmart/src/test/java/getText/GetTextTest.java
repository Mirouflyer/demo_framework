package getText;

import base.CommonAPI;
import org.testng.annotations.Test;

public class GetTextTest extends CommonAPI {

    @Test
    public void getText() throws Exception{
       String text =  getTextByXpath("//h2[@data-tl-id='HomePage-contentZone13-MultiStoryModule-ModuleHeader-title']");
       Thread.sleep(3000);
        System.out.println(text);

    }
}
