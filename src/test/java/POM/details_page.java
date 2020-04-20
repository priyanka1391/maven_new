package POM;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class details_page extends Base_page
{
@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
private WebElement addtocart;

public details_page(WebDriver driver)
{
   super(driver);

}

public void clickaddtokartbutton(WebDriver driver)
{
	
	clickable(5, addtocart);
	addtocart.click();
}
}
