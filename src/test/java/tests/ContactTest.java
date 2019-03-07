package tests;

import org.fluentlenium.core.annotation.Page;
import org.testng.annotations.Test;
import pages.Contact;

public class ContactTest extends Base {
	@Page
	private Contact contactPage;

	@Test
	public void testContact() {
		goTo(contactPage)
			.fillInAndSubmitForm("somename", "email@email.com", "blablalbalbalbal")
			.assertIsMessageSent();
	}
}
