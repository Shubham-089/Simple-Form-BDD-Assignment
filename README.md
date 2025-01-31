# Simple Form Submission Test Using BDD (Cucumber + Selenium + TestNG)

## Project Overview
This project demonstrates a simple form submission scenario using Behavior Driven Development (BDD) with Cucumber, Selenium, and TestNG. The form requires user inputs such as First Name, Last Name, Email, and Phone Number. After filling out the form, the system shows a confirmation message upon successful submission.

## Project Setup

### Prerequisites
Before you begin, make sure you have the following installed:
- **Java 8+**
- **Maven**
- **Eclipse/IntelliJ IDE**
- **TestNG** (for running the tests)
- **Cucumber** (for BDD framework)
- **Selenium WebDriver** (for browser automation)
- **ChromeDriver** (for browser interaction with Chrome)

### Setup Instructions

1. **Clone the Repository**
    ```bash
    git clone <your-repository-url>
    cd SimpleFormWithBDD_Project
    ```

2. **Install Dependencies**
    The project uses Maven as the build tool, so you can install dependencies using Maven.
    - Open your terminal in the project root directory and run:
      ```bash
      mvn clean install
      ```

3. **Setup ChromeDriver**
    Ensure that the ChromeDriver executable is in your system's `PATH`. Alternatively, you can specify the path in the code where you instantiate the `ChromeDriver`.

4. **Configure the Feature File**
    The feature file `simple-form.feature` contains the BDD steps for the test. The steps are written in Gherkin syntax.
    Example:

    ```gherkin
    Feature: To validate the Simple Form Submission

    Scenario: Submit the Simple Form
        Given open the enter the url simple form page
        When enter name "Shubham" in the first name field
        And enter surname "Yetonde" in the last name field
        And enter Email "shubhamyetonde865.com" in the email field
        And enter number "9876543210" in the phone number field
        And click the submit button
        Then confirmation message
    ```

### How to Run the Tests

1. **Run the Test Using TestNG**
    - In your `TestRunner` class, you can run the tests by right-clicking the `TestRunner` class file and selecting `Run As > TestNG Test`.
    
    Alternatively, you can run the tests via the command line:
    ```bash
    mvn test
    ```

### Project Structure

The project is structured as follows:

