package cucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
				features = "src/test/java/features",
//              features provides the location of the feature files
				
				glue = "stepDefinitions",
//				glue provides the location of the stepDefinitions files 
				
//				tags = "@SmokeTest or @RegTest",
				tags = "@Selenium",
				
				stepNotifications = true,
				
				monochrome = true,
//				This monochrome option can either set as true or false. 
//				true: it means that the console output for the Cucumber test are much more readable and remove any unreadable characters. 
//				false: then the console output is not as readable as it should be
				
				strict = true,
				
				plugin = {"pretty", "html:target/cucumber" , "json:target/cucumber.json" , "junit:target/results.xml"}					
		)

public class TestRunner 
{
	

}
