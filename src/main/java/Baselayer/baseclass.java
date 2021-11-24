package Baselayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\javaprogram\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
	}
	
}
