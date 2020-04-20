
package generic;

import java.io.IOException;
import java.util.Date;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Generic_test
{
	public WebDriver driver;
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	 Logger log=Logger.getLogger(Generic_test.class);
	
	BrowserFactory bff = new BrowserFactory();
	FileManager fm = new FileManager();

	
	@BeforeSuite
	public void setUp()
	{
	htmlreporter=new ExtentHtmlReporter("./Ereports/"+new Date().toString().replace(":","-")+".html");
	reports=new ExtentReports();
	reports.attachReporter(htmlreporter);
	}

	@Parameters({ "browser" })
    @BeforeMethod
    
public void OpenApp(@Optional("chrome") String browser) 
{
		System.out.println("browser name is"+browser);
		
		log.info("browser is launched");
		if (browser.equals("chrome")) {
			driver = bff.getBrowser("chrome");

			driver.get(fm.get_FlipkartURL());
		}

		else {
			driver = bff.getBrowser("firefox");

			driver.get(fm.get_FlipkartURL());
		}
		
}


@AfterMethod
public void closeAppn(ITestResult res) throws Exception 

{
	String tc_name = "";
	if (ITestResult.FAILURE == res.getStatus())
	{
		tc_name=res.getName();
    test.fail("test Scrpit failed", MediaEntityBuilder
			.createScreenCaptureFromPath(new ScreenShot().getPhoto(driver, tc_name)).build());
	}
	
	test.assignAuthor("Priyanka");
	test.assignDevice("Laptop");
	test.assignCategory("Gui Automation");
	reports.setSystemInfo("windows", "10")
	;
	driver.quit();
	log.info("browser is closed");
}
@AfterSuite
public void tearDown()
{
	reports.flush();
}


}
