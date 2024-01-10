package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class CreateAccountPage {

	public CommonTextContent commonTextContent;
	public CreateAccountPage(CommonTextContent commonTextContent) {
		this.commonTextContent=commonTextContent;
		PageFactory.initElements(commonTextContent.driver,this);
	}
	@FindBy(xpath = "//input[@id='AccountFrm_firstname']")
	WebElement firstName;
	@FindBy(xpath = "//input[@id='AccountFrm_lastname']")
	WebElement lastName;
	@FindBy(xpath = "//input[@id='AccountFrm_email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='AccountFrm_telephone']")
	WebElement telephoneNum;
	@FindBy(xpath = "//input[@id='AccountFrm_fax']")
	WebElement fax;
	@FindBy(xpath = "//input[@id='AccountFrm_company']")
	WebElement companyName;
	@FindBy(xpath = "//input[@id='AccountFrm_address_1']")
	WebElement addressOne;
	@FindBy(xpath = "//input[@id='AccountFrm_address_2']")
	WebElement addressTwo;
	@FindBy(xpath = "//input[@id='AccountFrm_city']")
	WebElement city;
	@FindBy(xpath = "//select[@id='AccountFrm_zone_id']")
	WebElement state;
	@FindBy(xpath = "(//input[@id='AccountFrm_postcode'])[1]")
	WebElement zipCode;
	@FindBy(xpath = "//select[@id='AccountFrm_country_id']")
	WebElement country;
	@FindBy(xpath = "//input[@id='AccountFrm_loginname']")
	WebElement loginName;
	@FindBy(xpath = "//input[@id='AccountFrm_password']")
	WebElement passwordD;
	@FindBy(xpath = "//input[@id='AccountFrm_confirm']")
	WebElement confirmPassword;
	@FindBy(xpath = "//input[@id='AccountFrm_newsletter1']")
	WebElement yesBtn;
	@FindBy(xpath = "(//input[@id='AccountFrm_newsletter0'])[1]")
	WebElement noBtn;
	@FindBy(xpath = "//input[@id='AccountFrm_agree']")
	WebElement checkBox;
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement continueBtn;
	public void loginDetails(String loginNames,String passCode,String passConfirmCode) {
		loginName.sendKeys(loginNames);
		passwordD.sendKeys(passCode);
		confirmPassword.sendKeys(passConfirmCode);
		yesBtn.click();
		checkBox.click();
		continueBtn.click();
	}
	public void yourPersonalData(String fname,String lname,String emailId,String telePhone,String faxNumber) {
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		email.sendKeys(emailId);
		telephoneNum.sendKeys(telePhone);
		fax.sendKeys(faxNumber);
	}
	public void yourAddress(String company,String address_1,String address_2,String cityN,String stateName,String ZipCode,String CountryName) {
		commonTextContent.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		country.sendKeys(myChoiceCountry(CountryName));
		companyName.sendKeys(company);
		addressOne.sendKeys(address_1);
		addressTwo.sendKeys(address_2);
		city.sendKeys(cityN);
		state.sendKeys(myChoiceState(stateName));
		zipCode.sendKeys(ZipCode);
		
		
	}
	public String myChoiceCountry(String countryName) {
		Select selectCountry = new Select(country);
		selectCountry.selectByVisibleText(countryName);
		return countryName;
	}	
	public String myChoiceState(String stateName) {
		Select selectCountry = new Select(state);
		selectCountry.selectByVisibleText(stateName);
		return stateName;
	}	

	
	
	
	
}
