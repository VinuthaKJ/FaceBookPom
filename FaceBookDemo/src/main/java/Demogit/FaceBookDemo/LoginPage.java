package Demogit.FaceBookDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

	@FindBy(xpath="//input[@id='email']")
	WebElement EmailTxtbox;
	
	@FindBy(id="pass")
	WebElement PWDTxtbox;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//div[contains(@aria-label,'Write something here...')]")
	WebElement WriteTextbox;
	
	@FindBy(xpath="//span[text()='Post']/parent::button")
	WebElement PostBtn;
	
	 LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	 
	 public void LoginToFacebook(String username, String Password)
	 
	 {
		 
		 EmailTxtbox.sendKeys(username);
		 PWDTxtbox.sendKeys(Password);
		 LoginBtn.click();
		 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		 driver.navigate().refresh();
	 }
			 
	public void EnterMsg(String PostMsg) throws Throwable
	{
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].ScrollIntoview();", WriteTextbox);
		js.executeScript("arguments[0].Click();", WriteTextbox);
		WriteTextbox.sendKeys(PostMsg);
		PostBtn.click();	
		
	}
			 
	 
	 
	 
}
