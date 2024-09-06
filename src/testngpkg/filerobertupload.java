package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class filerobertupload {

	WebDriver driver; 
	String baseurl="https://www.ilovepdf.com/word_to_pdf";
	
	
	@BeforeTest
	public void Setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl); 
	}
	@Test
	public void fileuploadpgm() throws AWTException
	{
		WebElement  up=driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span"));
		up.click();
		fileupload("C:\\Users\\USER\\Documents\\java qns.docx ");
			
	}
	public void fileupload(String p) throws AWTException 
	{
		StringSelection strselection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		Robot robot =new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
