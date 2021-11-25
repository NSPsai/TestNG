package Test;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestngClass {
	
	@Test
	public void runTestOnDocker() throws Exception {
		DesiredCapabilities dcap = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		dcap.setCapability(ChromeOptions.CAPABILITY, options);
		dcap.setCapability("enableVNC", true);
		dcap.setBrowserName("chrome");
		dcap.setVersion("61.0");

//		String driverPath = <chromedriver path on your machine>;
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url ,dcap);

		// Get URL
		driver.get("https://www.google.com/");
		// Print Title
		System.out.println(driver.getTitle());
	}

}
