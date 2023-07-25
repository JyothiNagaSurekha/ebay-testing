package com.amdocs.mystore.pageobjects;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;

public class SignInPage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"userid\"]")
	public WebElement userId;

	@FindBy(xpath = "//*[@id=\"signin-continue-btn\"]")
	public WebElement continueButton;

	@FindBy(xpath = "//*[@id=\"pass\"]")
	public WebElement password;
	

	@FindBy(xpath = "//*[@id=\"sgnBt\"]")
	public  WebElement signInButton;


	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

	public static void login(String username, String password) throws Throwable {
		SignInPage inPage = new SignInPage();
		driver.manage().timeouts()
		.implicitlyWait(Integer.parseInt(properties.getProperty("implicitWait")), TimeUnit.SECONDS);
		Action.type(inPage.userId, username);
		Action.click(driver, inPage.continueButton);
		BaseClass.driver.manage().timeouts()
				.implicitlyWait(Integer.parseInt(properties.getProperty("implicitWait")), TimeUnit.SECONDS);
		Action.type(inPage.password, password);
		Action.click(driver, inPage.signInButton);
	}

}
