package testutilitypackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static String CapturepageScreenshot(WebDriver driver) throws IOException
	{//"C:\\Users\\Netizens\\eclipse-workspace\\OrangeHRM\\
		String r=System.getProperty("user.dir");
		System.out.println(r);
		
	String path=System.getProperty("user.dir")+File.separator+"test-output"+File.separator+"Screenshot"+File.separator+System.currentTimeMillis()+".png";
   File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   File dest= new File(path);
   FileHandler.copy(source, dest);
	return path;
	  
	}
	
}
