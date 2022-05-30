package frames;

import base.BaseTests;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.NestedFramesPage;

public class NestedFramesTests extends BaseTests {

    @Test
    public void testNestedFrames(){
        NestedFramesPage nestedFramesPage = homePage.clickNestedFramesPage();
        nestedFramesPage.switchToBottomFrame();
        assertEquals(nestedFramesPage.getFrameText(),"BOTTOM","Frame text is incorrect");
        nestedFramesPage.switchFromTopFrame();

        nestedFramesPage.switchToLeftFrame();
        assertEquals(nestedFramesPage.getFrameText(),"LEFT","Frame text is incorrect");
    }
}
