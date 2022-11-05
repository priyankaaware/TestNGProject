package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import ResourcesDemo.BaseClass;
import ResourcesDemo.CommonUtilities;
import ResourcesDemo.Constant;

public class VerifyLogin extends BaseClass {

	@Test
	public void login() throws IOException, InterruptedException {

		LoginPageObject obj = new LoginPageObject(driver);
		obj.EnterUsername().sendKeys(Constant.Username);
		obj.EnterPassword().sendKeys(Constant.lastname);
		Thread.sleep(1000);
		obj.ClickOnLogin().click();
		
		CommonUtilities.HandleAssertion(Constant.expectedString, obj.AssertActualResult().getText());

		
	}

}
