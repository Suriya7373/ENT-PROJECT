package Login;

import Base.Baseconstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import static jdk.internal.org.jline.utils.Colors.s;

public class LoginThroughNewBaseMethod extends Baseconstructor  {
    //WebDriver driver;
    public  LoginThroughNewBaseMethod()    {


    }
    //extends Baseconstructor

        public LoginThroughNewBaseMethod(WebDriver driver) {
            this.driver = driver;
     System.out.println("login Constructor");
    }

    public void MethodLoginPage()
    {

        Baseconstructor base=new Baseconstructor();
        //base.LaunchBrowser();
        driver.get("https://entdemo.eblucare.com");
        base.MaxmimizeWindow();
        //base.ImplictWait(5);
        //base.SleepMethod(1000);
        base.ClickUsingSendKeys(base.prop.getProperty("username"), "bluehospital@eblucare.com");
        base.ClickUsingSendKeys(base.prop.getProperty("password"), "Welcome@123");
        base.ClickUsingWait(base.prop.getProperty("signinbtn"));


    }
}
