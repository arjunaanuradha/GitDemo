package stepDefinitions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.CucumberProject.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class MyStepDefinitions extends Base {
	
//	public WebDriver driver;
	HomePage homePage;

    @Given("^User is GreenKart langing page$")
    public void user_is_greenkart_langing_page() throws Throwable {
    	
    	driver = initialiseDriver();
    	
    }

    @When("^User searches for (.+)$")
    public void user_searches_for(String name) throws Throwable {
        
	 // homePage object calls Base's Class driver and pass it in to the HomePage Class   	 
    	homePage = new HomePage(driver);
    	homePage.getSearchButton().sendKeys(name); 
    	Thread.sleep(3000);
    }

    @Then("^(.+) results are displayed$")
    public void results_are_displayed(String name) throws Throwable {
        
	homePage = new HomePage(driver);
    	Assert.assertTrue(homePage.getSearchResult().getText().contains(name));

    }
    
    @Then("^Verify selected \"([^\"]*)\" item displays in check out page$")
    public void verify_selected_something_item_displays_in_check_out_page(String strArg1) throws Throwable {
      
    	homePage = new HomePage(driver);
    	Assert.assertTrue(homePage.getSearchResult().getText().contains(strArg1));
    	
    }

    @And("^Add items to cart$")
    public void add_items_to_cart() throws Throwable {
    	 	
    	homePage = new HomePage(driver);
    	for(int i=0; i<2;i++)
    	{
    		homePage.getIncrementButton().click();
    	}
    	homePage.getAddToCartButton().click();
      
    }

    @And("^User proceeds to checkout page for purchase$")
    public void user_proceeds_to_checkout_page_for_purchase() throws Throwable {
    	
    	homePage = new HomePage(driver);
    	homePage.getCartButton().click();
    	homePage.getProceedToCheckoutButton().click();
	
    }

}