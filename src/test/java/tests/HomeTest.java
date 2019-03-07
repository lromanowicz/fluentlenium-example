package tests;

import org.fluentlenium.core.annotation.Page;
import org.testng.annotations.Test;
import pages.Home;

public class HomeTest extends Base {

	@Page
	private Home homePage;

	@Test
	public void testHome() {
		goTo(homePage)
			.assertIsPageHeaderCorrect();
	}
}
