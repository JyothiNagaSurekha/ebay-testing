package com.amdocs.mystore.testcases;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.IndexPage;
import com.amdocs.mystore.pageobjects.RegisterPage;

public class RegisterTestPage {
	@Test
	public void registerpage() throws Throwable {
		BaseClass.setUp();
		IndexPage page = new IndexPage();
		IndexPage.clicking(page.registerBtn);
		RegisterPage registerPage = new RegisterPage();
		Action.click(BaseClass.driver, registerPage.personalAccount);
		Action.type(registerPage.firstName, "jyothi");
		Action.type(registerPage.lastName, "A");
		Action.type(registerPage.email, "jyothinagasurekha@gmail.com");
		Action.type(registerPage.password, "Admin@123");

		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 300);
		wait.until(ExpectedConditions.elementToBeClickable(registerPage.registerButton));
		Action.click(BaseClass.driver, registerPage.registerButton);

		Action.type(registerPage.pinbox1, "1");
		Action.type(registerPage.pinbox2, "1");
		Action.type(registerPage.pinbox3, "1");
		Action.type(registerPage.pinbox4, "1");
		Action.type(registerPage.pinbox5, "1");
		Action.type(registerPage.pinbox6, "1");

	}
}
