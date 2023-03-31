package Testpackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pompackage.LogInPage;
import testutilitypackage.ReadFileData;
import testutilitypackage.Screenshot;
import testutilitypackage.StaticBrowser;
import Testpackage.BaseClass;



public class LoginTestClass extends BaseClass  {
	   LogInPage  login;
	   ReadFileData r;
	
   @BeforeClass
   public void beforeclass()
   {   //driver= StaticBrowser.openbrowser(browser, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	                   
	// System.setProperty("webdriver.edge.driver", "src\\test\\resources\\driver\\msedgedriver.exe");
	//  this.driver= new EdgeDriver();
	//  Thread.sleep(3000);
	// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   login= new LogInPage(driver);
   }
  @BeforeMethod
  public void beforemethod()
  { 
	  System.out.println("beforermethod of class1"); 
  }
   @Test
  public void Verifyloginpagefunctionalitywithcorrectdata() throws EncryptedDocumentException, IOException
	{ 
	 Logger=report.createTest("Verifyloginpagefunctionalitywithcorrectdata");
	             login.sendUsername(r.FetchDataFromExcel(2, 1));
	             login.sendPassword(r.FetchDataFromExcel(1, 1));
	             login.ClickOnLoginButton();
	             Logger.pass("Test case is passed");
	}        
	@Test
	public void Verifyloginpagefunctionalitywithincorrectdata ()
	{    Logger=report.createTest("Verifyloginpagefunctionalitywithincorrectdata");
		 login.sendUsername("Admin");
         login.sendPassword("admin1234");
         login.ClickOnLoginButton();
    	
  
	}
	@Test
	public void best3()
	{ 
		System.out.println("best3");
	}
	@AfterMethod
	public void aftermetod()
	{ 
		System.out.println("aftermethod of class1");
	}
	
 
  @AfterClass
	public void afterclass()
	{ 
		System.out.println("AfterClass");
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

