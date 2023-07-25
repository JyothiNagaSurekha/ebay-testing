package com.amdocs.mystore.testcases;

import org.testng.annotations.Test;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.AddToCartPage;
import com.amdocs.mystore.pageobjects.BuyItemPage;
import com.amdocs.mystore.pageobjects.IndexPage;
import com.amdocs.mystore.pageobjects.PaymentPage;
import com.amdocs.mystore.pageobjects.SearchPage;
import com.amdocs.mystore.pageobjects.SignInPage;

public class PaymentTestPage {
	@Test
	public void paymentTest() throws Throwable {
		BaseClass.setUp();
		IndexPage page = new IndexPage();
		IndexPage.clicking(page.signInBtn);
		SignInPage.login(BaseClass.properties.getProperty("username"), BaseClass.properties.getProperty("password"));
		SearchPage.searchItems(BaseClass.properties.getProperty("searchValue"));
		Action.launchNewWindow(BaseClass.driver);
		AddToCartPage.addItemsToCart();
		BuyItemPage.buyItem();
		PaymentPage.payAmount();
	}
}
