package Login;

import Base.Baseconstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
public class LoginThroughNewBaseMethod extends Baseconstructor {
    public LoginThroughNewBaseMethod()
    {
     System.out.println("login Constructor");
    }
    @Test
    public void MethodLoginPage()
    {

        Baseconstructor base=new Baseconstructor();
        LaunchBrowser();
        driver.get("https://entdemo.eblucare.com");
        base.MaxmimizeWindow();
        //base.ImplictWait(5);
        base.ClickUsingSendKeys("//*[@id='mat-input-0']","bluehospital@eblucare.com");
        base.ClickUsingSendKeys("//*[@type='password']","Welcome@123");
        //base.ClickUsingWait("//*[text()=' Sign in ']");
        //base.SleepMethod(1000);
        base.ClickUsingWait(base.prop.getProperty("signinbtn"));

    }
}
