package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {

    @Test
    public void searchPeriodCurrentMonth(){
        //2/25/2022 - 2/28/2022

        app.search().fillSearchFormCurrentMonth("Tel Aviv, Israel","2/25/2022","2/28/2022");
        app.getUserHelper().submitRegForm();

        //Assert.assertTrue(app.search().isListOfCarsAppeared());
        Assert.assertTrue(app.search().isListOfCarsAppeared());
    }
    @Test
    public void searchPeriodCurrentMonth2(){
        //2/25/2022 - 2/28/2022

        app.search().fillSearchFormCurrentMonth("Haifa, Israel","2/25/2022","2/28/2022");
       // app.search().pause(7000);
        app.getUserHelper().submitRegForm();

        //Assert.assertTrue(app.search().isListOfCarsAppeared());
        Assert.assertTrue(app.search().isListOfCarsAppeared());
    }
//    @Test
//    typePeriodInPast(){}

    @Test
    public void typePeriodInFuture(){

    }
    //"3/30/2022", "2/22/2023"
    @Test
    public void searchPeriodAnyDataInFuture(){
        app.search().fillSearchFormInFuture("Haifa","3/30/2022","2/22/2023");
        app.search().pause(7000);
        app.getUserHelper().submitRegForm();

        Assert.assertTrue(app.search().isListOfCarsAppeared());
    }

    @AfterMethod
    public void postCondition(){
        app.search().returnToHome();
    }
}
