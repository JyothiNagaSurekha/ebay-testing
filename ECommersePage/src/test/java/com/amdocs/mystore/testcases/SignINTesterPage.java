package com.amdocs.mystore.testcases;

import org.testng.annotations.Test;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.IndexPage;
import com.amdocs.mystore.pageobjects.SignInPage;

public class SignINTesterPage {
	@Test
	public void signInPage() throws Throwable {
		BaseClass.setUp();
		IndexPage page = new IndexPage();
		IndexPage.clicking(page.signInBtn);
		SignInPage.login(BaseClass.properties.getProperty("username"), BaseClass.properties.getProperty("password"));

	}
}
