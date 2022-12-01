package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginToMyAccount extends BasePage1{
 public LoginToMyAccount(WebDriver driver) 
 {
	 super(driver); 
 }
 
 @FindBy(id="input-email")
 WebElement email;
 @FindBy(id="input-password")
 WebElement password;
 @FindBy(xpath="(//input[@value='Login'])[1]")
 WebElement loginbtn;
 
 public void setEmail(String eml) 
 {
	 email.sendKeys(eml);
 }
 public void setPassword(String pwd) 
 {
	 password.sendKeys(pwd);
 }
 public void clickLoginButton() 
 {
	 loginbtn.click();
 }
}
