package wait;

import base.BaseTests;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoadingPage().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(),"Hello World!", "Loaded text is incorrect");
    }
}
