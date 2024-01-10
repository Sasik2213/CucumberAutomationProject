package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CommonTextContent;

public class LoginStepDefinition {
	public CommonTextContent commonTextContent;
	public LoginStepDefinition(CommonTextContent commonTextContent) {
		this.commonTextContent=commonTextContent;
	}
	
	@Given("Navigate to the Login Page")
	public void navigate_to_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		commonTextContent.driverManager.chromedriver().setup();
		commonTextContent.driver = new ChromeDriver();
		commonTextContent.driver.get("https://automationteststore.com/");
		commonTextContent.driver.findElement(By.xpath("//a[normalize-space()='Login or register']")).click();
	}
	@When("User enter username and Password")
	public void user_enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		commonTextContent.driver.findElement(By.xpath("//input[@id='loginFrm_loginname']")).sendKeys("tetone");
		commonTextContent.driver.findElement(By.xpath("//input[@id='loginFrm_password']")).sendKeys("tetOne");
	}
	@Then("Click Login Button")
	public void click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		commonTextContent.driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
}
