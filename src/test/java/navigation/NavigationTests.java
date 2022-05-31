package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigation() {
        homePage.clickDynamicLoadingPage().clickExample1();

        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab() throws InterruptedException {
        homePage.clickMultipleWindowsPage().clickHere();
        getWindowManager().switchToTab("New Window");
        Thread.sleep(3000);
    }
}
