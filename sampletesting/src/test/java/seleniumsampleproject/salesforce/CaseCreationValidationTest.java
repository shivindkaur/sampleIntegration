package seleniumsampleproject.salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseCreationValidationTest {
	
	WebDriver cd;
	public void printStart() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acro222222\\Project\\Testing Documents\\chromedriver_win32\\chromedriver.exe");
		
		 cd= new ChromeDriver();
		System.out.println("Starting......");
	}

	
	public void launchCustomerServiceConsole(String url) {
		cd.get(url);
	}

	
	public void enterCredentials(String username, String password) {
		
	}

	
	public void clickButton(String buttonName) {
		
	}

	
	public void validateLoginScreen() {
		
	}
}
