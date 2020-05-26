package stepDefinitions;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition 
{
	
		@Given("^Validate browser$")
	    public void validate_browser() throws Throwable {
	       System.out.println("Background - Given");
	    }
	
	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	    	System.out.println("Background- When");
	    }
	
	    @Then("^Check if browser is opened$")
	    public void check_if_browser_is_opened() throws Throwable {
	    	System.out.println("Background - Then");
	    }
	
		@Given("^User is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
	       System.out.println("@Given");
	    }

	    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
	    	System.out.println(strArg1);
	    	System.out.println(strArg2);
	        
	    }

	    @Then("^Home page is displayed$")
	    public void home_page_is_displayed() throws Throwable {
	        System.out.println("@Then");
	    }

	    @And("^Cards are diplayed \"([^\"]*)\"$")
	    public void cards_are_diplayed_something(String strArg1) throws Throwable {
	    	System.out.println(strArg1);
	    }
	    
	    @When("^User sign up with following data$")
	    public void user_sign_up_with_following_data(DataTable data) throws Throwable {
	    	List<List<String>> list = data.asLists();
	    	System.out.println(list.get(0).get(0));
	    	System.out.println(list.get(0).get(1));
	    	System.out.println(list.get(0).get(2));
	    	System.out.println(list.get(0).get(3));
	    	System.out.println(list.get(0).get(4));
	    }
	    
	    @When("^User login in to application with (.+) and (.+)$")
	    public void user_login_into_application_with_and(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }
}
























