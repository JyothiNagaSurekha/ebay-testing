package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;

public class AddToCartPage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"x-msku__select-box-1000\"]")
	public WebElement colorButton;

	@FindBy(xpath = "//*[@id=\"x-msku__select-box-1001\"]")
	public WebElement gbButton;
    // @FindBy(xpath= "//*[@id=\"mainContent\"]/form/div[2]/div/div[1]/div[2]/ul/li[2]/div/a/span/span")
    //public WebElement cartButton;
	@FindBy(xpath = "//*[@id=\"mainContent\"]/form/div[2]/div/div[1]/div[2]/ul/li[2]/div/a")
	public WebElement addCartButton;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}

	

	public static void addItemsToCart() throws Throwable {
		
		AddToCartPage cart = new AddToCartPage();

		Action.getSelect(cart.colorButton).selectByVisibleText(properties.getProperty("color"));

		Action.getSelect(cart.gbButton).selectByVisibleText(properties.getProperty("gb"));
		//Action.getSelect(cart.cartButton).selectByVisibleText(properties.getProperty("cart"));
		
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 300);
		wait.until(ExpectedConditions.elementToBeClickable(cart.addCartButton));

		Action.click(driver, cart.addCartButton);
	}
}
