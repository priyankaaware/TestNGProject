package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TryForFree {

	public WebDriver driver;

	By firstname = By.xpath("//input[@name='UserFirstName']");
	By lastname = By.xpath("//input[@name='UserLastName']");

	By Gmail = By.xpath("//input[@name='UserEmail']");
	By JobTitle = By.xpath("//select[@name='UserTitle']");
	By CompanyName = By.xpath("//input[@name='CompanyName']");
	By employee = By.xpath("//select[@name='CompanyEmployees']");
	By PhoneNumber = By.xpath("//input[@name='UserPhone']");
	// By TryForFree = By.xpath("//a[@id='signup_link']");
	By Country = By.xpath("//select[@name='CompanyCountry']");
	By Checkbox = By.xpath("//*[@name=\"signup_form_uDQY\"]/div[5]/div/div/div[1]");

	public TryForFree(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement enterFirstname() {

		return driver.findElement(firstname);
	}

	public WebElement enterLastname() {

		return driver.findElement(lastname);
	}

	public WebElement enterGmail() {

		return driver.findElement(Gmail);

	}

	public WebElement SelectJobTitle() {

		return driver.findElement(JobTitle);

	}

	public WebElement enterCompanyName() {

		return driver.findElement(CompanyName);
	}

	public WebElement selectEmpolyee() {

		return driver.findElement(employee);
	}

	public WebElement EnterPhoneNumber() {

		return driver.findElement(PhoneNumber);
	}

	public WebElement SelectCountry() {

		return driver.findElement(Country);
	}

	public WebElement ClickCheckbox() {

		return driver.findElement(Checkbox);
	}

}
