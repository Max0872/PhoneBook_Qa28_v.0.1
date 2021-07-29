package tests;

import manager.AppManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestBase {

   protected static AppManager app = new AppManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeSuite
    public void init() {
       app.start();
    }


    @AfterSuite
    public void tearDown() {
       app.stop();
    }


    }



