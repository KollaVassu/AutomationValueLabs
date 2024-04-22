import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import factory.WebDriverFactory;


public class Test {
	
	static final String exePath = "D:\\Installed Softwares\\chromedriver.exe";
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		closeBrowser();
	}
	
	@SuppressWarnings("deprecation")
	public static void launchbrowser() {
		driver = WebDriverFactory.createWebDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static void closeBrowser() {
		driver.quit();
	}

}