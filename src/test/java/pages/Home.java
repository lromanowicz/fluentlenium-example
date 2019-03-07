package pages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

@PageUrl("")
@FindBy(linkText = "Sign up today")
public class Home extends FluentPage {

    @FindBy(css = ".cnt-title > h1")
    private FluentWebElement pageHeader;

    public void assertIsPageHeaderCorrect() {
        String expectedHeader = "At vero eos et accusamus et iusto odio dignissimos";
        assertEquals(pageHeader.text(), expectedHeader);
    }
}
