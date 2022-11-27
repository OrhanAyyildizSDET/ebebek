package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.Driver;

public class Hook {
    public static RequestSpecification specification;

    @Before(value = "@tokenApi")
    public void medunnaUrlSetup(){
        specification = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("site_url")).build();
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","failed_scenario");
        }
        else {
            System.out.println("After hooks");
        }
    }
    @After(value = "@Close")
    public void closeBrowser(){

        Driver.closeDriver();

    }
}
