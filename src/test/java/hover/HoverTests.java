package hover;

import base.BaseTests;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        HoversPage hoversPage = homePage.clickHoversPage();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(0);

        assertTrue(caption.isCaptionDisplayed(),"Caption is not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title is incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link is incorrect");
    }
}
