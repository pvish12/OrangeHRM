package Testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGclass1 {

	@BeforeClass
	public void beforeclass()
	{ 
		System.out.println("BeforeClass");
	}
  @BeforeMethod
  public void beforemethod()
  { 
	  System.out.println("BeforeMethod");
  }
	@Test(priority=0)
	public void sample2()
	{ 
		System.out.println("sample2");
	}
	@Test(priority=1,invocationCount=2)
	public void sample1()
	{ 
		System.out.println("sample1");
	}
	@Test(priority=1)
	public void best3()
	{ 
		System.out.println("best3");
	}
	
	
  @AfterMethod
  public void aftermethod()
  { 
	  System.out.println("AfterMethod");
  }
	
  @AfterClass
	public void afterclass()
	{ 
		System.out.println("AfterClass");
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

