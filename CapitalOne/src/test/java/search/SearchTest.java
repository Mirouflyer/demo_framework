package search;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {
    @Test
    public void test(){
    findElementByCssSelector("#navtest-b-l1-search","credit card");
    }
}
