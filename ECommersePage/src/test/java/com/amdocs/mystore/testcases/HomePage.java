package com.amdocs.mystore.testcases;

import org.testng.annotations.Test;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.AddToCartPage;
import com.amdocs.mystore.pageobjects.BuyItemPage;
import com.amdocs.mystore.pageobjects.PaymentPage;
import com.amdocs.mystore.pageobjects.SearchPage;

public class HomePage  {

	@Test
	public void homePage() throws Throwable {

		BaseClass.setUp();
		SearchPage.searchItems(BaseClass.properties.getProperty("searchValue"));
		Action.launchNewWindow(BaseClass.driver);
		AddToCartPage.addItemsToCart();
		BuyItemPage.buyItem();
		PaymentPage.payAmount();

	}

}
