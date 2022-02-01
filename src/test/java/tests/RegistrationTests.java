package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

    @BeforeMethod
    public void preConditionMethod(){
        if (app.getUserHelper().isLogged()){
            app.getUserHelper().logOut();
        }
    }

    @Test
    public void regTestPositive () {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        String eMail = "noa" + i + "@gmail.com";
        String password = "Nnoa12345$";
        String name = "Galina";
        String lastName = "Petrovna";
        System.out.println("Email: " + eMail);


        app.getUserHelper().openRegistrationForm();
        app.getUserHelper().fillRegForm(name,lastName,eMail,password);
        app.getUserHelper().submitCheckBoxXY();
        app.getUserHelper().submitRegForm();

    }

}

