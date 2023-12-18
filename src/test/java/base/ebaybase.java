package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ebaybase {
	WebDriver driver;
	

	@BeforeTest
	public void cls()
	{
		driver = new  ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
	}
}
