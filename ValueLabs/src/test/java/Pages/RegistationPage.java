package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistationPage {
	WebDriver driver;

	public RegistationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "firstName")
	private WebElement txtbx_firstName;
	
	@FindBy(id = "lastName")
	private WebElement txtbx_lastName;
	
	@FindBy(id = "addressLine1")
	private WebElement txtbx_addressLine1;
	
	@FindBy(id = "addressLine2")
	private WebElement txtbx_addressLine2;
	
	@FindBy(id = "postcode")
	private WebElement txtbx_postcode;
	
	@FindBy(id = "city")
	private WebElement txtbx_city;
	
	@FindBy(id = "state")
	private WebElement txtbx_state;
	
	
	@FindBy(id = "cardHolderName")
	private WebElement txtbx_cardHolderName;
	
	@FindBy(xpath = "//*[@id=\"cardTypeVISA\"]")
	private WebElement txtbx_cardTypeVISA;
	
	@FindBy(id = "cardNumber")
	private WebElement txt_cardNumber;
	
	@FindBy(id = "cardCVV")
	private WebElement txtbx_cardCVV;
	
	@FindBy(id = "cardExpiryMonth")
	private WebElement txtbx_cardExpiryMonth;
	
	@FindBy(id = "cardExpiryYear")
	private WebElement txtbx_cardExpiryYear;
	
	
	public WebElement get_txtbx_cardHolderName() {
		return txtbx_cardHolderName;
	}
	
	public WebElement get_txtbx_cardTypeVISA() {
		return txtbx_cardTypeVISA;
	}
	
	public WebElement get_txt_cardNumber() {
		return txt_cardNumber;
	}
	
	public WebElement get_txtbx_cardCVV() {
		return txtbx_cardCVV;
	}
	
	public WebElement get_txtbx_cardExpiryMonth() {
		return txtbx_cardExpiryMonth;
	}
	
	public WebElement get_txtbx_cardExpiryYear() {
		return txtbx_cardExpiryYear;
	}
	
	
	public WebElement get_txtbx_firstName() {
		return txtbx_firstName;
	}
	
	public WebElement get_txtbx_lastName() {
		return txtbx_lastName;
	}
	
	public WebElement get_txtbx_addressLine1() {
		return txtbx_addressLine1;
	}
	
	public WebElement get_txtbx_addressLine2() {
		return txtbx_addressLine2;
	}
	
	public WebElement get_txtbx_postcode() {
		return txtbx_postcode;
	}
	
	public WebElement get_txtbx_city() {
		return txtbx_city;
	}
	
	public WebElement get_txtbx_state() {
		return txtbx_state;
	}
	
	public void enter_Text(WebElement e,String email) {
		e.clear();
		e.sendKeys(email);
	}
	
	public void select_FromDropdown(WebElement e,String s) {
		Select objSelect = new Select(e);
		//objSelect.selectByIndex('1');
		//objSelect.selectByVisibleText(s);
		objSelect.selectByValue(s);
		
	}

}
