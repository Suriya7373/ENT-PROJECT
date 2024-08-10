package Base;

import Login.Loginpage;
import Menu.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Baseconstructor {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //Login page
        Loginpage Setup=new Loginpage(driver);
        Setup.Setup();


        //calling to Appointment page
      // AppointmentModule Appointment = new AppointmentModule(driver);
       // Appointment.Appointment();
//
//        // calling to PatientModule
       //PatientsModule Patients = new PatientsModule(driver);
       // Patients.Patients();
//
//        //put on existing patient appointment
//        existingpatientappointment ExistingAppointment = new existingpatientappointment(driver);
//        ExistingAppointment.ExistingAppointment();
//
//        //calling to Patientvisit
//        PatientvisitModule Patientvisit = new PatientvisitModule(driver);
//        Patientvisit.Patientvisit();
//
//        // visit page appointment page
//        payment paymentvisit = new payment(driver);
//        paymentvisit.paymentvisit();
//
//        //New patient appointment
//        existingpatientappointment NewAppointment = new existingpatientappointment(driver);
//        NewAppointment.ExistingAppointment();
//
//
//        //calling Triagemodule
//        Triage TriageModule = new Triage(driver);
//        TriageModule.TriageModule();

        //consulting module
        consultingmodule consulting=new consultingmodule(driver);
        consulting.consulting();
    }
}
