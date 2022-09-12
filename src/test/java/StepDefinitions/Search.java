package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import resources.InitializeDriver;
import resources.ReusableMethods;

import java.io.StringReader;
import java.util.List;
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

    /*
    * Method to Manipulate the string and store each search criteria in an array and use a loop to perform the search and verify
    * */
    @Given("^I Search and Verify Three different search criteria$")
    public void iSearchAndVerifyThreeDifferentSearchCriteria() throws Throwable{
        String[] searchCriteria = {"T-shirts","Dress","Blouse"};
        for(int i = 0; i < searchCriteria.length; i++){
            driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("SearchField",
                        sDefaultPath + "/src/test/java/resources/ElementLocator.properties"))).sendKeys(Keys.chord(Keys.CONTROL, "a"),searchCriteria[i]);
             //Click on search button
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //wait method for 10 second
            driver.findElement(By.xpath(ReusableMethods.ReadElementsLocator("SearchButton",sDefaultPath + "/src/test/java/resources/ElementLocator.properties"))).click();
            //Verify search criteria
            boolean result = ReusableMethods.ValidateTextOnPage(driver,searchCriteria[i]); //Verifying text in results for similarity
            Assert.assertTrue("[Error- The first item does not match with the search criteria",result); // Asserting method to compare
        }
    }
}
