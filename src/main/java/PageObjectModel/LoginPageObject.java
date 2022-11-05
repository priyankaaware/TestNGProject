package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	// driver.findElement(By.xpath("")).sendKeys(null);

	public WebDriver driver; // don't have scope

	By Username = By.xpath("//*[@id=\"username_container\"]/input[1]");
	By Password = By.xpath("//*[@id=\"password\"]");
	By LoginPage = By.xpath("//input[@id='Login']");

	By TryForFree = By.xpath("//a[@class='button secondary']");
	By ActualErrorMessage = By.xpath("//div[@id='error']");

	public LoginPageObject(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement EnterUsername() {
		return driver.findElement(Username);
	}

	public WebElement EnterPassword() {
		return driver.findElement(Password);
	}

	public WebElement ClickOnLogin() {
		return driver.findElement(LoginPage);
	}

	public WebElement TryForFree() {
		return driver.findElement(TryForFree);
	}

	public WebElement AssertActualResult() {

		return driver.findElement(ActualErrorMessage);
	}

}
