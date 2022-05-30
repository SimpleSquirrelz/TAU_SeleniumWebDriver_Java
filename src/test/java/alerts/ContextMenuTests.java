package alerts;

import base.BaseTests;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu() {
        var contextMenuPage = homePage.clickContextMenuPage();
        contextMenuPage.clickContextMenu();
        assertEquals(contextMenuPage.alert_getText(),"You selected a context menu","Message is incorrect");
        contextMenuPage.alert_clickToAccept();
    }
}
