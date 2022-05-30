package alerts;

import base.BaseTests;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        FileUploadPage uploadPage = homePage.clickFileUploadPage();
        uploadPage.uploadFile("D:\\TestAutomationUniversity\\SeleniumWebDriverWithJava\\drivers\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe","Uploaded files are incorrect");
    }
}
