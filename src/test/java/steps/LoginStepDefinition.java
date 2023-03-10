package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.AccountPage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;
	AccountPage accountPage;

	@Before
	public void beforerun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		accountPage = PageFactory.initElements(driver, AccountPage.class);
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {

		driver.get("https://techfios.com/billing/?ng=admin/");

	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String loginData, String field) {
		if (field.equalsIgnoreCase("username")) {
			loginPage.enterUserName(loginData);
		}
		else if (field.equalsIgnoreCase("password")) {
			loginPage.enterPassword(loginData);
		}
		else {
			System.out.println(loginData +"is not correct");
	}
	}
	@When("User clicks on {string}")
	public void user_clicks_on(String button) {
		if (button.equalsIgnoreCase("login")) {
			loginPage.clickSignInButton();
			takeScreenshot(driver);
		} else if (button.equalsIgnoreCase("bankCash")) {
			accountPage.clickBankCash();
		} else if (button.equalsIgnoreCase("newAccount")) {
			accountPage.clickNewAccount();
		} else if (button.equalsIgnoreCase("submit")) {
			accountPage.clickSubmit();;
			 takeScreenshot(driver);
		}
	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		String expectedtitle = "Dashboard- iBilling";
		String actualtitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedtitle, actualtitle);
		takeScreenshot(driver);
	}

	@And("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String accountData, String accountdetails) {
		switch(accountdetails) {
		case "accountTitle":
			accountPage.enterAccountTitle(accountData + generateRandomNum(999));
		break;
		case "description": 	
			accountPage.enterDescription(accountData +generateRandomNum(99));
		break;
		case "initialBalance": 
			accountPage.enterBalance(accountData +generateRandomNum(99));
		break;
		case "accountNumber": 	
			accountPage.enterAccountNumber(accountData +generateRandomNum(999));
		break; 
		case "contactPerson": 
			accountPage.enterContactPerson(accountData +generateRandomNum(99));
			break;
		 case "Phone": 
			accountPage.enterPhone(accountData +generateRandomNum(99));
			break;
	    case "internetBankingURL":
			accountPage.enterURL(generateRandomNum(99) +accountData);
			break;
		default:
			System.out.println(accountData + "is not correct");
			break;
		}
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		takeScreenshot(driver);
		String expectedtitle = "Accounts- iBilling";
		String actualtitle = accountPage.getAccountPageTitle();
		Assert.assertEquals(expectedtitle, actualtitle);

	}

//	@After
//	public void teardown() {
//		driver.close();
//		driver.quit();
//	}

}
