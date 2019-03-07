package pages;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.By;

import static org.testng.AssertJUnit.assertEquals;

public class Confirmation extends FluentPage {

    public void assertIsPageHeaderCorrect() {
        String expectedText = "Thank you for registration";
        assertEquals(el(By.tagName("h2")).text(), expectedText);
    }
}
