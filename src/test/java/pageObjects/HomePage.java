package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{

//  Create local driver object for this HomePage Class.
	public WebDriver driver;
	
	By SearchButton = By.className("search-keyword");
	By SearchResult = By.cssSelector("h4.product-name");
	By IncrementButton = By.cssSelector("a.increment");
	By AddToCartButton = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By CartButton = By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");
	By ProceedToCheckoutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
//  Create a constructor and ask to pass "driver (driver = initialiseDriver())" into HomePage Class and that inform to HomePage Class to expect a driver variable coming to HomePage Class.
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
		 
	public WebElement getSearchButton()
	{
		return driver.findElement(SearchButton);
	}
	
	public WebElement getSearchResult()
	{
		return driver.findElement(SearchResult);
	}
	
	public WebElement getIncrementButton()
	{
		return driver.findElement(IncrementButton);
	}
	
	public WebElement getAddToCartButton()
	{
		return driver.findElement(AddToCartButton);
	}
	
	public WebElement getCartButton()
	{
		return driver.findElement(CartButton);
	}
	
	public WebElement getProceedToCheckoutButton()
	{
		return driver.findElement(ProceedToCheckoutButton);
	}

	
}