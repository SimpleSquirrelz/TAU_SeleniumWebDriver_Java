package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropdownPage = homePage.clickDropdown();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option),"Option is not selected");
    }
}
