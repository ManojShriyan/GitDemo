package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
//@RunWith(io.cucumber.junit.Cucumber.class)

public class stepDefination {

	@io.cucumber.java.en.Given("^User is on NetBanking LandingPage$")
	public void user_is_on_netbanking_landingpage() throws Throwable {
		System.out.println("navigate login");
	}

	@io.cucumber.java.en.When("^User login into Application with username & password$")
	public void user_login_into_application_with_username_password() throws Throwable {
		System.out.println("username password entred and logged in");

	}

	@io.cucumber.java.en.Then("^HomePage is populated$")
	public void homepage_is_populated() throws Throwable {
		System.out.println("logged in successfully");

	}

	@io.cucumber.java.en.When("^User login into Application with username \"([^\"]*)\" & password \"([^\"]*)\"$")
	public void user_login_into_application_with_username_something_password_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println("enter username & passwrd");

	}

	@io.cucumber.java.en.And("^Cards are displayed \"([^\"]*)\"$")
	public void cards_are_displayed_something(String strArg1) throws Throwable {
		System.out.println(strArg1);
	}

}
