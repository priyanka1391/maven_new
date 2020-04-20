package generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class FileManager 
{
Properties pro;
public FileManager()
{
	try
	{
		FileInputStream fis=new FileInputStream("./configuration.properties");
		pro=new Properties();
		pro.load(fis);
	}
catch(Exception e)
	{
	Reporter.log("property file is not found", true);
	
	}
}
	
	
	
	
	

public String get_FlipkartURL()
{
	String url=pro.getProperty("flipkart");
	if (url==null)
    throw new RuntimeException("url not found");
	return url;
}
public String get_AmazonURL()
{
	String url=pro.getProperty("amazon");
	if(url==null)
		throw new RuntimeException("url not found");
	return url;
	

}
public String get_MyntraURL()
{
	String url=pro.getProperty("Myntra");
	if(url==null)
		throw new RuntimeException("url not found");
	return url;

}
}
