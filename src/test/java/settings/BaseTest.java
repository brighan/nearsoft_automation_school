package settings;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import settings.DriverSetup;

abstract public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite
    public void suitSetup(){
        this.driver = new DriverSetup("chrome",false).getDriver();
        this.driver.get("https://store.steampowered.com/?l=spanish");
    }

    @AfterSuite
    public void suitTearDown(){
        this.driver.close();
        this.driver.quit();
    }
}
