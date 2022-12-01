package testBase;

import org.testng.annotations.Test;

import pageObject.LoginToMyAccount;
import pageObject.MyAccount;

public class TC_002_LoginToMyAccount extends BaseClass{

	@Test
	public void tc_002_login() 
	{
		
		MyAccount my= new MyAccount(driver);
		my.setmyAccount();
		my.clickLogin();
		
		LoginToMyAccount la=new LoginToMyAccount(driver);
		logger.info("Login to my Account ");
		la.setEmail(rb.getString("email3"));
		la.setPassword(rb.getString("password3"));
		la.clickLoginButton();
	}
}
