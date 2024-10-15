package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.*;

public class LoginSteps {
	
	
	
	@Given("user is on Login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user is on Login Page");
	}

	@When("user enters User name and password")
	public void user_enters_user_name_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enter the user name password");
	}

	@And("Clicks login button")
	public void clicks_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Clicks Login Button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("redirected to Home Page");
	}
	
	
	
	
	
	
}
