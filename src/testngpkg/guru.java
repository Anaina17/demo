package testngpkg;





	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class guru {

		WebDriver driver;
		String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
		
		@BeforeTest
		public void Setup()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
			
		}
		@Test
		public void test()
		{
			WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
			Actions act=new Actions(driver);
			act.contextClick(right);
			act.perform();
			WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
			act.keyDown(edit,Keys.CONTROL).doubleClick();
			act.perform();
			Alert a=driver.switchTo().alert();
			a.accept();
			act.perform();
			WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
			act.doubleClick(doubleclick);
			act.perform();
			Alert ab=driver.switchTo().alert();
			System.out.println(ab.getText());
			ab.accept();
			
			
		}

	}

		
		
		
	
	

