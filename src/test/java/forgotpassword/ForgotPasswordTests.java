package forgotpassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void test(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("testmail@test.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickSubmitButton();
        Assert.assertEquals(emailSentPage.getConfirmationMessage(),
                "Your e-mail's been sent!",
                "Incorrect success message");
    }
}
