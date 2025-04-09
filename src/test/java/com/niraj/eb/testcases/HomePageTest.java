package com.niraj.eb.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.niraj.eb.base.TestBase;
import com.niraj.eb.pages.CartPage;
import com.niraj.eb.pages.HomePage;
import com.niraj.eb.pages.ItemOnePage;
import com.niraj.eb.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ItemOnePage itemOnePage;
	CartPage cartPage;

	public HomePageTest() {
		super();

	}

	@BeforeMethod

	public void setUp() {

		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void verifyHomePageTitleTest() {

		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Swag Labs", "Page title not matched");
	}

	@Test

	public void addItemsToCart() {

		cartPage = homePage.addAllItems();
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
