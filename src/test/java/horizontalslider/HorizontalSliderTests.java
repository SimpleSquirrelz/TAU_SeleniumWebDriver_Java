package horizontalslider;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testArrows(){
        var sliderPage = homePage.clickHorizontalSliderPage();
        sliderPage.moveSlider(Keys.ARROW_RIGHT);
        sliderPage.moveSlider(Keys.ARROW_RIGHT);
        sliderPage.moveSlider(Keys.ARROW_RIGHT);
        Assert.assertEquals(sliderPage.getSliderValue(),"1.5","Slider value is incorrect");
        sliderPage.moveSlider(Keys.ARROW_LEFT);
        Assert.assertEquals(sliderPage.getSliderValue(),"1","Slider value is incorrect");
    }
}
