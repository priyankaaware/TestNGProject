package ResourcesDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;

	public void InitializeDriver() throws IOException {

		// To read the data

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\ADMIN\\eclipse-workspace\\TestNGProject\\src\\main\\java\\ResourcesDemo\\Data.properties");

		// To access the data.properties file
		 prop = new Properties();

		// loading the reade file
		prop.load(fis);

		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equalsIgnoreCase("chrome"))

		{
			WebDriverManager.chromedriver().setup();   //To run Latest Version
			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("firefox")) {

			// firefox code

		} else if (BrowserName.equalsIgnoreCase("edge")) {

			// edge code

		} else {

			System.out.println("please enter proper browser value");

		}

	}
	@BeforeMethod
	public void LauchURL() throws IOException
	{
		InitializeDriver();
		String Url = prop.getProperty("Url"); //This driver scope
		driver.get(Url);
	}

}
