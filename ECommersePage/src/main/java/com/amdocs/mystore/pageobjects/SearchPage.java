package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;

public class SearchPage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"item528f042d30\"]/div/div[1]/div/a/div")
	//@FindBy(xpath ="//*[@id=\"item4bd7643782\"]/div/div[2]/a/div/span")
	public WebElement clickItem;

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	public static void searchItems(String searchvalue) throws Throwable {
		
		IndexPage page = new IndexPage();
		Action.type(page.searchBar, searchvalue);
		Action.click(driver, page.searchButton);
		SearchPage searchPage = new SearchPage();
		Action.click(driver, searchPage.clickItem);

	}

}
