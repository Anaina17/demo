package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngdemo {
    //@beforesuite                                 // this is annotation orders
	//@beforetest
	//@beforeclass
	//@beforemethod
	//@test
	//@aftermethod
	//@afterclass
	//@aftertest
	//@aftersuite
	
	
	
	
	@BeforeTest(alwaysRun=true)         //is used group time alwaysRun
	public void setup()
	{
		System.out.println("browser open");
	}
	@BeforeMethod(alwaysRun=true)                  // is used also group time
	public void urloading()
	{
		System.out.println("url loading");
	}
	@Test (groups = {"smoke"})                                                                        //(priority = 2,dependsOnMethods = {"test2"})                          // dependsOnMethods is
	public void test1()
	{
		System.out.println("test1");
		
	}
	@Test (groups = {"sanity","smoke"})                                                                               //(priority = 3,invocationCount = 3)                                  //invocationCount is 
	public void test2()
	{
		System.out.println("test2");
	}
	@Test (groups = {"regerssion","sanity"})                                                          //(priority = 1,enabled = false)                                            // enabled is means that not displayed 
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void aftrmthd()
	{
		System.out.println("after method");
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("quit browser");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
