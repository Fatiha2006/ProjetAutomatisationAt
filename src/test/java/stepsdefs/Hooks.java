package stepsdefs;

import manager.DriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void setup(){
        driver = DriverManager.getDriver();
    }

}
