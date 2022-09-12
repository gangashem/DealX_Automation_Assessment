package TestRunner;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features"
        },
        glue = {"StepDefinitions"},

        tags = {"@OpenBrowser," +
                "@TC4_SignIn_scenario," +
                "@TC1_VerifySearchResults," +
                "@TC2_VerifySearchResults," +
                "@TC3_VerifySearchResults," +
                "@TC5_AddItemToShoppingCart," +
                "@TC6_MenuNavigation"
                },

        plugin = {
                "html:target/cucumber-report/",
                "json:target/Cucumber.json",
                "pretty:target/cucumber-pretty.txt",
                "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"
        })

public class TestRunner {
        @BeforeClass
        public static void setReportConfiguration()
        {
                ExtentProperties property = ExtentProperties.INSTANCE;
                property.setReportPath( "./Reports/DealX Assessment Report.html");
        }
        @AfterClass
        public static void setConfiguration()
        {
                Reporter.loadXMLConfig("./ConfigFile/Extent-config.xml");
                Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
                Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        }
}
