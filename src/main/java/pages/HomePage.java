package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public WysiwygEditorPage clickWysiwygEditorPage(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public ContextMenuPage clickContextMenuPage(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public FileUploadPage clickFileUploadPage(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public AlertsPage clickJavaScriptAlertsPage(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderPage(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public KeyPressesPage clickKeyPressPage(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HoversPage clickHoversPage(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
