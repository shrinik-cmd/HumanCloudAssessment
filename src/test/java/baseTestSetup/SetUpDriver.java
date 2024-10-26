package baseTestSetup;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class SetUpDriver 
{
	public static WebDriver driver;
	public Properties p;
	
	@BeforeClass()
	@Parameters({"OS","Browser"})
	public void setup(String OS, String Browse) throws Exception 
	{
		// Loading config.properties File
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		switch(Browse.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver(); break;
		case "edge":driver=new EdgeDriver(); break;
		case "firfox":driver=new FirefoxDriver(); break;
		default:System.out.println("Invalid browser name...");
		return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL"));			//Reading URL & URL will captured from properties file
		driver.manage().window().maximize();
	}
	
	
	@AfterClass()
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	// Creating Random Strings, Numbers, AlphaNumeric Strings
		public String randomString() 
		{
			String generatedString = RandomStringUtils.randomAlphabetic(5);
			return generatedString;
		}
		
		public String randomNumber() 
		{
			String generatedNumber = RandomStringUtils.randomNumeric(10);
			return generatedNumber;
		}
		
		public String randomAlphaNumeric() 
		{
			String generatedString = RandomStringUtils.randomAlphabetic(5);
			String generatedNumber = RandomStringUtils.randomNumeric(5);
			return (generatedString+"@"+generatedNumber);
		}
	
}
