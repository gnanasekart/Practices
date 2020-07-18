package Collection;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class NewTest 
{
	WebDriver d;
	
	@BeforeMethod
	public void before()
	{
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
	}

	@Test
	public void f()
	{
		d.get("http://www.google.com");
		d.getTitle();
	}

	@AfterMethod
	public void after() 
	{
		d.quit();  
	}

}
