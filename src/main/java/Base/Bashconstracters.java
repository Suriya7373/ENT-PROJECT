package Base;
import org.testng.annotations.Test;
import Login.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static Base.Baseconstructor.driver;

public class Bashconstracters extends Baseconstructor{
    @Test(enabled = true)
    public void Login() {

        //login page
        driver = new ChromeDriver();

        LoginThroughNewBaseMethod MethodLoginPage = new LoginThroughNewBaseMethod(driver);
        MethodLoginPage.MethodLoginPage();  // Login action
    }

    @Test(enabled = true, dependsOnMethods = {"Login"})
    public void Existingappointment() {
        Existingappointment Appointment = new Existingappointment(driver);
        Appointment.Appointment();  // Perform appointment actions
    }
    //calling to Patientvisit
    @Test(enabled = false, dependsOnMethods = {"Existingappointment"})

    public void Patientvisit(){
        PatientvisitModule Patientvisit = new PatientvisitModule(driver);
        Patientvisit.Patientvisit();
    }

    // calling Triagemodule
    @Test(enabled = false, dependsOnMethods = {"Patientvisit"})
    public void Triagemodule() {
        TriageModule Triage = new TriageModule(driver);
        Triage.Triage();
    }
    // consultingmodule
    @Test(enabled = false, dependsOnMethods = {"Triagemodule"})
    public void consultingmodule() {
        ConsultingModule Consulting = new ConsultingModule(driver);
        Consulting.Consulting();
    }
    //moving to Audiology
    @Test(enabled = false, dependsOnMethods = {"consultingmodule"})
    public void Audiology() {
        AudiologyModule Audiology = new AudiologyModule(driver);
        Audiology.Audiology();
    }

}
