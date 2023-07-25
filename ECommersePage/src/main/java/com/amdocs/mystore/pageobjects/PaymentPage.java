package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;

public class PaymentPage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"qty-BId-ItemId=354586733872;EId-VariationId=623964484759;Domain-ebay;LId-420002\"]")
	WebElement quantityBtn;

	@FindBy(xpath = "//*[@id=\"country\"]")
	WebElement countryBtn;

	@FindBy(xpath = "//*[@id=\"firstName\"]")
	WebElement firstnameBtn;

	@FindBy(xpath = "//*[@id=\"lastName\"]")
	WebElement lastNameBtn;

	@FindBy(xpath = "//*[@id=\"addressLine1\"]")
	WebElement streetBtn;

	@FindBy(xpath = "//*[@id=\"city\"]")
	WebElement cityBtn;

	@FindBy(xpath = "//*[@id=\"stateOrProvince\"]")
	WebElement stateBtn;

	@FindBy(xpath = "//*[@id=\"postalCode\"]")
	WebElement pinCodeBtn;

	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement emailBtn;

	@FindBy(xpath = "//*[@id=\"emailConfirm\"]")
	WebElement confirmEmailBtn;

//	@FindBy(xpath = "//*[@id=\"phoneCountryCode\"]/span/span[2]")
//	WebElement countryCodeBtn;

	@FindBy(xpath = "//*[@id=\"phoneNumber\"]")
	WebElement mobileBtn;

	@FindBy(xpath = "//*[@id=\"mainContent\"]/div[3]/div/div[1]/section[2]/div[3]/div/div/div/div[2]/div[1]/form/div/div/div/button")
	WebElement doneBtn;

//	@FindBy(xpath = "//*[@id=\"mainContent\"]/div/div[3]/div[2]/div/div[1]/button")
//	WebElement checkOutBtn;

	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	public static void payAmount() throws Throwable {
		PaymentPage page = new PaymentPage();

		Action.waitTime(page.quantityBtn);
		Action.getSelect(page.quantityBtn).selectByVisibleText(properties.getProperty("quantity"));

		Action.waitTime(page.countryBtn);
		Action.getSelect(page.countryBtn).selectByVisibleText(properties.getProperty("country"));

		Action.waitTime(page.stateBtn);
		Action.getSelect(page.stateBtn).selectByVisibleText(properties.getProperty("state"));

		Action.waitTime(page.firstnameBtn);
		Action.type(page.firstnameBtn, properties.getProperty("firstName"));

		Action.waitTime(page.lastNameBtn);
		Action.type(page.lastNameBtn, properties.getProperty("lastName"));

		Action.waitTime(page.streetBtn);
		Action.type(page.streetBtn, properties.getProperty("street"));

		Action.waitTime(page.cityBtn);
		Action.type(page.cityBtn, properties.getProperty("city"));

		Action.waitTime(page.pinCodeBtn);
		Action.type(page.pinCodeBtn, properties.getProperty("pinCode"));

		Action.waitTime(page.emailBtn);
		Action.type(page.emailBtn, properties.getProperty("email"));

		Action.waitTime(page.confirmEmailBtn);
		Action.type(page.confirmEmailBtn, properties.getProperty("confirmEmail"));

		Action.waitTime(page.mobileBtn);
		Action.type(page.mobileBtn, properties.getProperty("phone"));

		Action.waitTime(page.doneBtn);
		Action.click(driver, page.doneBtn);

	}

}
