package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InitializeDriver {
    protected static WebDriver driver;
    public static WebDriver Browsers(String browser) throws Exception{

        if(browser.equalsIgnoreCase("chrome")) //Check if parameter passed
        {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "Drivers/MSEdgeDriverServer.exe");
            driver = new EdgeDriver();
        }
        else{
            throw new Exception("Incorrect Browser"); //Throw an exception if no browser is passed throw
        }
        return driver;
    }
}
