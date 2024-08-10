package Login;
import org.openqa.selenium.StaleElementReferenceException;
import Base.Baseconstructor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.CompletionException;

public  class Existingappointment extends Baseconstructor {
    public Existingappointment() {
        System.out.println("Existingappointment");

    }

    public Existingappointment(WebDriver driver) {
        System.out.println("appointment");

        this.driver = driver;
    }

    public void Appointment() {
        Baseconstructor base = new Baseconstructor();
//        Clicking on appointment button
        base.SleepMethod(10000);
        base.ClickUsingWait(base.prop.getProperty("Appointment"));
        //clicking on calendar
        base.SleepMethod(20000);

        int attempts = 0;
        while(attempts < 3) {
            try {
                base.ClickUsingWait(base.prop.getProperty("calendar"));
                break;
            } catch(StaleElementReferenceException e) {

                attempts++;
            }
        }
            base.ClickUsingWait(base.prop.getProperty("calendar"));
            base.ClickUsingWait(base.prop.getProperty("appointmentlist"));
            //Clicking on Add appointment
            base.ClickUsingWait(base.prop.getProperty("Addappointmentlist"));
            //clicking on existing patient
            base.ClickUsingWait(base.prop.getProperty("Existingpatient"));
            //searching existing patient
            base.ClickUsingSendKeys(base.prop.getProperty("searchingexistingpatient"), "Rabin");
            //clcking on searching patient
            base.ClickUsingWait(base.prop.getProperty("clckingpatient"));
            //Searchphysician
            base.SleepMethod(3000);
            base.ClickUsingWait(base.prop.getProperty("Searchphysician"));
            //Searchphysicianphysicianname
            base.ClickUsingWait(base.prop.getProperty("physicianname"));
           //appointmentcalender
            base.ClickUsingWait(base.prop.getProperty("appointmentcalender"));
            //todayappointement
            base.ClickUsingWait(base.prop.getProperty("todayappointement"));
          //choosing appointementtime
            base.ClickUsingWait(base.prop.getProperty("choosingappointementtime"));
            //choosingappointementtimetoday
           base.ClickUsingWait(base.prop.getProperty("choosingappointementtimetoday"));
            //AppointmentType
           base.ClickUsingWait(base.prop.getProperty("AppointmentType"));
           //choosingappointmenttype
           base.ClickUsingWait(base.prop.getProperty("choosingappointmenttype"));
           //save the appointment
           base.ClickUsingWait(base.prop.getProperty("save"));
           ////clicking on close button
           base.ClickUsingWait(base.prop.getProperty("close"));

        }
    }

