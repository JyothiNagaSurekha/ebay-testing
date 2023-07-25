package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;

public class IndexPage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"gh-ug-flex\"]/a")
	public WebElement registerBtn;

	@FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
	public WebElement signInBtn;

	@FindBy(xpath = "//*[@id=\"gh-ac\"]")
	public  WebElement searchBar;

	@FindBy(xpath = "//*[@id=\"gh-btn\"]")
	public  WebElement searchButton;

	public IndexPage() {
		PageFactory.initElements(driver, this);
	}

	public static void clicking(WebElement element) throws Throwable {
		Action.click(driver, element);
	}
}
