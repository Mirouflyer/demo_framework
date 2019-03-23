package click;

import base.CommonAPI;
import org.testng.annotations.Test;

public class ClickTest extends CommonAPI {

    @Test
    public void click() throws Exception {
        clickOnCss(".TempoCategoryTile-overlayLink.u-focusTile");
        Thread.sleep(5000);
    }

}
