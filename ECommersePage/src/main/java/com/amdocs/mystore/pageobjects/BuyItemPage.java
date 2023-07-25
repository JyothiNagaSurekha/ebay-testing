package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;

public class BuyItemPage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"mainContent\"]/div/div[2]/div[2]/div/div[1]/button")
	WebElement checkOutBtn;

	@FindBy(xpath = "//*[@id=\"gxo-btn\"]")
	WebElement guestBtn;

	public BuyItemPage() {
		PageFactory.initElements(driver, this);
	}

	public static void buyItem() throws Throwable {

		BuyItemPage page = new BuyItemPage();

		Action.waitTime(page.checkOutBtn);
		Action.click(driver, page.checkOutBtn);
		Action.waitTime(page.guestBtn);
		Action.click(driver, page.guestBtn);
	}

}
