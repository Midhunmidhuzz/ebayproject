package page;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ebaypage {
	WebDriver driver;
	
				
			@FindBy(xpath="//*[@id=\"gh-ac\"]")
			WebElement search;
			@FindBy(xpath="//*[@id=\"gh-btn\"]")
			WebElement clicksearch;
			@FindBy(xpath="//*[@id=\"item52285ba2fa\"]/div/div[1]/div/a/div/img")
			WebElement clicktoy;
			
			
			public ebaypage(WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements( driver,this);
			}
		public void set1()
		{    
			search.sendKeys("toys",Keys.ENTER);
			clicksearch.click();
			clicktoy.click();
			 
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.ScrollBy0,2000)","");
		}    
				
	
}
