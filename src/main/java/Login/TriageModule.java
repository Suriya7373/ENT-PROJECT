package Login;

import Base.Baseconstructor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class TriageModule extends Baseconstructor {
    public TriageModule() {
        System.out.println("TriageModule");

    }
    public TriageModule(WebDriver driver) {
        this.driver = driver;
    }
    public void Triage() {
        Baseconstructor base = new Baseconstructor();
        //Clicking on TriageModule
        base.SleepMethod(10000);
        base.ClickUsingWait(base.prop.getProperty("TriageModule"));
        //Searching on patient name
        base.SleepMethod(10000);
        base.ClickUsingSendKeys(base.prop.getProperty("Patientname"), "Rabin");
        //clicking on Rabinpatient
        base.ClickUsingWait(base.prop.getProperty("Rabinpatient"));
        //searchpatient
        base.ClickUsingWait(base.prop.getProperty("searchpatient"));
        ////Editetriage
        base.SleepMethod(5000);
        int attempts = 0;
        while(attempts < 3) {
            try {
                base.ClickUsingWait(base.prop.getProperty("Editetriage"));
                break;
            } catch(StaleElementReferenceException e) {

                attempts++;
            }
        }

        //Entering vitals data
        // choosing RecordedBy
        base.SleepMethod(50000);
        base.ClickUsingWait(base.prop.getProperty("RecordedBy"));
        //choosing recodrded by doctorname
        base.ClickUsingWait(base.prop.getProperty("doctorname"));
        //Entering Hight
        base.ClickUsingSendKeys(base.prop.getProperty("Hight"), "160");
        //entering Weight
        base.ClickUsingSendKeys(base.prop.getProperty("Weight"), "80");
        //Entering Temperature
        base.ClickUsingSendKeys(base.prop.getProperty("Temperature"), "90");
        //choose patient diabetic yes/no
        base.ClickUsingWait(base.prop.getProperty("diabetic"));
        //choosing bloodpressure yes/no
        base.ClickUsingWait(base.prop.getProperty("bloodpressure"));
        //clicking on save button
        base.ClickUsingWait(base.prop.getProperty("save1"));
        //clicking on close button
        base.ClickUsingWait(base.prop.getProperty("close1"));
        //clicking on next button
        base.ClickUsingWait(base.prop.getProperty("next1"));

        //Allergy module
        //choosing RecordedBy
        base.ClickUsingWait(base.prop.getProperty("RecordedBy2"));
        //choosing recodrded by doctorname
        base.ClickUsingWait(base.prop.getProperty("doctorname2"));
        //Enter allergyname
        base.ClickUsingSendKeys(base.prop.getProperty("allergyname"), "pollan");
        //clicking on save button
        base.ClickUsingWait(base.prop.getProperty("save2"));
        //clicking the close button
        base.ClickUsingWait(base.prop.getProperty("close2"));
        //clicking the next2 button
        base.ClickUsingWait(base.prop.getProperty("next2"));
        //adding Problem list
        //choosing RecordedBy
        base.ClickUsingWait(base.prop.getProperty("RecordedBy3"));
        //choosing recodrded by doctorname3
        base.ClickUsingWait(base.prop.getProperty("doctorname3"));
        //choosing problemtype
        base.ClickUsingWait(base.prop.getProperty("problemtype"));
        //choosing particular problem type
        base.ClickUsingWait(base.prop.getProperty("Hearingloss"));
        //clicking on save button
        base.ClickUsingWait(base.prop.getProperty("save3"));
        //clicking the close button
        base.ClickUsingWait(base.prop.getProperty("close3"));
        //clicking the next2 button
        base.ClickUsingWait(base.prop.getProperty("next3"));

        //adding drug
        //choosing RecordedBy
        base.ClickUsingWait(base.prop.getProperty("RecordedBy4"));
        //choosing recodrded by doctorname3
        base.ClickUsingWait(base.prop.getProperty("doctorname4"));
        //searching on drugname
        base.ClickUsingSendKeys(base.prop.getProperty("drugname"), "dolo");
        //clicking on drugname
        base.ClickUsingWait(base.prop.getProperty("clickingdrugname"));
        //choosing Route
        base.ClickUsingWait(base.prop.getProperty("Route"));
        //choosing Routeoral
        base.ClickUsingWait(base.prop.getProperty("Routeoral"));
        //Choosing Diagnosis
        base.ClickUsingSendKeys(base.prop.getProperty("Diagnosis"), "fever");
        //choosing feverdiagnosis
        base.ClickUsingWait(base.prop.getProperty("feverdiagnosis"));
        //Entering total qutanity
        base.ClickUsingSendKeys(base.prop.getProperty("qutanity"), "10");
        //entering totaldays
        base.ClickUsingSendKeys(base.prop.getProperty("totaldays"), "10");
        //takingtimes
        base.ClickUsingWait(base.prop.getProperty("takingtimes"));
        //taking medication motning/nighy
        base.ClickUsingWait(base.prop.getProperty("motning/nighy"));
        //taking medication starthold
        base.ClickUsingWait(base.prop.getProperty("starthold"));
        //clicking on save button
        base.ClickUsingWait(base.prop.getProperty("save4"));
        //clicking the close button
        base.ClickUsingWait(base.prop.getProperty("close4"));
        //clicking the next2 button
        base.ClickUsingWait(base.prop.getProperty("next4"));

        //adding socialhistory
        base.ClickUsingWait(base.prop.getProperty("RecordedBy5"));
        //choosing recodrded by doctorname3
        base.ClickUsingWait(base.prop.getProperty("doctorname5"));
        //choosing smokinglevel
        base.ClickUsingWait(base.prop.getProperty("smokinglevel"));
        //choosing smokingleverlstatus
        base.ClickUsingWait(base.prop.getProperty("smokingleverlstatus"));
        //Entering CigarettesPerDay
        base.ClickUsingWait(base.prop.getProperty("CigarettesPerDay"));
        //choosing Drinkinglevel
        base.ClickUsingWait(base.prop.getProperty("Drinkinglevel"));
        // Alcholicstatus
        base.ClickUsingWait(base.prop.getProperty("Alcholicstatus"));
        //AlcholicConsumptionPerDay
        base.ClickUsingWait(base.prop.getProperty("AlcholicConsumptionPerDay"));
        //clicking on save button
        base.ClickUsingWait(base.prop.getProperty("save5"));
        //clicking the close button
        base.ClickUsingWait(base.prop.getProperty("close5"));
        //clicking the next2 button
        base.ClickUsingWait(base.prop.getProperty("next5"));

        //ROS
        base.ClickUsingWait(base.prop.getProperty("RecordedBy6"));
        //choosing recodrded by doctorname3
        base.ClickUsingWait(base.prop.getProperty("doctorname6"));
        //choosing Neck
        base.ClickUsingWait(base.prop.getProperty("Neck"));
        //choosing Respiratory
        base.ClickUsingWait(base.prop.getProperty("Respiratory"));
        //choosing Neurologic
        base.ClickUsingWait(base.prop.getProperty("Neurologic"));
        //choosing Hematologic
        base.ClickUsingWait(base.prop.getProperty("Hematologic"));
        //choosing Psychiatric
        base.ClickUsingWait(base.prop.getProperty("Psychiatric"));
        //clicking on save button
        base.ClickUsingWait(base.prop.getProperty("save6"));
        //clicking the close button
        base.ClickUsingWait(base.prop.getProperty("close6"));
        //clicking the next2 button
        base.ClickUsingWait(base.prop.getProperty("next6"));

        //adding Nutrition
        base.ClickUsingWait(base.prop.getProperty("RecordedBy7"));
        //choosing recodrded by doctorname3
        base.ClickUsingWait(base.prop.getProperty("doctorname7"));
        //clicking on save button
        base.ClickUsingWait(base.prop.getProperty("save7"));
        //clicking the close button
        base.ClickUsingWait(base.prop.getProperty("close7"));
        //clicking the next2 button
        base.ClickUsingWait(base.prop.getProperty("next7"));

        //Adding FunctionalCognitive
        //adding Nutrition
        base.ClickUsingWait(base.prop.getProperty("RecordedBy8"));
        //choosing recodrded by doctorname3
        base.ClickUsingWait(base.prop.getProperty("doctorname8"));
        //clicking on save button
        base.ClickUsingWait(base.prop.getProperty("save8"));
        //clicking the close button
        base.ClickUsingWait(base.prop.getProperty("close8"));
        //clicking the next2 button
        base.ClickUsingWait(base.prop.getProperty("next8"));
        //NursingSignOff
        base.ClickUsingWait(base.prop.getProperty("RecordedBy9"));
        //choosing recodrded by doctorname3
        base.ClickUsingWait(base.prop.getProperty("doctorname9"));
        //clicking on save button
        base.ClickUsingWait(base.prop.getProperty("save9"));
        //clicking the close button
        base.ClickUsingWait(base.prop.getProperty("close9"));
        base.ClickUsingWait(base.prop.getProperty("close9"));
        //Entering username
        base.ClickUsingSendKeys(base.prop.getProperty("username1"), "bluehospital@eblucare.com");
        //Entering password
        base.ClickUsingSendKeys(base.prop.getProperty("password2"), "Welcome@123");
        //clicking on  SignOff
        base.ClickUsingWait(base.prop.getProperty("SignOff"));
        //clcking on yes button
        base.ClickUsingWait(base.prop.getProperty("yes"));
        //clicking on close button
        base.ClickUsingWait(base.prop.getProperty("close10"));


    }
}
