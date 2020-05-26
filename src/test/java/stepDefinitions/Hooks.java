package stepDefinitions;
import cucumber.CucumberProject.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base
{
	@Before("@Reg")
	public void BeforeRegTestValidation ()
	{
		System.out.println("@BeforeRegTestHooks");
	}
	
	@After("@Reg")
	public void AfterRegTestValidation ()
	{
		System.out.println("@AfterRegTestHooks");
	}
	
	@Before("@Smoke")
	public void BeforeSmokeTestValidation ()
	{
		System.out.println("@BeforeSmokeTestHooks");
	}
	
	@After("@Smoke")
	public void AfterSmokeTestValidation ()
	{
		System.out.println("@AfterSmokeTestHooks");
	}
	
	@After("SmokeTest")
	public void teardown ()
	{
		driver.close();
	}

}
