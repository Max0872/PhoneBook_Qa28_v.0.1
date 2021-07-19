package tests;

import manager.AppManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

   protected static AppManager app = new AppManager();

    @BeforeClass
    public void init() {
       app.start();
    }


    @AfterClass
    public void tearDown() {
       app.stop();
    }


    }



