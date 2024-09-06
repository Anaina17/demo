package pkg;
import org.openqa.selenium.chrome.ChromeDriver;
public class webdriverdemo {

	public static void main(String[] args) {
		 
		//chromedriver
		 //firefoxdriver
		//edgedriver
		
		
		ChromeDriver driver=new ChromeDriver();            //open browser
		driver.get("https://www.google.com");                //launch application  
		String title=driver.getTitle();
		
		System.out.println("title="+title);
		driver.quit();                                  
	}
                                                             // NB : get and quit difference interview Qns
}
