package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.*;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BaseClass {

	public static WebDriver driver;
	public Logger logger;
	public ResourceBundle rb;
	@Parameters("browser")
	@BeforeClass(groups= {"Sanity","Regrition"})
	public void setUp(String br ) 
	{
		rb= ResourceBundle.getBundle("config");
		logger=LogManager.getLogger(this.getClass());
		
		if(br.equals("chrome")) {
			driver=new ChromeDriver();
		}else if (br.equals("edge")) 
		{
			driver=new EdgeDriver();
		}else
			driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get(rb.getString("appurl"));
		driver.manage().window().maximize();
		
	}
	@AfterClass(groups= {"Sanity","Regrition"})
	public void tearDown () 
	{
		driver.quit();
	}
	
	public String randomStringAlphabat() 
	{
		 String randomstr=RandomStringUtils.randomAlphabetic(5);
		 return randomstr;
	}
	public String randomStringNum() 
	{
		String randomnum=RandomStringUtils.randomAlphanumeric(9);
		return randomnum;
	}
	public String randomstrAndNum() 
	{
		try {
		String str = RandomStringUtils.randomAlphabetic(6);
		String num = RandomStringUtils.randomNumeric(10);
		return str+"@"+num;
	}catch(Exception e) 
	{
		e.getMessage(); 
	}
		return null;
	}
	
	public String captureScreen (String name) throws IOException 
	{
		String date = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File source=screenShot.getScreenshotAs(OutputType.FILE);
		String destanition =System.getProperty("user.dir")+"//screenShots//"+name+date+".png";
		try {
		FileUtils.copyFile(source, new File (destanition));
		}catch (Exception e) 
		{
			e.getMessage();
		}
		return destanition;
	}
	
	
}

