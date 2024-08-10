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
        base.SleepMethod(5000);
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
//
////   base.Click(base.prop.getProperty("outside"));
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
////
//
//
//            //choosing problemtype
//            base.SleepMethod(3000);
//            base.ClickUsingWait(base.prop.getProperty("problemtype1"));
//            //choosing problem type hearingloss
//            base.SleepMethod(3000);
//            base.ClickUsingWait(base.prop.getProperty("None"));
//
//            //clicking outside to updatethepreviousvalue
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
//
//
//            //moving to careplanepage
//            //choosing RecordedBy
//            base.ClickUsingWait(base.prop.getProperty("RecordedBy11"));
//            //choosing doctor NareshSharma
//            base.ClickUsingWait(base.prop.getProperty("NareshSharma11"));
//            //choosing save button
//            base.ClickUsingWait(base.prop.getProperty("save12"));
//            //choosing close button
//            base.ClickUsingWait(base.prop.getProperty("close13"));
            base.SleepMethod(10000);
            //moving to visitintake page
           base.ClickUsingWait(base.prop.getProperty("visitintake"));
            //moving to allergytab
           base.SleepMethod(3000);
           base.Click(base.prop.getProperty("allergytab"));
           //moving to problemlist
           base.Click(base.prop.getProperty("problemlist"));
           //moving to medication
           base.Click(base.prop.getProperty("medication"));
           // //moving to socialhistory
           base.Click(base.prop.getProperty("socialhistory"));
           // //moving to socialhistory
            base.Click(base.prop.getProperty("ROS"));
            //Nutrition
           base.Click(base.prop.getProperty("Nutrition"));
           //Fuctioncongnative
          base.Click(base.prop.getProperty("Fuctioncongnative"));
          //nursingsignup
        base.Click(base.prop.getProperty("nursingsignup"));

        base.SleepMethod(3000);
        try {
            WebElement outside2 = driver.findElement(By.xpath("//*[@class='cdk-overlay-backdrop cdk-overlay-dark-backdrop cdk-overlay-backdrop-showing']"));
            JavascriptExecutor jss = (JavascriptExecutor) driver;
            jss.executeScript("arguments[0].click();", outside2);
            outside2.click();
        }
        catch (StaleElementReferenceException A){
            System.out.println("error message"+A.getMessage());
        }

        //e-prescrption
        base.SleepMethod(5000);
        base.Click(base.prop.getProperty("prescrption"));

        base.SleepMethod(2000);
        base.ClickUsingSendKeys(base.prop.getProperty("drugname1"), "dolo");
        //clicking on drugname
        base.SleepMethod(5000);
        base.ClickUsingWait(base.prop.getProperty("clickingdrugname1"));
        //choosing Route
        base.SleepMethod(2000);
        base.ClickUsingWait(base.prop.getProperty("Route1"));
        //choosing Routeoral
        base.ClickUsingWait(base.prop.getProperty("Routeoral1"));
        //Choosing Diagnosis
        base.SleepMethod(5000);
        base.ClickUsingSendKeys(base.prop.getProperty("Diagnosis1"), "Fever");
        //choosing feverdiagnosis
        base.SleepMethod(5000);
        base.ClickUsingWait(base.prop.getProperty("A1"));
        //Entering total qutanity
        base.ClickUsingSendKeys(base.prop.getProperty("qutanity1"), "10");
        //entering totaldays
        base.ClickUsingSendKeys(base.prop.getProperty("totaldays1"), "10");
        //takingtimes
        base.ClickUsingWait(base.prop.getProperty("takingtimes1"));
        //taking medication motning/nighy
        base.ClickUsingWait(base.prop.getProperty("motning/nighy1"));
        //taking medication starthold
        base.ClickUsingWait(base.prop.getProperty("starthold1"));
        //clicking on save button
        base.ClickUsingWait(base.prop.getProperty("save15"));














        }
    }


