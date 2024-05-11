package TestFb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.LoginAndSignupPage;

public class FacebookLogin {
	
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Before Class");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void launchForgotPasswordPage() {
		driver.get("https://www.facebook.com");
		LoginAndSignupPage LoginAndSignupPage=new LoginAndSignupPage(driver);
		LoginAndSignupPage.sendUserName("ArchanaDhage77");
		LoginAndSignupPage.sendPassword("1234567");
		LoginAndSignupPage.clickOnCreateNewAccButton();
		
	}

}
