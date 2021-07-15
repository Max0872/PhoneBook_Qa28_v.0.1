package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{





    @Test
    public void loginTestPositiveNewContact(){
        click(By.xpath("//a[.='LOGIN']"));
        type(By.xpath("//input[@placeholder='Email']"),"noa@gmail.com");
        type(By.xpath("//input[@placeholder='Password']"),"Nnoa12345$");
        click(By.xpath("//button[.=' Login']"));
        pause(2000);
     /*   String loginNC=getText(By.xpath("//div//h1[.=' No Contacts here!']"));
        Assert.assertEquals(loginNC,"No Contacts here!");*/
        String loginS = wd.findElement(By.xpath("//a[.='ADD']")).getText();
        Assert.assertEquals(loginS,"ADD");

    }
}
