package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlertsPage();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        Assert.assertEquals(alertsPage.getResult(),
                "You successfully clicked an alert",
                "Result text incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlertsPage();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        Assert.assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickJavaScriptAlertsPage();
        alertsPage.triggerPrompt();
        String inputText = "Hello";
        alertsPage.alert_setInput(inputText);
        alertsPage.alert_clickToAccept();
        Assert.assertEquals(alertsPage.getResult(),"You entered: " + inputText, "Result text incorrect");
    }
}
