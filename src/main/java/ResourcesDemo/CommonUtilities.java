package ResourcesDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	
	public static void HandleStaticDropdown(WebElement a, int index) {
		
		WebElement j =a;
		Select j1 = new Select(j);
		j1.selectByIndex(index);	
		
		
	}
	
	public static void HandleAssertion(String Expected, String Actual) {
		SoftAssert sa = new SoftAssert();

		String expectedString =Expected;

		String actualString =Actual;

		sa.assertEquals(actualString, expectedString);
		
		sa.assertAll();

	}


		
	

}
