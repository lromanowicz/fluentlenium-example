package pages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.withText;

@PageUrl("/contact.html")
public class Contact extends FluentPage {

	private FluentWebElement name;
	private FluentWebElement email;
	private FluentWebElement content;

	@Override
	public void isAt() {
		assertThat(window().title()).contains("Contact us");
	}

	public Contact fillInAndSubmitForm(String name, String email, String message) {
		this.name.fill().with(name);
		this.email.fill().with(email);
		content.fill().with(message);
		el("[type=\"submit\"]").click();
		return this;
	}

	public void assertIsMessageSent() {
		await()
			.pollingEvery(4, TimeUnit.SECONDS)
			.until($(".message > h3", withText("Your message has been sent.")))
			.present();

		assertThat(el(".message > h3").text()).isEqualTo("Your message has been sent.");
	}
}
