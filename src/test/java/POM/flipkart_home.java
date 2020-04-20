package POM;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class flipkart_home extends Base_page
{

	@FindBy(xpath="(//span[@class='_1QZ6fC _3Lgyp8'])[4]")
	private WebElement womens;

@FindBy(xpath="//a[.='Make Up']")
private WebElement makeup;


public flipkart_home(WebDriver driver)
{
	super(driver);
}
public void mouseoveronwomen()
{
	verifyVisibility(5,womens);
	
	new Actions(driver).moveToElement(womens).build().perform();
}
public void clickmakeup()
{
	clickable( 5, makeup);
	makeup.click();
}
}
	


