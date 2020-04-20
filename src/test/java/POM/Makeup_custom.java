package POM;

import generic.Base_page;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Makeup_custom extends Base_page
{


			@FindBy(xpath="//div[@data-id='CMPEFKWCVB7T2YDZ']")
			private WebElement compact;

			@FindBy(xpath="//div[@data-id='KJLF7VNFP2KXUCVQ']")
			private WebElement eyeliner;
		
			@FindBy(xpath="//div[@data-id='FRNEGG5M27YQ99MU']")
			private WebElement compact1;
			
			@FindBy(xpath="//div[@data-id='LSKEJ28M82EUZY29']")
			private WebElement lipstick;
			
			
			public Makeup_custom(WebDriver driver)
			{
				super(driver);
			}
			

			public void compact()
			{	
			clickable(5,compact);
			compact.click();
        Set<String> allwindow = driver.getWindowHandles();
				for (String str : allwindow)
				{
					driver.switchTo().window(str);
					
				}
				
}
			

			public void lipstick()
			{
				clickable(5,lipstick);
				lipstick.click();
				Set<String> allwindow = driver.getWindowHandles();
				for (String str : allwindow)
				{
					driver.switchTo().window(str);
					
				}
			}
				
				
				public void compact1()
				{
				  clickable(5,compact1);
					compact1.click();
					Set<String> allwindow = driver.getWindowHandles();
					for (String str : allwindow)
					{
						driver.switchTo().window(str);
					}
				}
				
				
				public void eyeliner()
				{
					clickable(5,eyeliner);
					eyeliner.click();
					Set<String> allwindow = driver.getWindowHandles();
					for (String str : allwindow)
					{
						driver.switchTo().window(str);
						
					}
				}
	}

