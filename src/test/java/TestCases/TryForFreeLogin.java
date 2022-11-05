package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import PageObjectModel.TryForFree;
import ResourcesDemo.BaseClass;
import ResourcesDemo.CommonUtilities;
import ResourcesDemo.Constant;

public class TryForFreeLogin extends BaseClass {

	@Test
	public void SignUp() throws IOException, InterruptedException {

		LoginPageObject LPO = new LoginPageObject(driver);
		LPO.TryForFree().click();

		TryForFree TFO = new TryForFree(driver);
		Thread.sleep(5000);
		TFO.enterFirstname().sendKeys(Constant.firstname);
		TFO.enterLastname().sendKeys(Constant.lastname);
		
		TFO.enterGmail().sendKeys(Constant.Gmail);
		
		Thread.sleep(5000);

		
		//job title dropdown
		CommonUtilities.HandleStaticDropdown(TFO.SelectJobTitle(),1 );
		
		TFO.enterCompanyName().sendKeys(Constant.CompanyName);

		//Employee dropdown
		CommonUtilities.HandleStaticDropdown(TFO.selectEmpolyee(), 2);

		TFO.EnterPhoneNumber().sendKeys(Constant.PhoneNumber);
		
		Thread.sleep(2000);

		//Country dropdown
		CommonUtilities.HandleStaticDropdown(TFO.SelectCountry(), 1);
		
		Thread.sleep(3000);
		
		//TFO.ClickCheckbox().click();
		
		  
	}

}
