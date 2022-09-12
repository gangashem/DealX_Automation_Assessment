package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import resources.InitializeDriver;
import resources.ReusableMethods;

import java.io.StringReader;
import java.util.concurrent.TimeUnit;

import static javax.swing.UIManager.getInt;
import static resources.ReusableMethods.ValidateTextPresentOnElement;

public class Search extends InitializeDriver {
    public static String sDefaultPath = System.getProperty("user.dir");

    //Enter text into the search area
    @Given("^I search for \"([^\"]*)\" in search area$")
    public void iSearchForInSearchArea(String arg0) throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //wait method for 10 second
        driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("SearchField",sDefaultPath + "/src/test/java/resources/ElementLocator.properties"))).sendKeys(Keys.chord(Keys.CONTROL, "a"),arg0);
    }

    //Making use of Excel to enter text into the search area
    @Given("^I search for Item in search area$")
    public void iSearchForItemInSearchArea() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //wait method for 10 second
        driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("SearchField",sDefaultPath + "/src/test/java/resources/ElementLocator.properties"))).sendKeys(Keys.chord(Keys.CONTROL, "a"),ReusableMethods.datareading(sDefaultPath+ "/ExcelData/TestData.xlsx",0,1,0)); //Entering data inputs from excel sheet
    }

    //Clicking on the search button
    @And("^I click on search button$")
    public void iClickOnSearchButton() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //wait method for 10 second
        driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("SearchButton",sDefaultPath + "/src/test/java/resources/ElementLocator.properties"))).click();
    }


    @Then("^I verify the first item matches the search criteria$")
    public void iVerifyTheFirstItemMatchesTheSearchCriteria() throws Throwable{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //wait method for 10 second
        boolean result = ValidateTextPresentOnElement(driver,"xpath",ReusableMethods.ReadElementsLocator("First_Item_Results",sDefaultPath + "/src/test/java/resources/ElementLocator.properties"),"Printed Summer Dress"); //Verifying text in results for similarity
        Assert.assertTrue("[Error- The first item does not match with the search criteria",result); // Asserting method to compare
    }

    @Given("^I Search and Verify Three different search criteria$")
    public void iSearchAndVerifyThreeDifferentSearchCriteria(String inputs) throws Throwable{
        String searchCriteria = "T-shirts,Dresses,Blouses";
        int count = getInt("comments.size");
        StringReader str = new StringReader(searchCriteria);
        for(int i = 0; 1 < count; i++){
            //inputs = str.read("["+i+"]");
            driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("SearchField",sDefaultPath + "/src/test/java/resources/ElementLocator.properties"))).sendKeys(Keys.chord(Keys.CONTROL, "a"),searchCriteria);
        }
    }
}
