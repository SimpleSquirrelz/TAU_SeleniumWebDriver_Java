package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        KeyPressesPage keyPage = homePage.clickKeyPressPage();
        keyPage.enterText("A" + Keys.BACK_SPACE);

        Assert.assertEquals(keyPage.getResult(),"You entered: BACK_SPACE","Result message is incorrect");
    }

    @Test
    public void testNote(){
        KeyPressesPage keyPage = homePage.clickKeyPressPage();
        keyPage.enterNote();
    }
}
