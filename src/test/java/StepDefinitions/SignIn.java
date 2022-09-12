package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import resources.InitializeDriver;
import resources.ReusableMethods;

import java.util.concurrent.TimeUnit;

public class SignIn extends InitializeDriver {
    public static String sDefaultPath = System.getProperty("user.dir");

    //Clicking on Sign in Link
    @Given("^I click on Sign in link$")
    public void iClickOnSignInLink() throws Throwable{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //wait method for 10 second
        driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("SignInLink", sDefaultPath + "/src/test/java/resources/ElementLocator.properties"))).click();// Click on Sign in Link
    }

    /*Enter the username
    * */
    @And("^i enter the username$")
    public void iEnterTheUsername() throws Throwable{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //wait method for 10 second
        driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("Username", sDefaultPath + "/src/test/java/resources/ElementLocator.properties")))
                .sendKeys(ReusableMethods.ReadElementsLocator("Username",sDefaultPath + "/src/test/java/resources/GlobalVariables.properties")); // locate the username input data in global variables
    }

    /*Enter password
    * */
    @And("^i enter the password$")
    public void iEnterThePassword() throws Throwable{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //wait method for 10 second
        driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("Password", sDefaultPath + "/src/test/java/resources/ElementLocator.properties")))
                .sendKeys(ReusableMethods.ReadElementsLocator("Password",sDefaultPath + "/src/test/java/resources/GlobalVariables.properties")); // locate the password input data in global variables
    }

    /*Clicking on the Sign In Button
    *  */
    @Then("^i click on SignIn button$")
    public void iClickOnSignInButton() throws Throwable{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //wait method for 10 second
        driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("SignInButton", sDefaultPath + "/src/test/java/resources/ElementLocator.properties"))).click();// Click on login button
    }
}
