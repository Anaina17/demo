package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ebay {                              //move to element
	WebDriver driver;
	String baseurl="https://www.ebay.com";
	
	@BeforeTest
	public void Setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl); 
	
	}
	@Test
	public void test()
	{
		
		WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//driver.manage().timeouts().implicitlyWait(Duration.ofseconds(20);
	WebElement  a=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a "));
	Actions act=new Actions(driver);
	act.moveToElement(a);
	act.perform();
	Wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a ")));act.click();
}
	//WebElement  a1=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a "));a1.click();
}

