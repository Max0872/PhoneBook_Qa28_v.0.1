package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{





    @Test
    public void loginTestPositiveNewContact(){
        app.userHelper().click(By.xpath("//a[.='LOGIN']"));
        app.userHelper().type(By.xpath("//input[@placeholder='Email']"),"noa@gmail.com");
       // type(By.xpath("//input[1]"),"noa@gmail.com");
        app.userHelper().type(By.xpath("//input[@placeholder='Password']"),"Nnoa12345$");
        app.userHelper().click(By.xpath("//button[.=' Login']"));
        app.userHelper().pause(2000);
     /*   String loginNC=getText(By.xpath("//div//h1[.=' No Contacts here!']"));
        Assert.assertEquals(loginNC,"No Contacts here!");*/

        String loginS = app.userHelper().getText(By.xpath("//a[.='ADD']"));

        Assert.assertEquals(loginS,"ADD");

    }
}
