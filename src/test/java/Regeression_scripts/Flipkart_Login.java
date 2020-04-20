package Regeression_scripts;
import generic.Generic_test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.Makeup_custom;
import POM.details_page;
import POM.flipkart_home;
import POM.login_page;

public class Flipkart_Login extends Generic_test
{
	@Test(dataProvider="DataBank")
	
	public  void login(String emailid,String pwd) throws Exception
	{
test=reports.createTest("Flipkart_Login", "user entered valid credential");
test.info("flipkart test started");


		login_page flogin = new login_page(driver);
		flogin.setmail1(emailid);
		test.pass("user succesfully entered email_id");
		flogin.setpassword(pwd);
		test.pass("user succesfully entered password");
		flogin.clickLogin();
		test.pass("user succesfully clicked on login");
		Thread.sleep(3000);
		

	    flipkart_home page=new  flipkart_home(driver);
		page.mouseoveronwomen();
	    page.clickmakeup();
	    test.pass("user clicked on makeup ");
	   
	    Makeup_custom Mpage = new Makeup_custom(driver);
	    Mpage.eyeliner();
	    test.pass("user selects eyeliner");
	    
//	    details_page Dpage = new details_page(driver);
//	    Dpage.clickaddtokartbutton(driver);
//	    test.pass("user clicked oon add to cart");
//	      
	    test.info("flipkart test ended");
	    }
	
	
	@DataProvider(name="DataBank")
	public Object[][] getData()
	{
	
		Object[][] arrbj= generic.DataProvider.getData("Sheet1");
		 return arrbj;
		 
	}
		
	}

