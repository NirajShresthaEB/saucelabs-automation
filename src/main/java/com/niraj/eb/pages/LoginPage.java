package com.niraj.eb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.niraj.eb.base.TestBase;
import com.niraj.eb.pages.HomePage;

public class LoginPage extends TestBase{

	// Page Factory - OR
	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement loginbtn;

	// Initializing page objects

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public HomePage login(String un, String pwd) {

		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();

		return new HomePage();

	}

}
