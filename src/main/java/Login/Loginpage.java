package Login;

import POM.LoginpagePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
import java.time.Duration;
import static POM.LoginpagePOM.*;
public class Loginpage {
    //public static WebDriver driver = new ChromeDriver();
    public WebDriver driver;
    // Constructor to set the WebDriver instance
    public Loginpage(WebDriver driver) {

        this.driver = driver;
    }
    public void Setup() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
        driver.get("https://entdemo.eblucare.com");
        driver.manage().window().maximize();
        PageFactory.initElements (driver, LoginpagePOM.class);
        //Entering  username
        Entering_mailID.sendKeys ("bluehospital@eblucare.com");
        //Entering  password
        Entering_Password.sendKeys("Welcome@123");
        //clicking on signinbutton
        Signin.click();


    }
}
