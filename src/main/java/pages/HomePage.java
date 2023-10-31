package pages;

import static common.CommonAction.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Attribute;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@class='logo']")
	WebElement homePageText;
	@FindBy(xpath = "//div[@class='intro']/h1")
	WebElement titleText;
	@FindBy(xpath = "//h1/following-sibling::p")  //subtitle should not dynamic
	WebElement subTitleText;
	@FindBy(css = ".copy.h4-style.centered")
	WebElement footterText;
	@FindBy(xpath= "(//p[@class='text block-link is-simple bounce'])[3]")
	WebElement auto;
	@FindBy(xpath = "//input[@id='zipCode_overlay']")
	WebElement zipCodeField;
	@FindBy(xpath = "//input[@id='qsButton_overlay']")
	WebElement getQuot;
	@FindBy()
	WebElement maxLength;
	@FindBy(xpath ="//span[@id='zipCode_overlay-error']")
	WebElement errorMsgText;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_FirstName")
	WebElement fName;
	@FindBy(id= "NameAndAddressEdit_embedded_questions_list_LastName")
	WebElement lName;
	@FindBy(id ="NameAndAddressEdit_embedded_questions_list_DateOfBirth")
	WebElement dateOfBirth;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_MailingAddress")
	WebElement stNumberName;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_ApartmentUnit")
	WebElement apt;
	@FindBy(id ="NameAndAddressEdit_embedded_questions_list_City")
	WebElement cityName;
	@FindBy(id ="NameAndAddressEdit_embedded_questions_list_MailingZipType")
	WebElement poBox;
	@FindBy(xpath = "//button[text()='Okay, start my quote.']")
	WebElement okeyStartMyQoute;
	

	
	public void verifyHomePageTitle(String expected) {
		verifyText(homePageText, expected);	
		}
	
	public void verifyTitleText(String expectedString ) {
          verifyText(titleText, expectedString);		
		//verifyAttribute(titleText, expectedString, Attribute.INNER_HTML);
	}
	
	public void verifySubTitleText(String expectedString ) {
		//verifyText(subTitleText, expectedString);
		verifyAttribute(subTitleText, expectedString, Attribute.INNER_HTML);
	
	}
	public void verifyFootterText(String expectedString) {
		//verifyText(footterText, expectedString);
		verifyAttribute(footterText, expectedString, Attribute.INNER_HTML);
	}
	 public void clickAuto() {
		 click(auto);
	 }
	public void inputZipCodeField(String zipCode) {
		input(zipCodeField, zipCode);
	}
	public void verifyErrorMsgText(String expectedString ) {
		verifyText(errorMsgText, expectedString);
		//verifyAttribute(errorMsgText, expectedString, Attribute.INNER_HTML);
	}
	public void verifyMaxLength(String expected) {
		//String actualLength =getAttibuiteValue(zipCodeField, Attribute.max_length);
		verifyAttribute(zipCodeField, expected, Attribute.MAX_LENGTH);
	}
	/*
	public void verifyHomePageTitleText(WebDriver driver, String expectedTitle) {
		verifyTitle(driver, expectedTitle);
		//verifyAttribute(homePageText, expectedTitle, Attribute.INNER_HTML);
	}
	*/
	public void clickGetQuotebt() {
		click(getQuot);
	}
	public void cleanZipcodeField() {
		clear(zipCodeField);
	}
	public void inputFirstName(String firstName) {
		input(fName, firstName);
	}
	public void inputLastName(String lastName) {
		input(lName,lastName);
	}
	public void inputDOB(String datefBirth ) {
		input(dateOfBirth,datefBirth);
	}
	public void inputStreetNumber(String stName ) {
		input(stNumberName,stName);
	}
	public void inputApt(String aptNumber ) {
		input(apt,aptNumber);
	}
	public void inputCityName(String city ) {
		input(cityName,city);
	}
	 public void clickPoBox() {
		 click(poBox);
	 }
	 public void clickokeyStartMyQoute() {
		 click(okeyStartMyQoute);
	 }
	/*
	public void inputZipcodeField(int zipCode) {
		input(zipCodeField, String.valueOf(zipCode));
	}
	*/
	
	

	
	

}
