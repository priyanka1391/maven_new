package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class Base_page
{
	public WebDriver driver;
	public Base_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyVisibility(int time,WebElement element)
	{
	   WebDriverWait wait=new WebDriverWait(driver,time);
	
	     try
	     {
		    wait.until(ExpectedConditions.visibilityOf(element));
		    Reporter.log("element located", true);
		 }
	     catch(Exception e)
	     {
	         Reporter.log("element located", true);
		     Assert.fail();
	      }
	 }

	
	public void clickable(int time,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,time);
		
	    try
	    {
         wait.until(ExpectedConditions.elementToBeClickable(element));
         Reporter.log("clicked element ", true);

	     }
	     catch(Exception e)
	     {
	      Reporter.log("clicked  element", true);
		  Assert.fail();
        	}
	}
	
	public void verifyTitle(int time, String title)
	{
		WebDriverWait wait= new WebDriverWait(driver,time);
		
		try
		{
			wait.until(ExpectedConditions.titleContains(title));
		    Reporter.log("title Displayed", true);
		}
		catch(Exception e)
		{
		    Reporter.log("title Displayed", true);
		    Assert.fail();
	     }
	}
	
	public void locatelement(int time,By xpath)
	{
		WebDriverWait wait=new WebDriverWait(driver,time);
	 
		try
		{
		
			wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
		    Reporter.log("absence of locator", true);
		}
		catch(Exception e)
		{
			Reporter.log("absence of locator", true);
			Assert.fail();
		}
	}

	public void windows(WebDriver driver,int time,int wn )
	{
		WebDriverWait wait=new WebDriverWait(driver,time);
		
		try
		{
		   wait.until(ExpectedConditions.numberOfWindowsToBe(wn));
		   Reporter.log("count of windows not available", true); 
		}
		catch(Exception e)
		{
		  Reporter.log("count of windows not available", true); 		
		  Assert.fail();
		  
		}

}
	public void verifyElement(int seconds,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, seconds);
		
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element found",true);
		}
		catch(Exception e)
		{
		Reporter.log("Element not found",true);
		Assert.fail();
		}
	}
}