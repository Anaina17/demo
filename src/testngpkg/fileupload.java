package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileupload {
	WebDriver driver;
	String baseurl="https://demo.guru99.com/test/upload/";
	
	@BeforeTest
	public void Setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl); 
	}
	@Test
	public void test()
	{
		WebElement  right=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"] "));
		
         right.sendKeys("C:\\Users\\USER\\Documents\\ANAINA KS .pdf");
         Actions act=new Actions(driver);
         act.perform();
		WebElement click=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		click.click();
		WebElement  sub=driver.findElement(By.xpath("//*[@id=\"submitbutton\"] "));
		sub.click();
	}
	
}
