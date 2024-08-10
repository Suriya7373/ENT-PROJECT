package Login;

import Base.Baseconstructor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

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
        base.ClickUsingSendKeys(base.prop.getProperty("Patientname1"), "Rabin");

        //clivking on Rabinpatient
        base.ClickUsingWait(base.prop.getProperty("Rabinpatient1"));

        //searchpatient
        base.ClickUsingWait(base.prop.getProperty("searchpatient1"));
////Editeconsulting
        base.SleepMethod(5000);
        int attempts = 0;
        while(attempts < 3) {
            try {
                base.ClickUsingWait(base.prop.getProperty("Editeconsulting"));
                break;
            } catch(StaleElementReferenceException e) {

                attempts++;
            }
        }
        //choosing RecordedBy
        base.ClickUsingWait(base.prop.getProperty("RecordedBy1"));

        //choosing doctor NareshSharma
        base.ClickUsingWait(base.prop.getProperty("NareshSharma"));
        //probelmlocation
        base.ClickUsingWait(base.prop.getProperty("probelmlocation"));
        //choosingchoosingprobelmlocation
        base.ClickUsingWait(base.prop.getProperty("choosingchoosingprobelmlocation"));

        //clicking outside to updatethe previous value
        base.SleepMethod(3000);
        base.ClickUsingWait(base.prop.getProperty("updatethepreviousvalue"));
        //Entering problemduration
        base.ClickUsingSendKeys(base.prop.getProperty("problemduration"), "1");
        //choosing problem symptomsdropdown
        base.ClickUsingWait(base.prop.getProperty("symptomsdropdown"));
        //choosingsymptoms
        base.ClickUsingWait(base.prop.getProperty("choosingsymptoms"));

        //clicking outside to updatethepreviousvalue
        //       try {
 //         WebElement outside1=driver.findElement(xpath("//*[@class=\"cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing\"]"));
//           JavascriptExecutor js = (JavascriptExecutor) driver;
//           js.executeScript("arguments[0].click();", outside1);
 //          outside1.click();
//       }
//       catch (StaleElementReferenceException E){
//           System.out.println("error message"+E.getMessage());
//       }


        //clicking on outside
        base.ClickUsingWait(base.prop.getProperty("outside"));
        //choosing problemtype
        base.ClickUsingWait(base.prop.getProperty("problemtype1"));
        //choosing problem type hearingloss
        base.ClickUsingWait(base.prop.getProperty("hearingloss"));

        //clicking outside to updatethepreviousvalue
//        Thread.sleep(3000);
//        try {
//            WebElement outside2=driver.findElement(xpath("//*[@class=\"cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing\"]"));
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].click();", outside2);
//            outside2.click();
//        }
//        catch (StaleElementReferenceException A){
//            System.out.println("error message"+A.getMessage());
//        }

        //clickoing on outside2
        base.ClickUsingWait(base.prop.getProperty("outside2"));
        //scrolldown
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
        //choosing problemstatusdropdown
        base.ClickUsingWait(base.prop.getProperty("problemstatusdropdown"));
        //choosingproblemstatus
        base.ClickUsingWait(base.prop.getProperty("choosingproblemstatus"));

        //choosing save button
        base.ClickUsingWait(base.prop.getProperty("save10"));
        //choosing close button
        base.ClickUsingWait(base.prop.getProperty("close11"));


        //moving to careplanepage
        //choosing RecordedBy
        base.ClickUsingWait(base.prop.getProperty("RecordedBy10"));

        //choosing doctor NareshSharma
        base.ClickUsingWait(base.prop.getProperty("NareshSharma1"));

        //choosing on treatmenttypedropdown
        base.ClickUsingWait(base.prop.getProperty("treatmenttypedropdown"));
        //choosing doctor treatmenttype
        base.ClickUsingWait(base.prop.getProperty("treatmenttype"));
        //Entetring procedurenotes
        base.ClickUsingSendKeys(base.prop.getProperty("procedurenotes"), "Laryngoscopy");
        //clicking on procedurestatusdropdown
        base.ClickUsingWait(base.prop.getProperty("procedurestatusdropdown"));
        //choosidngprocedurestatus
        base.ClickUsingWait(base.prop.getProperty("choosidngprocedurestatus"));
        //scrolldown
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)");
        //clicking on save button
        base.ClickUsingWait(base.prop.getProperty("save11"));
        //clicking on close button
        base.ClickUsingWait(base.prop.getProperty("close12"));


        //moving to careplanepage
        //choosing RecordedBy
        base.ClickUsingWait(base.prop.getProperty("RecordedBy11"));
        //choosing doctor NareshSharma
        base.ClickUsingWait(base.prop.getProperty("NareshSharma11"));
        //choosing save button
        base.ClickUsingWait(base.prop.getProperty("save12"));
        //choosing close button
        base.ClickUsingWait(base.prop.getProperty("close13"));




    }
}
