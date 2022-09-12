package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import resources.InitializeDriver;
import resources.ReusableMethods;

import java.util.concurrent.TimeUnit;

public class NavigationMenu extends InitializeDriver {
    public static String sDefaultPath = System.getProperty("user.dir");

    @Given("^That i hover over Women Menu And I click on T-shirts subcategory$")
    public void thatIHoverOverWomenMenuAndIClickOnTShirtsSubcategory() throws Throwable{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //wait method for 10 second
        //Call the Hovering method
        ReusableMethods.MouseHover(driver,
                driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("WomenMenu",sDefaultPath + "/src/test/java/resources/ElementLocator.properties"))), //Hover over Women Menu
                driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("T-shirts",sDefaultPath + "/src/test/java/resources/ElementLocator.properties")))); //Click on T-shirts subcategory

    }

    @Then("^I Verify the correct page has been loaded$")
    public void iVerifyTheCorrectPageHasBeenLoaded() throws Throwable{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //wait method for 10 second
        //Validate correct page has been loaded
        boolean result = ReusableMethods.ValidateTextOnPage(driver,"T-shirts");
        Assert.assertTrue("[ERROR - Text not found on the Page, Therefore Incorrect page]",result);
    }

}
