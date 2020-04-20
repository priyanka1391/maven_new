package Regeression_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.login_page;
import generic.Excel;
import generic.Generic_test;

public class invalidlogin extends Generic_test
{
@Test
public void invalidLogin()
{
	String emailid=Excel.getData("sheet1",1,2);
	String pwd=Excel.getData("sheet1",1,2);
	String eTitle=Excel.getData("sheet1",0,1);
	

	test=reports.createTest("invalidlogin", "user enters invalid credentials in order to login");
	
	test.info("invalidlogin test has started");
	
	login_page lp=new login_page(driver);
    lp.setmail1(emailid);	
    test.pass("successfully entered emailid");
    lp.setpassword(pwd);
    test.pass("successfully entered password");
    lp.clickLogin();
    test.pass("successfully clicked on login");
    lp.verifyErrmsg();
	test.pass("error message displayed");
    lp.verifyTitle(5, "flipkart");
    Assert.assertEquals(driver.getTitle(), eTitle);
	test.pass("title verified successfully");
	test.info("test ended");     
}
}

