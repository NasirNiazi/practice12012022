package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register extends BasePage1{
	public Register (WebDriver driver) 
	{
		super(driver);
	}
	
	By firstName = By.id("input-firstname");
	By lastName = By.id("input-lastname");
	By email = By.id("input-email");
	By phone = By.id("input-telephone");
	By password = By.id("input-password");
	By con_password= By.id("input-confirm");
	By subscribe = By.xpath("//input[@value='0']");
    By privacy =By.xpath("//input[@name='agree']");
	By contin = By.xpath("//input[@type='submit']");
	
	
	public void setFirstName (String name) 
	{
		driver.findElement(firstName).sendKeys(name);
	}
	public void setLastName(String lastn) 
	{
		driver.findElement(lastName).sendKeys(lastn);
	}
	public void setemail(String email1) 
	{
		driver.findElement(email).sendKeys(email1);
	}
	public void setPhone (String phone1) 
	{
		driver.findElement(phone).sendKeys(phone1);
	}
	public void setPassword (String pwd) 
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void setConPassword(String con) 
	{
		driver.findElement(con_password).sendKeys(con);
	}
	public void setSubscribe () 
	{
		driver.findElement(subscribe).click();
	}
	public void setPrivacy () 
	{
		driver.findElement(privacy).click();
	}
	public void setConyinue () 
	{
		driver.findElement(contin).click();
		
	}

}
