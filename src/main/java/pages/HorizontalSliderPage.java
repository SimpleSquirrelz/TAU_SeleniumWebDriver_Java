package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer input");
    private By valueField =  By.cssSelector(".sliderContainer span");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveSlider(Keys k){
        driver.findElement(slider).sendKeys(k);
    }

    public String getSliderValue(){
        return driver.findElement(valueField).getText();
    }
}
