package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.fluentlenium.adapter.testng.FluentTestNg;
import org.fluentlenium.configuration.ConfigurationProperties;
import org.fluentlenium.configuration.FluentConfiguration;
import org.testng.annotations.BeforeClass;

@FluentConfiguration(
	baseUrl = "http://jacekokrojek.github.io/jak-to-zrobic-w-js/",
	implicitlyWait = 5000,
	screenshotPath = "src/test/resources",
	screenshotMode = ConfigurationProperties.TriggerMode.AUTOMATIC_ON_FAIL
)
public class Base extends FluentTestNg {
	@BeforeClass
	protected void setUp() {
		WebDriverManager.firefoxdriver().setup();
		setWebDriver("firefox");
	}
}