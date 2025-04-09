package com.niraj.eb.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.niraj.eb.base.TestBase;
import com.niraj.eb.pages.CartPage;
import com.niraj.eb.pages.HomePage;
import com.niraj.eb.pages.LoginPage;

public class CartTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	CartPage cartPage;
	
	public CartTest() {
		super();
	}
	
	@BeforeMethod
	
	public void setup() {
		
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		cartPage = homePage.addAllItems();
		
		
	}
	
	@Test
	
	public void checkoutInfo() {
		
		cartPage.checkOut();
	}

}
