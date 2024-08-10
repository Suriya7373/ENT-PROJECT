package Base;
import Login.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebElement;
public class Baseconstructor {
    public static WebDriver driver;
    public Properties prop;
    //Baseconstructor ClickUsingSendKeys;protected
    public Baseconstructor() {
        System.out.println("base Constructor");
        try {
            File file = new File("C:\\ENT-PROJECT\\ENT-PROJECT\\src\\main\\resources\\Master.properties");

            FileInputStream fileinput = new FileInputStream(file);
            prop = new Properties();
            prop.load(fileinput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void LaunchBrowser() {

        driver = new ChromeDriver();
    }

    @Test
   public void Run() {

        //login page
        driver = new ChromeDriver();

        LoginThroughNewBaseMethod MethodLoginPage = new LoginThroughNewBaseMethod(driver);
        MethodLoginPage.MethodLoginPage();

        //put on existing patient appointment
//           Existingappointment Appointment = new Existingappointment(driver);
//            Appointment.Appointment();
           // calling to Patientvisit
//             PatientvisitModule Patientvisit = new PatientvisitModule(driver);
//              Patientvisit.Patientvisit();
             // calling Triagemodule
//             TriageModule Triage = new TriageModule(driver);
//              Triage.Triage();
              //consulting module
             ConsultingModule Consulting = new ConsultingModule(driver);
             Consulting.Consulting();


    }

    public void Click(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();

    }

    public void Sendkeys() {


    }

    public void ClickUsingWait(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();

    }


    public void ClickUsingSendKeys(String xpath, String s) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).sendKeys(s);


    }


    public void MaxmimizeWindow() {
        driver.manage().window().maximize();
    }

    public void ImplictWait(int ImplicitAmoungt) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ImplicitAmoungt));
    }

    public void SleepMethod(int waitValue) {
        try {
            Thread.sleep(waitValue);
        } catch (Exception e) {

        }
    }
    public void takeScreenshot(String fileName) {
        // Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);

        // Call getScreenshotAs method to create an image file
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

        // Move image file to new destination
        File destFile = new File("D:\\ENT\\ENT-PROJECT\\src\\main\\java\\screnshot.jpg" + fileName);

        // Copy file at destination
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public void url;{
//
//        driver.get("https://entdemo.eblucare.com");
//
//    }

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

