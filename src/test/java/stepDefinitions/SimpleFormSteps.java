package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleFormSteps {

	
	  WebDriver driver;

	    @Given("open the enter the url simple form page")
	    public void openSimpleFormPage() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://v1.training-support.net/selenium/simple-form");
	    }

	    @When("enter name {string} in the first name field")
	    public void enterFirstName(String firstName) {
	        driver.findElement(By.id("firstName")).sendKeys(firstName);
	    }

	    @When("enter surname {string} in the last name field")
	    public void enterLastName(String lastName) {
	        driver.findElement(By.id("lastName")).sendKeys(lastName);
	    }

	    @When("enter Email {string} in the email field")
	    public void enterEmail(String email) {
	        driver.findElement(By.id("email")).sendKeys(email);
	    }

	    @When("enter number {string} in the phone number field")
	    public void enterPhoneNumber(String phoneNumber) {
	        driver.findElement(By.id("number")).sendKeys(phoneNumber);
	    }

	    @When("click the submit button")
	    public void clickSubmitButton() {
	        driver.findElement(By.cssSelector("input[type='submit']")).click();
	    }

	    @Then("confirmation message")
	    public void verifyConfirmationMessage() {
	        System.out.println("Form submitted successfully!");
	       driver.quit();
	    }
	}