package Base;
import Login.Loginpage;
import Menu.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
public class Baseconstructor {
    public static WebDriver driver;
    public Properties prop;
    public Baseconstructor()
    {
        System.out.println("base Constructor");
        try {
        File file=new File("C:\\ENT-PROJECT\\ENT-PROJECT\\src\\main\\resources\\Master.properties");
        FileInputStream fileinput=new FileInputStream(file);
        prop = new Properties();
        prop.load(fileinput);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void LaunchBrowser()
    {

        driver = new ChromeDriver();
    }

    @Test(enabled = false)
    public void Run() {

        //login page
        try {
            driver = new ChromeDriver();
            Loginpage Setup = new Loginpage(driver);
            // WebDriverWait wait=new WebDriverWait(driver,15);
            Setup.Setup();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //existing appoinmeent

//        try {
//            AppointmentModule Appointment = new AppointmentModule(driver);
//
//            Appointment.Appointment();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //put on existing patient appointment
        try {
            existingpatientappointment ExistingAppointment = new existingpatientappointment(driver);

            ExistingAppointment.ExistingAppointment();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //calling to Patientvisit

        try {
            PatientvisitModule Patientvisit = new PatientvisitModule(driver);

            Patientvisit.Patientvisit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //calling Triagemodule
        try {
            Triage TriageModule = new Triage(driver);

            TriageModule.TriageModule();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //consulting module
        try {
            consultingmodule consulting=new consultingmodule(driver);

            consulting.consulting();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
    public  void Click()
    {

    }

    public void Sendkeys()
    {

    }
    public void ClickUsingWait(String xpath)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions .visibilityOfElementLocated(By.xpath(xpath))).click();

    }


    public void ClickUsingSendKeys(String xpath,String Value)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions .visibilityOfElementLocated(By.xpath(xpath))).sendKeys(Value);
    }


    public void MaxmimizeWindow()
    {
        driver.manage().window().maximize();
    }

    public void ImplictWait(int ImplicitAmoungt)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ImplicitAmoungt));
    }
    public void SleepMethod(int waitValue)
    {
        try {
            Thread.sleep(waitValue);
        }
        catch (Exception e)
        {

        }
    }
}









//    public static void main(String[] args) throws InterruptedException {
//
//         driver = new ChromeDriver();
//
//        //Login page
//        Loginpage Setup=new Loginpage(driver);
//        Setup.Setup();


        //calling to Appointment page
     /* AppointmentModule Appointment = new AppointmentModule(driver);
       Appointment.Appointment();*/

//        // calling to PatientModule
       //PatientsModule Patients = new PatientsModule(driver);
       // Patients.Patients();

//        put on existing patient appointment
        //existingpatientappointment ExistingAppointment = new existingpatientappointment(driver);
        //ExistingAppointment.ExistingAppointment();
//
//        //calling to Patientvisit
        //PatientvisitModule Patientvisit = new PatientvisitModule(driver);
        //Patientvisit.Patientvisit();

//        visit page appointment page
//        payment paymentvisit = new payment(driver);
//        paymentvisit.paymentvisit();

//        //New patient appointment
//        existingpatientappointment NewAppointment = new existingpatientappointment(driver);
//        NewAppointment.ExistingAppointment();

//        //calling Triagemodule
        //Triage TriageModule = new Triage(driver);
        //TriageModule.TriageModule();

        //consulting module
//        consultingmodule consulting=new consultingmodule(driver);
//        consulting.consulting();
 ////   }

