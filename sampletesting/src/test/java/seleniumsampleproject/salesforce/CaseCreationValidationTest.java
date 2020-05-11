package seleniumsampleproject.salesforce;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CaseCreationValidationTest {
	
	WebDriver cd;
	WebElement element_username,element_password,login_button;
	public void printStart() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acro222222\\Project\\Testing Documents\\chromedriver_win32\\chromedriver.exe");
		//DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer(); 
       // ieCapabilities.setCapability(cd., true);

		 cd= new ChromeDriver();
		
	}

	
	public void launchCustomerServiceConsole(String url) {
		cd.get(url);
	}

	
	public void enterCredentials(String username, String password) {
		element_username = cd.findElement(By.id("username"));
		element_username.sendKeys(username);
		element_password = cd.findElement(By.id("password"));
		element_password.sendKeys(password);
		login_button = cd.findElement(By.id("Login"));
		login_button.click();
	}

	
	public void clickButton(String buttonName) {
		
	}

	
	public void validateLoginScreen() {
		
	}
}
