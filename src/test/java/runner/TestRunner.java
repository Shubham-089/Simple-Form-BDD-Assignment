package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "C:\\Users\\Shubham.Yetonde\\Selenium_Assignments_File\\SimpleFormWithBDD_Project\\src\\test\\resources",
        glue = "stepDefinitions"

)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
