package stepdefs;

import java.util.List;
import java.util.Map;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import loggers.Loggers;

public class AutoStepDefinition extends TestBase {

	@Given("home page title is {string}")
	public void home_page_title_is(String string) {
		homePage.verifyTitleText(string);

	}

	@Given("Sub-title is {string}")
	public void sub_title_is(String string) {
		homePage.verifySubTitleText(string);

	}

	@Given("footter will be {string}")
	public void footter_will_be(String string) {
		homePage.verifyFootterText(string);
	}

	@When("user click on Auto")
	public void user_click_on_auto() {
		homePage.clickAuto();
	}

	@When("user input zipcode <zipCode>")
	public void user_input_zipcode(DataTable table) {
		List<String> zipCodes = table.asList();
		for (String zipCode : zipCodes) {
			homePage.inputZipCodeField(zipCode);
		}

	}

	@Then("verify zipcode length is <length>")
	public void verify_zipcode_length_is(DataTable table) {
		Map<String, String> map = table.asMap();
		for (String key : map.keySet()) {
			homePage.verifyMaxLength(map.get(key));

		}
	}

	@When("user clean Zipcode field")
	public void user_clean_zipcode_field() {
		homePage.cleanZipcodeField();
	}

	@When("user click on button {string}")
	public void user_click_on_button(String string) {
		homePage.clickGetQuotebt();
	}

	@Then("verify zipcode error mgs is {string}")
	public void verify_zipcode_error_mgs_is(String string) {
		homePage.verifyErrorMsgText(string);
	}

	@When("user click on button")
	public void user_click_on_button() {
		homePage.clickGetQuotebt();
	}

	@Given("Print <msg>")
	public void printMsg(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			Loggers.log(entry.getKey());
		}
	}

}
