package testBase;

import org.testng.annotations.Test;

import pageObject.MyAccount;
import pageObject.Register;

public class TC_001_RegisterClass extends BaseClass{

	@Test(groups={"Sanity","Regrition"})
	public void TC_001_Register() throws InterruptedException 
	{
		logger.info("Start the test from beganing ");
		MyAccount ma= new MyAccount(driver);
		ma.setmyAccount();
		logger.info("Click to my Account ");
		ma.setregister();
		logger.info("then click to register ");
		
		Register rs=new Register(driver);
		logger.info("egister all the customer info \");");
		rs.setFirstName(randomStringAlphabat());
		rs.setLastName(randomStringAlphabat());
		rs.setemail(randomstrAndNum());
		rs.setPhone(randomStringNum());
		rs.setPassword(randomstrAndNum());
		rs.setConPassword(randomstrAndNum());
		rs.setSubscribe();
		rs.setPrivacy();
		Thread.sleep(5000);
		rs.setConyinue();
	}
}
