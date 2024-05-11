package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAndSignupPage {
	//Variable-private->WebElement
  @FindBy(xpath=("//input[@id='email']"))
  private WebElement userName;
  
  @FindBy(xpath=("//input[@id='pass']"))
  private WebElement password;
  
  @FindBy(xpath=("//button[@id='u_0_5_jh']"))
  private WebElement loginButton;
  
  @FindBy(xpath=("//a[text()='Create new account']"))
  private WebElement createNewAcc;
  
  //Constructor-private->WebElement initialize
  public LoginAndSignupPage(WebDriver Driver)
  {
	  PageFactory .initElements(Driver,this);
  }
  //Method-public->Action on WebElement
  public void sendUserName(String userId) {
	  userName.sendKeys(userId);
  }
  public void sendPassword(String userPassword) {
	  password.sendKeys(userPassword);
  }
  public void clickOnLoginButton() {
	  loginButton.click();
  }
  public void clickOnCreateNewAccButton() {
	  createNewAcc.click();
  }
  public void login() {
	  userName.sendKeys("archana115@gmail");
	  password.sendKeys("2345678");
	  loginButton.click();
	  
  }
  
	               

}
//button[@id='u_0_5_jh']