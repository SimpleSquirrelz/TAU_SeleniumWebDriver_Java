package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {

    private final WebDriver driver;
    private final By bottomFrame = By.name("frame-bottom");
    private final By topFrame = By.name("frame-top");
    private final By leftFrame = By.name("frame-left");

    public void switchToBottomFrame(){
        driver.switchTo().frame(driver.findElement(bottomFrame));
    }

    public void switchToLeftFrame(){
        driver.switchTo().frame(driver.findElement(topFrame)).
                switchTo().frame(driver.findElement(leftFrame));
    }

    public String getFrameText(){
        return driver.findElement(By.tagName("body")).getText();
    }

    public void switchFromBottomFrame(){
        driver.switchTo().parentFrame();
    }

    public void switchFromTopFrame(){
        driver.switchTo().parentFrame().
                switchTo().parentFrame();
    }

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }
}
