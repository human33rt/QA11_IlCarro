package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    UserHelper userHelper;

    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro.xyz/search");
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().window().maximize();

        userHelper = new UserHelper(wd);

    }

    public void stop(){
        wd.quit();
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }
}
