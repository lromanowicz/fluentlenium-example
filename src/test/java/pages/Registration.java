package pages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

@PageUrl("/signup.html")
public class Registration extends FluentPage {

    @Page
    private Confirmation confirmationPage;

    @FindBy(linkText = "Submit")
    private FluentWebElement submitButton;

    public Registration fillInForm(String... parameters) {
        $("input").fill().with(parameters);
        return this;
    }

    public Confirmation submitForm() {
        submitButton.click();
        return confirmationPage;
    }
}
