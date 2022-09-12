package StepDefinitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import resources.InitializeDriver;

public class LaunchBrowser extends InitializeDriver {
    public static String sDefaultPath = System.getProperty("usr.dir");
    public static WebDriver driver;

    static{
        try{
            driver = Browsers("chrome"); //Choose which browser to test with
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public LaunchBrowser() throws Exception{}

    @Given("^I open the browser$")
    public void Iopenthebrowser() throws Throwable{
        String url = "http://automationpractice.com/"; //Application URL
        driver.manage().window().maximize();   //Maximize the browser
        driver.get(url);
        Thread.sleep(3000);
    }
}
