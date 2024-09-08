package Login;
import Base.Baseconstructor;
import org.openqa.selenium.WebDriver;
public class AudiologyModule  extends Baseconstructor {
    public AudiologyModule() {
        System.out.println("TriageModule");
    }
    public AudiologyModule(WebDriver driver) {
        this.driver = driver;
    }

    public void Audiology() {
        Baseconstructor base = new Baseconstructor();
        base.SleepMethod(10000);
        base.ClickUsingWait(base.prop.getProperty("Audiology"));
        base.SleepMethod(10000);
        base.ClickUsingSendKeys(base.prop.getProperty("Patientname2"), "Eve");

        //clivking on Rabinpatient
        base.ClickUsingWait(base.prop.getProperty("Eve1"));

        //searchpatient
        base.ClickUsingWait(base.prop.getProperty("searchpatient2"));

        //Edite autiologytest
        base.SleepMethod(5000);
        base.ClickUsingWait(base.prop.getProperty("autiologytest"));
        //clicking on speechtherpy
        base.ClickUsingWait(base.prop.getProperty("speechtherpy"));

        //Right side test
        base.ClickUsingSendKeys(base.prop.getProperty("RST"), "5");

        //SD.s
        base.ClickUsingSendKeys(base.prop.getProperty("SDSRight"), "6");

        //sisiright
        base.ClickUsingSendKeys(base.prop.getProperty("sisiright"), "6");

        //TDTRight
        base.ClickUsingSendKeys(base.prop.getProperty("TDTRight"), "6");

        //ABLBRight
        base.ClickUsingSendKeys(base.prop.getProperty("ABLBRight"), "6");


        //SRTLeft
        base.ClickUsingSendKeys(base.prop.getProperty("SRTLeft"), "6");

        //SD.sLeft
        base.ClickUsingSendKeys(base.prop.getProperty("SDSRLeft"), "6");

        //sisiLeft
        base.ClickUsingSendKeys(base.prop.getProperty("sisiLeft"), "6");

        //TDTLeft
        base.ClickUsingSendKeys(base.prop.getProperty("TDTLeft"), "6");

        //ABLBLeft
        base.ClickUsingSendKeys(base.prop.getProperty("ABLBRLeft"), "6");

        //entering password to signup purpose
        base.ClickUsingSendKeys(base.prop.getProperty("password1"), "Welcome@123");









    }
}