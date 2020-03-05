package Demogit.FaceBookDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public WebDriver driver;
	public void OpenApplication()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		
		
	}
	
	public void CloseApplication()
	{
		driver.quit();
	}
	
	
}
