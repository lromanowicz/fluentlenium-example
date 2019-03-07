package tests;

import org.fluentlenium.core.annotation.Page;
import org.testng.annotations.Test;
import pages.Registration;

public class RegistrationTest extends  Base {

	@Page
	private Registration registrationPage;

	@Test
	public void testRegistration() {
		goTo(registrationPage)
			.fillInForm("username", "email@email.com", "password", "password")
			.submitForm()
			.assertIsPageHeaderCorrect();
	}
}
