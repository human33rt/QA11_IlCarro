package tests;

import com.sun.media.jfxmedia.logging.Logger;
import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTests extends TestBase{
    @BeforeMethod
    public void preConditionMethod(){
        if (app.getUserHelper().isLogged()){
            app.getUserHelper().logOut();
        }
    }
    @Test
    public void LoginPositiveTest(){
        logger.info("LoginPositiveTest");
        User user = new User().withEmail("noa@gmail.com").withPassword("Nnoa12345$");
        logger.info("LoginPositiveTest");

        //app.getUserHelper().fillLoginForm("noa@gmail.com", "Nnoa12345$");
        app.getUserHelper().openLoginForm();
        app.getUserHelper().fillLoginForm(user);
        app.getUserHelper().submitLogin();
        //find OK button
        //app.getUserHelper().okSubmit();
        // Assert.assertTrue(wd.findElement(By.xpath("//*[@href='/logout?url=%2Fsearch']")).isDisplayed());
        Assert.assertTrue(app.getUserHelper().isLogged());

    }

    @Test
    public void LoginPositiveTest2(){

        String eMail="noa@gmail.com";
        String password="Nnoa12345$";

        app.getUserHelper().openLoginForm();
        app.getUserHelper().fillLoginForm(eMail,password);
        app.getUserHelper().submitLogin();

        //app.getUserHelper().okSubmit();

        //Assert.assertTrue(isElementPresent(By.xpath("//*[@href='/logout?url=%2Fsearch']")));
        Assert.assertTrue(app.getUserHelper().isLogged());

    }


    @Test
    public void LoginWrongPasswordTest(){
        String eMail="noa@gmail.com";
        String password="noa12345$";

        app.getUserHelper().openLoginForm();
        app.getUserHelper().fillLoginForm(eMail,password);
        app.getUserHelper().submitLogin();


        Assert.assertFalse(app.getUserHelper().isLogged());

    }
    @AfterMethod
    public void postCondition(){
        app.getUserHelper().okSubmit();
    }


}
