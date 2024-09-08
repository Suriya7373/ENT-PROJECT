package Login;
import org.openqa.selenium.WebElement;
import Base.Baseconstructor;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import java.util.NoSuchElementException;

public class ConsultingModule extends Baseconstructor {
    public ConsultingModule() {
        System.out.println("TriageModule");

    }

    public ConsultingModule(WebDriver driver) {
        this.driver = driver;
    }

    public void Consulting() {
        Baseconstructor base = new Baseconstructor();

        base.SleepMethod(10000);
        base.ClickUsingWait(base.prop.getProperty("Consulting"));
        base.SleepMethod(10000);
        base.ClickUsingSendKeys(base.prop.getProperty("Patientname1"), "Eve");

        //clivking on Rabinpatient
        base.ClickUsingWait(base.prop.getProperty("Eve"));

        //searchpatient
        base.ClickUsingWait(base.prop.getProperty("searchpatient1"));
////Editeconsulting
        base.SleepMethod(5000);
        int attempts = 0;
        while (attempts < 3) {
            try {

                base.ClickUsingWait(base.prop.getProperty("Editeconsulting"));
                break;
            } catch (StaleElementReferenceException e) {

                attempts++;
            }
        }
        //choosing RecordedBy
//        base.SleepMethod(5000);
//        base.ClickUsingWait(base.prop.getProperty("RecordedBy1"));
//
//        //choosing doctor NareshSharma
//        base.ClickUsingWait(base.prop.getProperty("NareshSharma"));
//        //probelmlocation
//        base.ClickUsingWait(base.prop.getProperty("probelmlocation"));
//        //choosingchoosingprobelmlocation
//        base.ClickUsingWait(base.prop.getProperty("choosingchoosingprobelmlocation"));
//
//        //clicking outside to updatethe previous value
//
//        base.SleepMethod(10000);
//        base.Click(base.prop.getProperty("updatethepreviousvalue"));
//
//        //Entering problemduration
//        base.ClickUsingSendKeys(base.prop.getProperty("problemduration"), "1");
//        //choosing problem symptomsdropdown
//        base.ClickUsingWait(base.prop.getProperty("symptomsdropdown"));
//        //choosingsymptoms
//        base.ClickUsingWait(base.prop.getProperty("choosingsymptoms"));
//
//        //clicking outside to updatethepreviousvalue
////
//        //base.Click(base.prop.getProperty("outside"));
//        base.SleepMethod(3000);
//        try {
//            // Locate the element using XPath
//            WebElement outside2 = driver.findElement(By.xpath("//*[@class=\"cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing\"]"));
//
//            // Use JavaScript Executor to click the element
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].click();", outside2);
//
//            // Attempt to click the element again (if necessary)
//            outside2.click();
//        } catch (StaleElementReferenceException A) {
//            System.out.println("Error message: " + A.getMessage());
//        }
////////
//////
////          //choosing problemtype
//            base.SleepMethod(3000);
//            base.ClickUsingWait(base.prop.getProperty("problemtype1"));
//            //choosing problem type hearingloss
//            base.SleepMethod(3000);
//            base.ClickUsingWait(base.prop.getProperty("None"));
//
//           // clicking outside to updatethepreviousvalue
//
//        base.SleepMethod(3000);
//        try {
//            WebElement outside2 = driver.findElement(By.xpath("//*[@class=\"cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing\"]"));
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].click();", outside2);
//            outside2.click();
//        }
//        catch (StaleElementReferenceException A){
//            System.out.println("error message"+A.getMessage());
//        }
//
//           //scrolldown
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollBy(0,100)");
//            //choosing problemstatusdropdown
//            base.ClickUsingWait(base.prop.getProperty("problemstatusdropdown"));
//            //choosingproblemstatus
//            base.ClickUsingWait(base.prop.getProperty("choosingproblemstatus"));
//
//            //choosing save button
//            base.ClickUsingWait(base.prop.getProperty("save10"));
//            //choosing close button
//            base.ClickUsingWait(base.prop.getProperty("close11"));
//
//
//            //moving to careplanepage
//            //choosing RecordedBy
//            base.ClickUsingWait(base.prop.getProperty("RecordedBy10"));
//
//            //choosing doctor NareshSharma
//            base.ClickUsingWait(base.prop.getProperty("NareshSharma1"));
//
//            //choosing on treatmenttypedropdown
//            base.ClickUsingWait(base.prop.getProperty("treatmenttypedropdown"));
//            //choosing doctor treatmenttype
//            base.ClickUsingWait(base.prop.getProperty("treatmenttype"));
//            //Entetring procedurenotes
//            base.ClickUsingSendKeys(base.prop.getProperty("procedurenotes"), "Laryngoscopy");
//            //clicking on procedurestatusdropdown
//            base.ClickUsingWait(base.prop.getProperty("procedurestatusdropdown"));
//            //choosidngprocedurestatus
//            base.ClickUsingWait(base.prop.getProperty("choosidngprocedurestatus"));
//            //scrolldown
//            JavascriptExecutor js1 = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollBy(0,150)");
//            //clicking on save button
//            base.ClickUsingWait(base.prop.getProperty("save11"));
//            //clicking on close button
//            base.ClickUsingWait(base.prop.getProperty("close12"));
//////
//////
//            //moving to careplanepage
//            //choosing RecordedBy
//            base.ClickUsingWait(base.prop.getProperty("RecordedBy11"));
//            //choosing doctor NareshSharma
//            base.ClickUsingWait(base.prop.getProperty("NareshSharma11"));
//            //choosing save button
//            base.ClickUsingWait(base.prop.getProperty("save12"));
//            //choosing close button
//            base.ClickUsingWait(base.prop.getProperty("close13"));
//            base.SleepMethod(10000);
//            //moving to visitintake page
//           base.ClickUsingWait(base.prop.getProperty("visitintake"));
//            //moving to allergytab
//           base.SleepMethod(3000);
//           base.Click(base.prop.getProperty("allergytab"));
//           //moving to problemlist
//           base.Click(base.prop.getProperty("problemlist"));
//           //moving to medication
//           base.Click(base.prop.getProperty("medication"));
//           // //moving to socialhistory
//           base.Click(base.prop.getProperty("socialhistory"));
//           // //moving to socialhistory
//            base.Click(base.prop.getProperty("ROS"));
////            //Nutrition
//           base.Click(base.prop.getProperty("Nutrition"));
//           //Fuctioncongnative
//          base.Click(base.prop.getProperty("Fuctioncongnative"));
//          //nursingsignup
//        base.Click(base.prop.getProperty("nursingsignup"));
//
//        base.SleepMethod(3000);
//        try {
//            WebElement outside2 = driver.findElement(By.xpath("//*[@class='cdk-overlay-backdrop cdk-overlay-dark-backdrop cdk-overlay-backdrop-showing']"));
//            JavascriptExecutor jss = (JavascriptExecutor) driver;
//            jss.executeScript("arguments[0].click();", outside2);
//            outside2.click();
//        }
//        catch (StaleElementReferenceException A){
//            System.out.println("error message"+A.getMessage());
//        }
//
//       // e-prescrption
//        base.SleepMethod(5000);
//        base.Click(base.prop.getProperty("prescrption"));
//
//        base.SleepMethod(2000);
//        base.ClickUsingSendKeys(base.prop.getProperty("drugname1"), "dolo");
//        //clicking on drugname
//        base.SleepMethod(5000);
//        base.ClickUsingWait(base.prop.getProperty("clickingdrugname1"));
//        //choosing Route
//        base.SleepMethod(2000);
//        base.ClickUsingWait(base.prop.getProperty("Route1"));
//        //choosing Routeoral
//        base.ClickUsingWait(base.prop.getProperty("Routeoral1"));
//        //Choosing Diagnosis
//        base.SleepMethod(5000);
//        base.ClickUsingSendKeys(base.prop.getProperty("Diagnosis1"), "Fever");
//        //choosing feverdiagnosis
//        base.SleepMethod(5000);
//        base.ClickUsingWait(base.prop.getProperty("A1"));
//        //Entering total qutanity
//        base.ClickUsingSendKeys(base.prop.getProperty("qutanity1"), "10");
//        //entering totaldays
//        base.ClickUsingSendKeys(base.prop.getProperty("totaldays1"), "10");
//        //takingtimes
//        base.ClickUsingWait(base.prop.getProperty("takingtimes1"));
//        //taking medication motning/nighy
//        base.ClickUsingWait(base.prop.getProperty("motning/nighy1"));
//        //taking medication starthold
//        base.ClickUsingWait(base.prop.getProperty("starthold1"));
//        //clicking on save button
//        base.ClickUsingWait(base.prop.getProperty("save15"));
//        //clicking on close button
//        base.ClickUsingWait(base.prop.getProperty("Close"));

//        //moving to elab
//        base.SleepMethod(5000);
//        //base.ClickUsingWait(base.prop.getProperty("elab"));
//        try {
//            WebElement element = driver.findElement(By.xpath("//*[text()='e-Lab']"));
//            element.click();
//        } catch (StaleElementReferenceException e) {
//            WebElement element = driver.findElement(By.id("your-element-id"));
//            element.click();
//        }
//        //choosingopen
//        base.SleepMethod(5000);
//        base.ClickUsingWait(base.prop.getProperty("choosingopen"));
//        //choosing todaydate
//        base.ClickUsingWait(base.prop.getProperty("todaydate"));
//        //choosing lab requesttime
//        base.ClickUsingWait(base.prop.getProperty("requesttime"));
//
//        //clicking on okbutton
//        base.SleepMethod(3000);
//        base.ClickUsingWait(base.prop.getProperty("okbutton"));
//
//        //clicking on testname
//        base.SleepMethod(3000);
//        base.ClickUsingSendKeys(base.prop.getProperty("testname"), "blood");
//
//        //clicking on labtest
//        base.ClickUsingWait(base.prop.getProperty("labtest"));
//
//        //clcickin urgency
//        base.ClickUsingWait(base.prop.getProperty("urgency"));
////
////        //choosingurgency
//        base.ClickUsingWait(base.prop.getProperty("choosingurgency1"));
//
//        //choosing lab opencalender
//        base.ClickUsingWait(base.prop.getProperty("opencalender"));
//
//        //chooseing todaysdate
//        base.ClickUsingWait(base.prop.getProperty("todaysdate"));
//
//        //entering notes
//        base.ClickUsingSendKeys(base.prop.getProperty("notes"), "blood");
//
//        //clicking on save button
//        base.ClickUsingWait(base.prop.getProperty("save13"));
//
//        //clicking on close button
//        base.ClickUsingWait(base.prop.getProperty("close15"));

//
//        //moving to AudiologyRequest
//        SleepMethod(3000);
//        base.Click(base.prop.getProperty("AudiologyRequest"));
//        //searchingphysician name
//        base.ClickUsingSendKeys(base.prop.getProperty("searchingphysician"), "nar");
//        //choosingdoctor
//        SleepMethod(3000);
//        base.Click(base.prop.getProperty("choosingdoctor"));
//        //Speech TherapySpecialTest
//        base.Click(base.prop.getProperty("TherapySpecialTest"));
//        //HearingAid
//        base.Click(base.prop.getProperty("HearingAid"));
//        //
//
//        //clicking on save button
//        base.ClickUsingWait(base.prop.getProperty("save14"));
//
//        //clicking on close button
//        base.ClickUsingWait(base.prop.getProperty("close14"));









        //moving to Procedureequest
        SleepMethod(3000);
        base.Click(base.prop.getProperty("Procedureequest"));
        //clicking on proceduretype
        SleepMethod(3000);
        base.ClickUsingWait(base.prop.getProperty("proceduretype"));
        //clicking on Tonsillectomy
        base.ClickUsingWait(base.prop.getProperty("Tonsillectomy"));
        //choosing physician
        SleepMethod(3000);
        base.ClickUsingSendKeys(base.prop.getProperty("physician"), "nar");

        //choosingphysician
        base.ClickUsingWait(base.prop.getProperty("choosingphysician"));
        //choosing urgency
        base.ClickUsingWait(base.prop.getProperty("urgency1"));

        //urgencychoosing
        base.ClickUsingWait(base.prop.getProperty("urgencychoosing"));

        //Entering provisonaldiagnosis
        base.ClickUsingSendKeys(base.prop.getProperty("provisonaldiagnosis"), "Fever");
        //Entering PlannedProcedure1
        base.ClickUsingSendKeys(base.prop.getProperty("PlannedProcedure1"), "Fever");

        //procedurename
        base.ClickUsingSendKeys(base.prop.getProperty("procedurenameEntering"), "fess");
        ////procedurenameclicking
        base.ClickUsingWait(base.prop.getProperty("procedurenameclicking"));

        //scrolldown
        base.SleepMethod(3000);
        WebElement element = driver.findElement(By.xpath("//*[@id='mat-dialog-0']"));

        // Create a JavascriptExecutor instance
        JavascriptExecutor js2 = (JavascriptExecutor) driver;

        // Scroll down within the element by 1000 pixels
        js2.executeScript("arguments[0].scrollTop += 1000;", element);



        //choosing AnesthesiaFitnessRequiredCheck
        SleepMethod(5000);
        base.ClickUsingWait(base.prop.getProperty("AnesthesiaFitnessRequiredCheck"));

        ////*[@formcontrolname='BloodRequiredCheck']
        //choosing BloodRequiredCheck
        base.ClickUsingWait(base.prop.getProperty("BloodRequiredCheck"));

        //Entering AnesthesiaFitnessRequiredDesc
        base.ClickUsingSendKeys(base.prop.getProperty("AnesthesiaFitnessRequiredDesc"), "yes");

        //Entering bloodreqired
        base.ClickUsingSendKeys(base.prop.getProperty("bloodreqired"), "yes");
        //clicking on continueboxes
        base.ClickUsingWait(base.prop.getProperty("continueboxes"));
        //choosing AdmissionType
        base.ClickUsingWait(base.prop.getProperty("AdmissionType"));
        //choosing admissiontypeGeneral
        base.ClickUsingWait(base.prop.getProperty("admissiontypeGeneral"));

        //savebutotn
        base.ClickUsingWait(base.prop.getProperty("savebutotn"));
        //clicking on close button
        base.ClickUsingWait(base.prop.getProperty("close16"));
















        }
    }


