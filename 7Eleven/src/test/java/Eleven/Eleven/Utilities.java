package Eleven.Eleven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Utilities {
	
WebDriver driver;
	
	
	
	public Utilities(WebDriver driver)
	{
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
       @FindBy(xpath="//a[.='Food']")
       private WebElement Food;
       
       @FindBy(xpath="//a[.='Bakery']")
    private  WebElement Bakery;

       @FindBy(xpath="//a[contains(.,'7-Select™ Mini Donuts')]")
       private WebElement MiniDonut;
       
       @FindBy(xpath="//a[contains(.,'Order Now')]")
       private WebElement order;
       
       @FindBy(xpath="//a[.='Drinks']")
       private WebElement Drink;
       
       
       
   	public WebElement getFood() 
   	{

   		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Food));
   	return Food;
   }  
     
   	public WebElement getBakery()
   	{
   		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Bakery));
		
   		return Bakery;
   	}
   	public WebElement getMiniDonut()
   	{
   		WebDriverWait wait=new WebDriverWait(driver,50);
   		wait.until(ExpectedConditions.visibilityOf(MiniDonut));
   	return MiniDonut;
   	}
	
   	public WebElement getorder()
   	{
   		return order;
   	}
   	
   	public WebElement getdrink()
	
   	{
   		return Drink;
   	}
	   

}
