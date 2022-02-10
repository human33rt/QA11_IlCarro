package manager;

import models.Car;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarHelper extends HelperBase {
    public CarHelper(WebDriver wd) {
        super(wd);
    }

    public void openCarForm() {
        click(By.id("1"));
    }

    public void fillCarForm(Car car) {
        if (isCarCreationFormPresent()) {
        }
    }

    // boolean isCarCreationFormPresent(){
      //  Boolean isForm = new WebDriverWait(wd,10)
              //  .until(ExpectedConditions
                    //    .textToBePresentInElement(wd.findElement(By.cssSelector("h2")), "Write some details about you car to rent it"));
//return isForm;
    }
   // public void attachedPhoto(){
//wd.findElement(By.id("photos")).sendKeys("");
    }
}


