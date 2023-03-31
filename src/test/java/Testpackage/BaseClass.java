package Testpackage;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testutilitypackage.Screenshot;
import testutilitypackage.StaticBrowser;



public class BaseClass {
	static WebDriver driver;
	public static ExtentReports report;
	public static ExtentHtmlReporter extent;
	public static ExtentTest Logger;
	@Parameters({"browser"})
	@BeforeTest
	 public void beforeTest(String browser)
	{ 
	    report= new ExtentReports();
	    extent = new ExtentHtmlReporter("test-output"+File.separator+"Report"+File.separator+"HrmThread"+System.currentTimeMillis()+".html");
		report.attachReporter(extent);
		
	   driver= StaticBrowser.openbrowser(browser, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   this.driver=driver;
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
   @AfterMethod
   public void aftermethod(ITestResult result) throws IOException
   { 
	   if(result.getStatus()==ITestResult.FAILURE)
	   {
	       String  path =Screenshot.CapturepageScreenshot(driver);
	 Logger.fail("Test case is failed",  MediaEntityBuilder.createScreenCaptureFromPath(path).build());
	   }
	   report.flush();
   }
   
	@AfterTest
    public void aftertest()
    {
		driver.quit();
	}
	
	
}	
	
	
	
	
/*	
	
if(result.getStatus()==ITestResult.FAILURE)
{
 Screenshot.CapturepageScreenshot(driver); 
}*/
	
	
	

