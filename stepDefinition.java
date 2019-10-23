package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefinition {
	
	@Given("^User is on NetBanking Landing page$")
	public void user_is_on_NetBanking_Landing()
	{
		System.out.println("navigated to login url");
	}
	
	@When("^User login using username and password$")
	public void User_login_using_username_password()
	{
		System.out.println("logged in successfully");
	}
	
	@Then("^Home page is populated$")
	public void Home_page_is_populated()
	{
		System.out.println("validated home page");
	}
	
	@And("^Cards are displayed$")
	public void Cards_are_displayed()
	{
		System.out.println("validated cards");
	}
	

}
