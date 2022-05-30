package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By hotspot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickContextMenu(){
        new Actions(driver).contextClick(driver.findElement(hotspot)).perform();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
}
