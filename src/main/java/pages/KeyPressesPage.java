package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private final WebDriver driver;
    private final By inputField = By.id("target");
    private final By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public String getInputText(){
        return driver.findElement(inputField).getText();
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }

    public void enterNote(){
        enterText(Keys.chord(Keys.ALT, Keys.NUMPAD1, Keys.NUMPAD4));
    }
}
