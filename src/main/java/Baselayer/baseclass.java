package Baselayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
	
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	
	public baseclass() {
				// we create object repository
		prop = new Properties();
		
		try {
			
			fis=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\HybridFramework_practice\\src\\main\\java\\Configlayer\\Config.properties");
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
		
	public static void setup() {
		
		
		String browsername=prop.getProperty("browser");
		
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\javaprogram\\driver\\chromedriver1.exe");
			driver = new ChromeDriver();	
		}
		else if(browsername.equalsIgnoreCase("morzila")) {
			
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\admin\\eclipse-workspace\\javaprogram\\driver\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\eclipse-workspace\\javaprogram\\driver\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
				
		driver.get(prop.getProperty("url"));
		
		
	}
	
}
