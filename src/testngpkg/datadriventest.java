package testngpkg;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datadriventest {
WebDriver driver; 
	String baseurl="https://www.facebook.com";
	
	
	@BeforeTest
	public void Setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void datadriventest()   throws Exception
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\USER");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("sheet1");
		int r=sh.getLastRowNum();
		for(int i=1;i<=r;i++)
		{
			String email=sh.getRow(i).getCell(0).getStringCellValue();
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("email="+email+"password="+pswd);
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.id("pass")).sendKeys(pswd);
			driver.findElement(By.name("login")).click();
			driver.navigate().refresh();
			}
	}
}
