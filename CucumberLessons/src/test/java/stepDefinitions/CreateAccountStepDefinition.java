package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CommonTextContent;
import pageObjects.CreateAccountPage;

public class CreateAccountStepDefinition {
	public CommonTextContent commonTextContent;
	public CreateAccountPage createAccountPage;

	public CreateAccountStepDefinition(CommonTextContent commonTextContent) {
		this.commonTextContent = commonTextContent;
	}

	@Given("Navigate to the Automation Test Store")
	public void navigate_to_the_automation_test_store() {
		// Write code here that turns the phrase above into concrete actions
		commonTextContent.driverManager.chromedriver().setup();
		commonTextContent.driver = new ChromeDriver();
//		commonTextContent.driver.manage().window().maximize();
		commonTextContent.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		commonTextContent.driver.get("https://automationteststore.com/");

	}

	@When("User Clicks the Login or Register")
	public void user_clicks_the_login_or_register() {
		// Write code here that turns the phrase above into concrete actions
		commonTextContent.driver.findElement(By.xpath("//a[normalize-space()='Login or register']")).click();

	}

	@Then("Click on the Continue")
	public void click_on_the_continue() {
		// Write code here that turns the phrase above into concrete actions
		commonTextContent.driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
	}

	@Then("User Enters all the Details for Create Account Form")
	public void user_enters_all_the_details_for_create_account_form() {
		// Write code here that turns the phrase above into concrete actions

		createAccountPage = new CreateAccountPage(commonTextContent);
		createAccountPage.yourPersonalData("Hello","World","Hello987@gmail.com","3216549870","7896541230");
		createAccountPage.yourAddress("Test", "one", "two", "city","Andhra Pradesh","321456", "India");
		createAccountPage.loginDetails("tetone","tetOne","tetOne");
	}

}
