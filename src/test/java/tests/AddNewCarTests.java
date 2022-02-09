package tests;

import models.Car;
import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewCarTests extends TestBase {

    //is logged?--------------> precondition
    //open form
    //fill form + model Car
    //attach photo
    //submit

    @BeforeMethod
    public void precondition(){
        if(!app.getUserHelper().isLogged()){
            app.getUserHelper().login(new User().withEmail("noa@gmaim.com").withPassword("Nnoa12345$"));
        }

    }
    @Test
    public void addNewCarPositive(){
        int i= (int)((System.currentTimeMillis()/1000)%3600);
        Car car =Car.builder()
             .address("Tel Aviv")
             .make("BMW")
             .model("M5")
             .year("2020")
             .engine("2.3")
             .fuel("Petrol")
             .gear("MT")
             .WD("AWD")
             .door("5")
             .seats("4")
             .clasS("C")
             .fuelConsumption("6.5")
             .carRegNumber("100-55-" +i)
             .price("65")
             .distanceIncluded("500")
             .typeFeature("type of")
             .about("Very nice car")
             .build();

     app.getCar().openCarForm();
    app.getCar().fillCarForm(car);
    app.getCar().attachedPhoto();
    app.getUserHelper().submitLogin();


    }
}
