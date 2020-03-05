package Demogit.FaceBookDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

	LoginPage loginpage=new LoginPage();
	@BeforeMethod
	
	public void LaunchBrowser()
	{
		OpenApplication();
		
	}
	
	
	@Test
	public void LoginToApplication() throws Throwable
	{
		
		loginpage.LoginToFacebook("vinuthakj95@gmail.com", "harshuvinu");
		loginpage.EnterMsg("Hello");
		
	}
	
	
	@AfterMethod
	
	public void CloseBrowser()
	{
		CloseApplication();
	}
	
	
}
