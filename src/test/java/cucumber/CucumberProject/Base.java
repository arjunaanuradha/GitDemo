package cucumber.CucumberProject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public static WebDriver driver;
	public static Properties prop;
	
	public WebDriver initialiseDriver() throws IOException
	{
		prop = new Properties();
//      Properties is a Java Class
		
		FileInputStream file = new FileInputStream("C:\\Users\\arjun\\eclipse-workspace\\CucumberProject\\src\\test\\java\\cucumber\\CucumberProject\\globalData.properties");
//		FileInputStream is a Java Class		
		
		prop.load(file);
//      load is a Java Method which calls globalData.properties file	

    	System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
    	driver = new ChromeDriver();
    	
    	driver.get(prop.getProperty("url"));  
    	return driver;
	}

}
