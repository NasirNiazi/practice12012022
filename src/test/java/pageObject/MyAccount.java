package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage1{

	public MyAccount(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath="//span[text()='My Account']")
		WebElement myAccount;
	   
		@FindBy(xpath="//a[text()='Register']")
		WebElement register;
		@FindBy(xpath="(//a[normalize-space()='Login'])[1]")
		WebElement login;
		
		
		public void setmyAccount() 
		{
			myAccount.click();
		}
		public void setregister() 
		{
			register.click();
		}
		public void clickLogin() 
		{
			login.click();
		}
		
	

}
