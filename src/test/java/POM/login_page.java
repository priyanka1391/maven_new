package POM;

import generic.Base_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class login_page extends Base_page
{
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	 private WebElement email;
	 
	 @FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	 private WebElement password;
	 
	 @FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	 private WebElement login;
	 
	 @FindBy(xpath="//span[.='Your username or password is incorrect'])[1]")
	 private WebElement errmsg;
	 

	 public login_page(WebDriver driver)
		{
			super(driver);
		}
		
	 public void setmail1(String emailid)
		{
		 email.sendKeys(emailid);
		}
		
		public void setpassword(String pwd)
		{
			password.sendKeys(pwd);
		}
		
		public void verifyErrmsg()
		{
			verifyElement(5, errmsg);
		}
		
		
	
		public void clickLogin()
		{
			login.click();
		}
	
}
