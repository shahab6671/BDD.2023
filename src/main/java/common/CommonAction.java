package common;


import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import constants.Attribute;
import loggers.Loggers;

public class CommonAction {

	public static void input(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Loggers.log(element + "...not found\n" + e.getMessage());
			//Assert.fail();
		}
	}
/*
	public static void inputThrowsNoSuchElementrException(WebElement element, String inputValue)
			throws NoSuchElementException {
		element.sendKeys(inputValue);
		Loggers.log(element + "......Input value: " + inputValue);
	}
*/
	public static void click(WebElement element) {
		try {
			element.click();
			Loggers.log(element + "......Clicked: ");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Loggers.log(element + "...not found\n" + e.getMessage());
			//
			Assert.fail();
		}
	}

	public static void clickThrowsNoSuchElementException(WebElement element) {
		element.click();
		Loggers.log(element + "......Clicked: ");
	}

	public static void inputFirstName(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Loggers.log(element + "...not found\n" + e.getMessage());
			//Assert.fail();
		}

	}

	public static void inputLastName(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Loggers.log(element + "...not found\n" + e.getMessage());
			//Assert.fail();
		}
	}

	public static void inputDateOfBirth(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Loggers.log(element + "...not found\n" + e.getMessage());
			//Assert.fail();
		}
	}
	
	public static void inputStNumberName(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Loggers.log(element + "...not found\n" + e.getMessage());
			//Assert.fail();
		}

	}

	public static void inputApt(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Loggers.log(element + "...not found\n" + e.getMessage());
			//Assert.fail();
		}

	}

	public static void inputCityName(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Loggers.log(element + "...not found\n" + e.getMessage());
		}

	}

	public static void inputPoBox(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + "......Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Loggers.log(element + "...not found\n" + e.getMessage());
		}

	}

	public static void clickOkeyStartMyQuote(WebElement element) {
		try {
			element.click();
			Loggers.log(element + "......clicked");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Loggers.log(element + "...not found\n" + e.getMessage());
		}
	}
	public static void verifyText(WebElement element, String expected) {
		String actual =element.getText();
		Loggers.log(element + "..........Actual text "  + actual + "expected test "+ expected);
		Assert.assertEquals(actual, expected);
	}
	public static void verifyAttribute(WebElement element, String expected, Attribute attribute) {
		String actual =getAttibuiteValue(element, attribute);
				//element.getAttribute(attribute.toString());
		Loggers.log(element + "..........Actual text "  + actual + "expected test "+ expected);
		Assert.assertEquals(actual,expected);
	}
	
	private static String getAttibuiteValue(WebElement element, Attribute attribute ) {
		return element.getAttribute(attribute.toString());
		
	}
	public static void clear(WebElement element) {
		try {
		element.clear();
		Loggers.log(element + "...............cleared");
		}catch (NoSuchElementException  e) {
			e.printStackTrace();
			Loggers.log(element + "...not found\n" + e.getMessage());
 		}
	}
	/*
	private static String getTitle(WebDriver driver) {
		return driver.getTitle();
	}
	*/
	public static void verifyTitle(WebDriver driver, String expectedTitle) {
		Loggers.log("Actual title is :" + driver.getTitle() + "........and expectedtitle");
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
  }
