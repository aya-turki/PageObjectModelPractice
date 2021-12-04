package org.mma.training.java.selenium.tricentis;


import org.mma.training.java.selenium.base.BaseClass;
import org.mma.training.java.selenium.webpages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MercuryWebTourTest extends BaseClass {
	
	@Test (dataProvider="getLoginTestData")
	
	public void loginPageValidation(String UserID, String Passwd) {
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginPageElementsAndMethods(UserID, Passwd);
	}
	
	
	

}
