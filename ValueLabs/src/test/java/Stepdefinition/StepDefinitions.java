package Stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Pages.CommentPage;
import Pages.RegistationPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import factory.WebDriverFactory;

public class StepDefinitions {
	WebDriver driver = WebDriverFactory.createWebDriver();
	CommentPage c=new CommentPage(driver);
	RegistationPage r=new RegistationPage(driver);
	
	@Given("navigate to the Url \"([^\"]*)\"$")
    public void NavigatetoURL(String arg1) throws Throwable {
		c.navigateTo_Page(arg1);
 
    }
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
		c.enter_Email(username);
        c.enter_Password(password);
        c.enter_confirmPassword(password);
	}
	
	
	@Then("^Click on Next Button and Capture The Error Messege as \"([^\"]*)\" and Verify$")
    public void Capture_Error_message(String arg1) throws Throwable {
		c.click_nextbtn();
		c.validate_ErrorMessage(arg1);
        
	}
	
	@Then("^Click on Next Button$")
    public void ClickOnNextButton(String arg1) throws Throwable {
		c.click_nextbtn();
	}

	
	@Given("Enter the Below Details")
	public void EntertheDetails(DataTable dataTable) {
		   List<Map<String, String>> data = dataTable.asMaps(null, null);
		   for (Map<String, String> form : data) {
		       String firstName = form.get("firstName");
		       String lastName = form.get("lastName");
		       String addressLine1 = form.get("addressLine1");
		       String addressLine2 = form.get("addressLine2");
		       String postcode = form.get("postcode");
		       String city = form.get("city");
		       String state = form.get("state");
		       r.enter_Text(r.get_txtbx_firstName(),firstName);
		       r.enter_Text(r.get_txtbx_lastName(),lastName);
		       r.enter_Text(r.get_txtbx_addressLine1(),addressLine1);
		       r.enter_Text(r.get_txtbx_addressLine2(),addressLine2);
		       r.enter_Text(r.get_txtbx_postcode(),postcode);
		       r.enter_Text(r.get_txtbx_city(),city);
		       r.select_FromDropdown(r.get_txtbx_state(), state);
		       }
		   }
	
	
	
	@Given("Enter Card Details Below")
	public void EntertheCardDetails(DataTable dataTable) {
		   List<Map<String, String>> data = dataTable.asMaps(null, null);
		   for (Map<String, String> form : data) {
		       String cardHolderName = form.get("cardHolderName");
		       String cardNumber = form.get("cardNumber");
		       String cardCVV = form.get("cardCVV");
		       String cardExpiryMonth = form.get("cardExpiryMonth");
		       String cardExpiryYear = form.get("cardExpiryYear");
		       r.enter_Text(r.get_txtbx_cardHolderName(),cardHolderName);
		       r.get_txtbx_cardTypeVISA().click();
		       r.enter_Text(r.get_txt_cardNumber(), cardNumber);
		       r.enter_Text(r.get_txtbx_cardCVV(), cardCVV);
		       r.select_FromDropdown(r.get_txtbx_cardExpiryMonth(), cardExpiryMonth);
		       r.enter_Text(r.get_txtbx_cardExpiryYear(), cardExpiryYear);
		       }
		   }
	
	@Given("Scroll and Click on Agree Tearms and Conditions")
	public void AgreeTerms() {
		JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)");
	    driver.findElement(By.xpath("//*[@id=\"agreedToTerms\"]")).click();
		
	}
	}


