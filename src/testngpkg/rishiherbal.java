package testngpkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rishiherbal {
	
	
	


		
		WebDriver dvr;
		String baseurl="https://rishiherbalindia.linker.store/";
		private TakesScreenshot agriculture;
		
		@BeforeTest
		
		public void start()
		{
			dvr = new ChromeDriver();
			dvr.get(baseurl);
			dvr.manage().window().maximize();
		}
		
		@Test(priority = 1)
		
		public void test()
		{
			WebElement logo= dvr.findElement(By.xpath("//*[@id=\"logo\"]/a/img"));
			if(logo.isDisplayed())
			{
				System.out.println("Logo is displayed");
			}
			else
			{
				System.out.println("Logo is not displayed");
			}
				
		}
		
		@Test(priority = 2)
		
		public void test2()
		{
			dvr.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
			WebElement sortby=dvr.findElement(By.xpath("//*[@id=\"input-sort\"]"));
			Select slct=new Select(sortby);
			slct.selectByVisibleText("Price (Low > High)");
			
			
			
		}
		
		@Test(priority = 3)
		
		public void agripresent()
		{
			WebElement agri=dvr.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[7]/a"));
			if(agri.isDisplayed())
			{
				System.out.println("Agriculture is present");
			}
			else 
			{
				System.out.println("Agriculture is not present");
			}
		}
		
		
		@Test(priority = 4)
		
		public void scrnsht() throws IOException
		{
			WebElement agriscrsht=dvr.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[7]/a"));
			File agricul=agriscrsht.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(agricul, new File("shot_16-8-2024_93215_rishiherbalindia.linker.store.JPEG File (.jpeg)"));

		
		

	
			
			
			
		
		
				   

	}
		
}




