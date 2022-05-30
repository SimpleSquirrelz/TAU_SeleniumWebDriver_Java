package frames;

import base.BaseTests;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg() {
        WysiwygEditorPage editorPage = homePage.clickWysiwygEditorPage();
        editorPage.clearTextArea();
        String text1 = "Hello ";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.increaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text from editor is incorrect");
    }
}
