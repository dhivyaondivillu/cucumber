package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountPage {
	 WebDriver driver; 
	 public AccountPage(WebDriver driver) {
	  this.driver = driver;
	 }
	 // Element Library
	 @FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")WebElement BANK_CASH_FIELD_ELEMENT;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")WebElement NEW_ACCOUNT_ELEMENT;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")WebElement ACCOUNT_TITLE__FLELD_ELEMENT;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")WebElement DESCRIPTION_ELEMENT;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")WebElement BALANCE_ELEMENT;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")WebElement ACCOUNT_NUMBER_ELEMENT;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")WebElement CONTACT_PERSON_ELEMENT;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")WebElement PHONE_ELEMENT;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")WebElement URL_ELEMENT;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")WebElement SUMMIT_BUTTON_ELEMENT;
	 
	// Methods to interact with the elements
	 public void clickBankCash() {
		  BANK_CASH_FIELD_ELEMENT.click();
		  try {
		   Thread.sleep(3000);
		  } catch (InterruptedException e) {
		   e.printStackTrace();
		  }
	 }
		  public void clickNewAccount() {
			  NEW_ACCOUNT_ELEMENT.click();
			  try {
			   Thread.sleep(3000);
			  } catch (InterruptedException e) {
			   e.printStackTrace();
			  }
		  }
			 public void enterAccountTitle(String accountTitle) {
				 ACCOUNT_TITLE__FLELD_ELEMENT.sendKeys(accountTitle );
				  try {
				   Thread.sleep(3000);
				  } catch (InterruptedException e) {
				   e.printStackTrace();
				  }
				 }
			 public void enterDescription(String description) {
				 DESCRIPTION_ELEMENT.sendKeys(description);
				  try {
				   Thread.sleep(3000);
				  } catch (InterruptedException e) {
				   e.printStackTrace();
				  }
				 }
			 public void enterBalance(String balance) {
				 BALANCE_ELEMENT.sendKeys(balance);
				  try {
				   Thread.sleep(3000);
				  } catch (InterruptedException e) {
				   e.printStackTrace();
				  }
				 }
			 public void enterAccountNumber(String accountnumber) {
				 ACCOUNT_NUMBER_ELEMENT.sendKeys(accountnumber);
				  try {
				   Thread.sleep(3000);
				  } catch (InterruptedException e) {
				   e.printStackTrace();
				  }
				 }
			 public void enterContactPerson(String contactperson) {
				 CONTACT_PERSON_ELEMENT.sendKeys(contactperson);
				  try {
				   Thread.sleep(3000);
				  } catch (InterruptedException e) {
				   e.printStackTrace();
				  }
				 }
			 public void enterPhone(String phone) {
				 PHONE_ELEMENT.sendKeys(phone);
				  try {
				   Thread.sleep(3000);
				  } catch (InterruptedException e) {
				   e.printStackTrace();
				  }
				 }
			 
			 public void enterURL(String url) {
				 URL_ELEMENT.sendKeys(url);
				  try {
				   Thread.sleep(3000);
				  } catch (InterruptedException e) {
				   e.printStackTrace();
				  }
				 }
			 public void clickSubmit() {
				  SUMMIT_BUTTON_ELEMENT.click();
				  try {
				   Thread.sleep(3000);
				  } catch (InterruptedException e) {
				   e.printStackTrace();
				  }
			 }
				  public String getAccountPageTitle() {
						
						 return driver.getTitle();
					 }
			 }
			 
			 
			 
			 
			 
			 
			 
			 
			 
		  


