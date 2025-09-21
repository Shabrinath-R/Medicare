package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class LaunchBrowser{
	public static void main(String [] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qspiders.com");
		Reporter.log(driver.getTitle(),true);
		
		
	}
}