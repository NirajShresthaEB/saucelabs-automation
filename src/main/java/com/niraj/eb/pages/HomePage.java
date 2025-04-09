package com.niraj.eb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.niraj.eb.base.TestBase;
import com.niraj.eb.pages.CartPage;

public class HomePage extends TestBase {

	@FindBy(xpath = "//div[contains(@class, 'login')]")
	WebElement userNameLabel;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement itemFirst;

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement itemSecond;

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement itemThird;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement cartIcon;

	// Initializing the Page Objects

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public void clickFirstItem() {

		itemFirst.click();
	}

	public void clickSecondItem() {

		itemSecond.click();
	}

	public void clickThirdItem() {

		itemThird.click();
	}

	public void clickOnCart() {

		cartIcon.click();
	}

	public CartPage addAllItems() {
		
		
		clickFirstItem();
		clickSecondItem();
		clickThirdItem();
		clickOnCart();
		
		return new CartPage();

}
	
}
