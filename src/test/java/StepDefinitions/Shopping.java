package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import resources.InitializeDriver;
import resources.ReusableMethods;

import java.util.concurrent.TimeUnit;

public class Shopping extends InitializeDriver {
    public static String sDefaultPath = System.getProperty("user.dir");

    @Given("^I add item to shopping cart$")
    public void iAddItemToShoppingCart() throws Throwable{
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //wait method for 10 second
        /*Make use of JavaScript Click
        * Click on Add to Cart
        * */
        WebElement element = driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("AddToCart", sDefaultPath + "/src/test/java/resources/ElementLocator.properties")));//
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    @When("^I view shopping cart$")
    public void iViewShoppingCart() throws Throwable{
        ReusableMethods.switchWindows(); // Switch to new window
        Thread.sleep(5000);
        /*Make use of JavaScript Click
         * View shopping cart/Click on proceed to checkout
         * */
        WebElement element = driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("ProceedToCheckout", sDefaultPath + "/src/test/java/resources/ElementLocator.properties")));//
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    @And("^I increase \"([^\"]*)\" quantity$")
    public void iIncreaseQuantity(String arg0) throws Throwable {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //wait method for 10 second
        driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("QuantityInput",sDefaultPath + "/src/test/java/resources/ElementLocator.properties"))).sendKeys(Keys.chord(Keys.CONTROL, "a"),arg0);
    }

    @Then("^I calculate and verify total amount$")
    public void iCalculateAndVerifyTotalAmount() throws Throwable {
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //wait method for 10 second
        Thread.sleep(5000);
        ReusableMethods.calculateTotalPrice(28.98,3); //Unit Price and Quantity variables assigned
    }
}
