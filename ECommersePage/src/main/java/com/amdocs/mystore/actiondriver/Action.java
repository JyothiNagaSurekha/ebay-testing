package com.amdocs.mystore.actiondriver;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amdocs.mystore.base.BaseClass;

public class Action extends BaseClass {

	public static void scrollByVisibilityOfElement(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntroView();", element);
	}

	public static void click(WebDriver driver, WebElement element) throws Throwable {
		System.out.println("Action " + driver + " " + element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
	
	public static void waitTime(WebElement element) {
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static Select getSelect(WebElement element) {
		Select select = new Select(element);
		return select;
	}

	public static void launchNewWindow(WebDriver driver) {
		String currentWindowHandle = driver.getWindowHandle();

		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
	}

	public static boolean findElement(WebDriver driver, WebElement element) throws Throwable {
		boolean flag = false;
		try {
			element.isDisplayed();
			flag = true;
		} catch (Exception e) {
			flag = false;
		} finally {
			if (flag)
				System.out.println("Successfully found element at");
			else
				System.out.println("Uable to locate element at");
		}
		return flag;
	}

	public static boolean isDisplayed(WebDriver driver, WebElement element) throws Throwable {
		boolean flag = false;
		flag = findElement(driver, element);
		if (flag) {
			flag = element.isDisplayed();
			if (flag)
				System.out.println("The element is Displayed");
			else
				System.out.println("The element is not displayed");

		} else
			System.out.println("Not displayed");
		return flag;
	}

	public static boolean isSelected(WebDriver driver, WebElement element) throws Throwable {
		boolean flag = false;
		flag = findElement(driver, element);
		if (flag) {
			flag = element.isSelected();
			if (flag)
				System.out.println("The element is Selected");
			else
				System.out.println("The element is not selected");

		} else
			System.out.println("Not selected");
		return flag;
	}

	public static boolean isEnabled(WebDriver driver, WebElement element) throws Throwable {
		boolean flag = false;
		flag = findElement(driver, element);
		if (flag) {
			flag = element.isEnabled();
			if (flag)
				System.out.println("The element is enabled");
			else
				System.out.println("The element is not enabled");

		} else
			System.out.println("Not enabled");
		return flag;
	}

	public static boolean type(WebElement element, String text) throws Throwable {
		boolean flag = false;
		try {
			flag = element.isDisplayed();
			element.clear();
			element.sendKeys(text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location not found");
			flag = false;
		} finally {
			if (flag)
				System.out.println("Successfully entered value");
			else
				System.out.println("Unable to enter value");
		}
		return flag;
	}

	public static boolean selectBySendKeys(WebElement element, String value) throws Throwable {
		boolean flag = false;
		try {
			element.sendKeys(value);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag)
				System.out.println("Select value from the dropdown");
			else
				System.out.println("Not selected value from the dropdown");
		}
	}

	public static boolean selectByIndex(WebElement element, int index) throws Throwable {
		boolean flag = false;
		try {
			Select select = new Select(element);
			select.selectByIndex(index);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag)
				System.out.println("Option selected by index");
			else
				System.out.println("Option not selected by index");
		}
	}

	public static boolean selectByValue(WebElement element, String value) throws Throwable {
		boolean flag = false;
		try {
			Select select = new Select(element);
			select.selectByValue(value);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag)
				System.out.println("Option selected by value");
			else
				System.out.println("Option not selected by value");
		}
	}

	public static boolean selectByVisibleText(WebElement element, String visibleText) throws Throwable {
		boolean flag = false;
		try {
			Select select = new Select(element);
			select.selectByVisibleText(visibleText);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag)
				System.out.println("Option selected by visibleText");
			else
				System.out.println("Option not selected by visibleText");
		}
	}

//	public static boolean mouseHover() {
//		
//	}

}
