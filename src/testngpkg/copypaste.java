package testngpkg;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class copypaste {
WebDriver driver;
String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
			
}
@Test
public void test()
{
	WebElement fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	
	WebElement reddiffid=driver.findElement(By.	xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	fullname.sendKeys("abcd");
	Actions act=new Actions(driver);
	act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	act.keyDown(reddiffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	act.perform();
}
	
}
