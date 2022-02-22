package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    UserHelper userHelper;
    CarHelper car;
    HelperSearch search;

    Logger logger = LoggerFactory.getLogger(ApplicationManager.class);

    public void init(){
        wd = new ChromeDriver();
        logger.info("All tests starts in Chrome browser");
        wd.navigate().to("https://ilcarro.xyz/search");
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().window().maximize();

        userHelper = new UserHelper(wd);
        car = new CarHelper(wd);
        search = new HelperSearch(wd);



    }

    public void stop(){
        wd.quit();
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public CarHelper getCar() {
        return car;
    }

    public HelperSearch search(){
        return search;
    }


   // public CarHelper(WebDriver wd)
}
