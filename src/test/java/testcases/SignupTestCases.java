package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.constants;
import pageObjectModel.SignupPageObjects;
import pageObjectModel.loginPageObjects;

public class SignupTestCases extends BaseClass{
	
@Test

	public void verifySignup() throws IOException, InterruptedException {
	
		/*initializeDriver();
		driver.get("https://login.salesforce.com/");*/
	
		loginPageObjects lpo=new loginPageObjects (driver);
		lpo.ClickOntryForFree().click();
	
		SignupPageObjects spo=new SignupPageObjects(driver); 
		
		Thread.sleep(5000);
		spo.enterFirstName().sendKeys("Constant.firstName");
		spo.enterlastName().sendKeys("Constant.lastName");
		spo.enterJobTitle().sendKeys("Constant.jobTitle");
		spo.clickOnNextButton().click();
		
		
		  CommonMethods.SelectDropdown(spo.selectEmployees(), 2); //employee dropdown
		  
		  spo.enterCompanyName().sendKeys("test");
		  CommonMethods.SelectDropdown(spo.selectCountry(), 4);
		 // commonMethods.selectDropdownWithVisbleTExt(spo.selectCountry(), "India");
		  spo.clickOnNextButton().click();
		  
		  CommonMethods.verifyAssertions(spo.signupPageConfirmation(), constants.expextedTextSignupText, "Valid signup text is not showing");
	
	
	
	}	
	
}
