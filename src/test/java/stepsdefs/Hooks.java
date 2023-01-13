package stepsdefs;

import cucumber.api.java.Before;
import manager.DriverManager;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void setup(){
        driver = DriverManager.getDriver();
    }

}
