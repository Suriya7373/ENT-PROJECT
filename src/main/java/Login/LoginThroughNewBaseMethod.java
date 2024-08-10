package Login;

import Base.Baseconstructor;
import org.testng.annotations.Test;

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
//        driver.get("https://entdemo.eblucare.com");
          driver.get(url);
        base.MaxmimizeWindow();
        //base.ImplictWait(5);
      // base.ClickUsingSendKeys("//*[@id='mat-input-0']","bluehospital@eblucare.com");
       // base.ClickUsingSendKeys("//*[@type='password']","Welcome@123");

        //base.ClickUsingWait("//*[text()=' Sign in ']");
        //base.SleepMethod(1000);
//
       base.ClickUsingSendKeys(base.prop.getProperty("username"), "bluehospital@eblucare.com");
        base.ClickUsingSendKeys(base.prop.getProperty("password"), "Welcome@123");
//
////
        base.ClickUsingWait(base.prop.getProperty("signinbtn"));


    }
}
