package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class facebook{
	ChromeDriver driver;
	@BeforeTest(alwaysRun=true)
public void setup() {
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Parameters ({"email","password"})
	@Test
	public void testfb(String email,String password) throws InterruptedException 
	{
		Thread.sleep(3000);
		WebElement ema=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		ema.sendKeys(email);
		
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		pass.sendKeys(password);
		
	}
	
}
