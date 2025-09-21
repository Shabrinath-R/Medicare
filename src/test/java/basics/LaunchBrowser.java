package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;



class LaunchBrowser {
@Test
	public void launchBrowser() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Reporter.log(driver.getTitle(), true);
		driver.quit();

	}
}