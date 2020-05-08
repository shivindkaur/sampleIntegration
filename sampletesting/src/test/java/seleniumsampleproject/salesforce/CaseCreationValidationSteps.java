package seleniumsampleproject.salesforce;

import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseCreationValidationSteps {
	
	CaseCreationValidationTest ccvs = new CaseCreationValidationTest();

	public void CaseCreationValidationSteps() {
		
	}
	
	@BeforeScenario
	public void printStart() {
		ccvs.printStart();
	}

	@Given("the service console url of $url")
	public void launchCustomerServiceConsole(String url) {
		ccvs.launchCustomerServiceConsole(url);
	}

	@When("I enter the valid credentials as $username and $password")
	public void enterCredentials(String username, String password) {
		ccvs.enterCredentials(username, password);
	}

	@When("click the $buttonName button")
	public void clickButton(String buttonName) {
		ccvs.clickButton(buttonName);
	}

	@Then("I should be able to successfully login into the system")
	public void validateLoginScreen() {
		ccvs.validateLoginScreen();
	}
}
