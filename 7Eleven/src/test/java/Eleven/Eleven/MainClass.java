package Eleven.Eleven;


import org.openqa.selenium.By;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

@Test
public class MainClass {
	
	WebDriver driver;
	


	
	public void main() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sidra\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	     driver.get("https://www.7-eleven.com/");
		driver.manage().window().maximize();
	
	
	Utilities Eleven=new Utilities(driver);
		Eleven.getFood().click();
		Eleven.getBakery().click();
		
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,1000)");
		
		Eleven.getMiniDonut().click();
		
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		   js1.executeScript("window.scrollBy(0,100)");
		
		Eleven.getorder().click();
		Thread.sleep(3000);
	
		
		String parentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(parentWindowHandle);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		
	
		
		
		
}
		
		
	
	
		
		
		

}



