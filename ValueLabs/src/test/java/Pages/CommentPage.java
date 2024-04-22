package Pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.WebDriverFactory;

public class CommentPage  {
	WebDriver driver;

	public CommentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "emailAddress")
	private WebElement txtbx_Email;
	
	@FindBy(id = "password")
	private WebElement txtbx_password;
	
	@FindBy(id = "confirmPassword")
	private WebElement txtbx_confirmPassword;
	
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	private WebElement nextbtn;
	
	@FindBy(className = "toast-message error active")
	private WebElement errormessage;


	

	public WebElement get_Txtbx_Email() {
		return txtbx_Email;
	}
	
	public WebElement get_txtbx_confirmPassword() {
		return txtbx_confirmPassword;
	}
	
	public WebElement get_txtbx_password() {
		return txtbx_password;
	}
	
	public WebElement get_nextbtn() {
		return nextbtn;
	}
	
	public WebElement get_errormessage() {
		return errormessage;
	}
	
	
	public void enter_Email(String email) {
		get_Txtbx_Email().clear();
		get_Txtbx_Email().sendKeys(email);
	}
	
	public void enter_confirmPassword(String password) {
		get_txtbx_confirmPassword().clear();
		get_txtbx_confirmPassword().sendKeys(password);
	}
	
	public void enter_Password(String password) {
		get_txtbx_password().clear();
		get_txtbx_password().sendKeys(password);
	}
	
	public void click_nextbtn() {
		get_nextbtn().click();
	}
	
	public void navigateTo_Page(String url) {
		this.driver = WebDriverFactory.createWebDriver();
		driver.get(url);
		
	}
	
	public void validate_ErrorMessage(String ExpectedMessage) {
		String Errormessage=get_errormessage().getText();
		assertEquals(Errormessage, ExpectedMessage);
	}
	
}