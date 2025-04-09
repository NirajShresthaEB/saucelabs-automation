package com.niraj.eb.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.niraj.eb.base.TestBase;
import com.niraj.eb.pages.HomePage;
import com.niraj.eb.pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test

	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
