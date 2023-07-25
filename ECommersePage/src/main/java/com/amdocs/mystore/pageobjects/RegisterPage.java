package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.base.BaseClass;

public class RegisterPage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"personalaccount-radio\"]")
	public WebElement personalAccount;

	@FindBy(xpath = "//*[@id=\"firstname\"]")
	public WebElement firstName;

	@FindBy(xpath = "//*[@id=\"lastname\"]")
	public WebElement lastName;

	@FindBy(xpath = "//*[@id=\"Email\"]")
	public WebElement email;

	@FindBy(xpath = "//*[@id=\"password\"]")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")
	public WebElement registerButton;

	@FindBy(xpath = "//*[@id=\"pinbox-0\"]")
	public  WebElement pinbox1;

	@FindBy(xpath = "//*[@id=\"pinbox-1\"]")
	public  WebElement pinbox2;

	@FindBy(xpath = "//*[@id=\"pinbox-2\"]")
	public  WebElement pinbox3;

	@FindBy(xpath = "//*[@id=\"pinbox-3\"]")
	public  WebElement pinbox4;

	@FindBy(xpath = "//*[@id=\"pinbox-4\"]")
	public  WebElement pinbox5;

	@FindBy(xpath = "//*[@id=\"pinbox-5\"]")
	public  WebElement pinbox6;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

}
