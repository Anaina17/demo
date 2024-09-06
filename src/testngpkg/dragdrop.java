package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dragdrop {

	
		
		WebDriver driver;
		String url=" https://demo.guru99.com/test/drag_drop.html";
		@BeforeTest
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		@Test
		public void test()
		{
			WebElement amount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a " ));
			WebElement dedit_amount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
			Actions act=new Actions(driver);
			act.dragAndDrop(amount, dedit_amount).perform();
			
			
			WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
			WebElement debit_acc=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
			act.dragAndDrop(bank, debit_acc).perform();
			
			
			WebElement sale=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
			WebElement credit_acc=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
			act.dragAndDrop(sale, credit_acc);
			
			
			WebElement credit_amount=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
			act.dragAndDrop(amount, credit_amount).perform();
			
			
			String str="Perfect!";
			String str1=driver.getPageSource();
			if(str1.contains(str))
			{
				System.out.println("......Passed.....");
			}
			else
			{
				System.out.println(".....Failed....");
			}
			
		}
		
		@AfterTest
		public void close()
		{
			driver.quit();
		}

	}
	

