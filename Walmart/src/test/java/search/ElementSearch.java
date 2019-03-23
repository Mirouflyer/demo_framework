package search;

import base.CommonAPI;
import org.testng.annotations.Test;

public class ElementSearch extends CommonAPI {

    @Test
    public void searchTest() throws Exception{
      typeOnID("global-search-input","Babycarseat");
      Thread.sleep(5000);
    }
}
