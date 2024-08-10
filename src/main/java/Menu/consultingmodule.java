//package Menu;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.devtools.CdpVersionFinder;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.StaleElementReferenceException;
//import java.util.List;
//import java.util.NoSuchElementException;
//import java.util.Optional;
//import java.time.Duration;
//
//import static org.openqa.selenium.By.xpath;
//
//public class consultingmodule {
//    WebDriver driver;
//
//    public consultingmodule(WebDriver driver) {
//
//        this.driver = driver;
//    }
//
//    public void consulting() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
//         Thread.sleep(5000);
//        //clicking on consulting
//        WebElement consulting = driver.findElement(xpath("//div[normalize-space()='Consulting']"));
//        consulting.click();
//        //searchpatient
//        Thread.sleep(3000);
//        WebElement searchpatient = driver.findElement(xpath("//*[@formcontrolname=\"Patient\"]"));
//        searchpatient.sendKeys("Rabin");
//
//        //clivking on kevinpatient
//        Thread.sleep(3000);
//        WebElement Rabinpatient=driver.findElement(xpath("//*[text()=\" Rabin      john - MR0000118 \"]"));
//        Rabinpatient.click();
//
//        //searchpatient
//        Thread.sleep(3000);
//        WebElement searchpatient1=driver.findElement(xpath("//*[text()=\"Search\"]"));
//        searchpatient1.click();
//
//        //Editeconsulting
//        Thread.sleep(3000);
//        WebElement Editeconsulting=driver.findElement(xpath("//*[@class=\"footerIcons\"]"));
//        Editeconsulting.click();
//
//        //choosing RecordedBy
//        Thread.sleep(3000);
//        WebElement RecordedBy=driver.findElement(xpath("//*[@formcontrolname=\"RecordedBy1\"]"));
//        RecordedBy.click();
//
//        //choosing doctor NareshSharma
//        Thread.sleep(5000);
//        WebElement NareshSharma=driver.findElement(xpath("//*[text()=\"Naresh  Sharma\"]"));
//        NareshSharma.click();
//
//        //choosingprobelmlocation
//        Thread.sleep(3000);
//        WebElement probelmlocation=driver.findElement(xpath("//*[@formcontrolname=\"ProblemAreaID\"]"));
//        probelmlocation.click();
//
//        //choosingchoosingprobelmlocation
//        Thread.sleep(3000);
//        WebElement choosingchoosingprobelmlocation=driver.findElement(xpath("(//*[text()=\"Otosclerosis\"])[1]"));
//        choosingchoosingprobelmlocation.click();
//
//        //clicking outside to updatethe previous value
//        Thread.sleep(2000);
//        WebElement outside=driver.findElement(xpath("//*[@class=\"cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing\"]"));
//        outside.click();
//
//       //Entering problemduration
//        Thread.sleep(3000);
//        WebElement problemduration=driver.findElement(xpath("//*[@formcontrolname=\"ProblemDuration\"]"));
//        problemduration.sendKeys("1");
//
//        //choosing problem symptomsdropdown
//        Thread.sleep(3000);
//        WebElement symbtomsdropdown=driver.findElement(xpath("//*[@formcontrolname=\"SymptomsID\"]"));
//        symbtomsdropdown.click();
//
//        //choosing symptoms
//        Thread.sleep(2000);
//        WebElement symptoms=driver.findElement(xpath("//*[text()=\"Fussiness \"]"));
//        symptoms.click();
//
//        //clicking outside to updatethe previous value
//       Thread.sleep(5000);
//       try {
//           WebElement outside1=driver.findElement(xpath("//*[@class=\"cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing\"]"));
//           JavascriptExecutor js = (JavascriptExecutor) driver;
//           js.executeScript("arguments[0].click();", outside1);
//           outside1.click();
//       }
//       catch (StaleElementReferenceException E){
//           System.out.println("error message"+E.getMessage());
//       }
//
//
//
//        //choosing problemtype
//        Thread.sleep(5000);
//        WebElement choosingproblemtype=driver.findElement(xpath("(//*[@class=\"mat-select-value\"])[5]"));
//        choosingproblemtype.click();
//
//        //choosing problem type hearingloss
//        Thread.sleep(3000);
//        WebElement hearingloss=driver.findElement(xpath("//*[text()=\"Hearing loss\"]"));
//        hearingloss.click();
//
//        //clicking outside to updatethe previous value
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
//
//        //scrolldown
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,100)");
//
//        //choosing problemstatusdropdown
//        Thread.sleep(5000);
//        WebElement problemstatusdropdown=driver.findElement(xpath("//*[@formcontrolname=\"ProblemStatus\"]"));
//        problemstatusdropdown.click();
//
//        //choosing problemstatus
//        Thread.sleep(3000);
//        WebElement problemstatus=driver.findElement(xpath("//*[text()=\"Func., health\"]"));
//        problemstatus.click();
//
//        //choosing save button
//        Thread.sleep(3000);
//        WebElement save=driver.findElement(xpath("//*[@class=\"custome-button mat-primary schedbtn mat-flat-button mat-button-base\"]"));
//        save.click();
//
//        Thread.sleep(3000);
//        WebElement close=driver.findElement(xpath("//*[text()=\"Close\"]"));
//        close.click();
//
//
//
//        /// //next moving to procedure
////        Thread.sleep(5000);
////        WebElement procedure=driver.findElement(xpath("//*[@id=\"mat-tab-label-0-1\"]"));
////        procedure.click();
//
//
//
//
//        //choosing RecordedBy
//        Thread.sleep(3000);
//        WebElement RecordedBy1=driver.findElement(xpath("//*[@formcontrolname=\"RecordedBy2\"]"));
//        RecordedBy1.click();
//
//        //choosing doctor NareshSharma
//        Thread.sleep(5000);
//        WebElement NareshSharma1=driver.findElement(xpath("//*[text()=\"Naresh  Sharma\"]"));
//        NareshSharma1.click();
//
//        //choosing on treatmenttypedropdown
//        Thread.sleep(3000);
//        WebElement treatmenttypedropdown=driver.findElement(xpath("//*[@formcontrolname=\"TreatmentType\"]"));
//        treatmenttypedropdown.click();
//
//        //choosing doctor treatmenttype
//        Thread.sleep(5000);
//        WebElement treatmenttype=driver.findElement(xpath("//*[text()=\"Tonsillitis\"]"));
//        treatmenttype.click();
//
//        //Entetring procedurenotes
//        Thread.sleep(3000);
//        WebElement procedurenotes=driver.findElement(xpath("//*[@formcontrolname=\"ProcedureNotes\"]"));
//        procedurenotes.sendKeys("sgsuriya");
//
//
//        //clicking on procedurestatusdropdown
//        Thread.sleep(3000);
//        WebElement procedurestatusdropdown=driver.findElement(xpath("//*[@formcontrolname=\"ProcedureStatus\"]"));
//        procedurestatusdropdown.click();
//
//        //choosidng procedurestatus
//        Thread.sleep(5000);
//        WebElement procedurestatus=driver.findElement(xpath("//*[text()=\"Adenoidectomy \"]"));
//        procedurestatus.click();
//        //scrolldown
//        JavascriptExecutor js1 = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,150)");
//
//        //clicking on save button
//        Thread.sleep(5000);
//        WebElement save4=driver.findElement(xpath("//*[text()=\"Save\"]"));
//        save4.click();
////
////        //clicking on close button
//        Thread.sleep(3000);
//        WebElement close4=driver.findElement(xpath("//*[text()=\"Close\"]"));
//        close4.click();
//
//
////        //moving to careplanepage
////        Thread.sleep(5000);
////        WebElement careplanepage=driver.findElement(xpath("//*[@id=\"mat-tab-label-0-2\"]"));
////        careplanepage.click();
//
//        //choosing RecordedBy
//        Thread.sleep(3000);
//        WebElement RecordedBy2=driver.findElement(xpath("//*[@formcontrolname=\"RecordedBy3\"]"));
//        RecordedBy2.click();
//
//        //choosing doctor NareshSharma
//        Thread.sleep(5000);
//        WebElement NareshSharma2=driver.findElement(xpath("//*[text()=\"Naresh  Sharma\"]"));
//        NareshSharma2.click();
//
//        //choosing save button
//        Thread.sleep(3000);
//        WebElement save3=driver.findElement(xpath("//*[text()=\"Save\"]"));
//        save3.click();
//
//        Thread.sleep(3000);
//        WebElement close3=driver.findElement(xpath("//*[text()=\"Close\"]"));
//        close3.click();
//
//
//
//        ////moving e-Prescription
//        Thread.sleep(20000);
//        WebElement Prescription=driver.findElement(xpath("//*[text()\\=\"e-Prescription\"]"));
//        Prescription.click();
//
//        //searching on drugname
//        Thread.sleep(3000);
//        WebElement drugname=driver.findElement(xpath("//*[@formcontrolname=\"ItemDrugName\"]"));
//        drugname.sendKeys("dolo");
//
//
//        //clicking on drugname
//        Thread.sleep(10000);
//        WebElement clickingdrugname=driver.findElement(xpath("//*[text()=\" 52959-0351-24 / DOLOBID TABLETS\"]"));
//        clickingdrugname.click();
//
//        //choosing Route
//        Thread.sleep(3000);
//        WebElement Route=driver.findElement(xpath("//*[@formcontrolname=\"Route\"]"));
//        Route.click();
//
//        //choosing Routeoral
//        Thread.sleep(3000);
//        WebElement Routeoral=driver.findElement(xpath("  //*[text()=\" Oral\"]"));
//        Routeoral.click();
//
//       //Choosing Diagnosis
//        Thread.sleep(3000);
//        WebElement Diagnosis=driver.findElement(xpath(" //*[@formcontrolname=\"Diagnosis\"]"));
//        Diagnosis.sendKeys("fever");
//
//        //choosing feverdiagnosis
//        Thread.sleep(10000);
//        WebElement feverdiagnosis=driver.findElement(xpath("//*[text()=\"A924 - Rift Valley fever\"]"));
//        feverdiagnosis.click();
//
//        //Entering total qutanity
//       Thread.sleep(3000);
//        WebElement Qty=driver.findElement(xpath("//*[@formcontrolname=\"Qty\"]"));
//        Qty.sendKeys("10");
//
//        //entering totaldays
//        Thread.sleep(3000);
//        WebElement totaldays=driver.findElement(xpath("//*[@formcontrolname=\"Days\"]"));
//        totaldays.sendKeys("10");
//
//        //takingtimes
//        Thread.sleep(3000);
//        WebElement takingtimes=driver.findElement(xpath("//*[@formcontrolname=\"Brunch\"]"));
//        takingtimes.click();
//
//        //taking medication motning/nighy
//        Thread.sleep(3000);
//        WebElement motningnighy=driver.findElement(xpath("//*[@formcontrolname=\"Before\"]"));
//        motningnighy.click();
//
//        //taking medication start,hold
//        Thread.sleep(3000);
//        WebElement start=driver.findElement(xpath("(//*[@value=\"start\"])[1]"));
//        start.click();
//
//        //        //clicking on save button
//        Thread.sleep(5000);
//        WebElement save5=driver.findElement(xpath("(//*[text()=\"Save\"])[2]"));
//        save5.click();
//
//        //clicking on close button
//        Thread.sleep(3000);
//        WebElement close5=driver.findElement(xpath("//*[text()=\"Close\"]"));
//        close5.click();
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////        //view intakesummary
////        Thread.sleep(10000);
////        WebElement intakesummary=driver.findElement(xpath("//*[@mattooltip=\"Intake Summary\"]"));
////        intakesummary.click();
////
////        //moving allergypart
////        Thread.sleep(5000);
////        WebElement allergypart=driver.findElement(xpath("(//*[text()=\"2\"])[2]"));
////        allergypart.click();
////
////        //moving problemlist
////        Thread.sleep(5000);
////        WebElement problemlist=driver.findElement(xpath("//*[text()=\"3\"]"));
////        problemlist.click();
////
////        //moving to medication
////        Thread.sleep(5000);
////        WebElement medication=driver.findElement(xpath("//*[text()=\"4\"]"));
////        medication.click();
////       //moving to Social
////        Thread.sleep(5000);
////        WebElement Social=driver.findElement(xpath("(//*[text()=\"5\"])[1]"));
////        Social.click();
////
////        //moving to ROS
////        Thread.sleep(5000);
////        WebElement ROS=driver.findElement(xpath("//*[text()=\"6\"]"));
////        ROS.click();
////
////        //moving to ROS
////        Thread.sleep(5000);
////        WebElement Nutrition=driver.findElement(xpath("//*[text()=\"7\"]"));
////        Nutrition.click();
////
////        //moving to Functional
////        Thread.sleep(5000);
////        WebElement Functional=driver.findElement(xpath("//*[text()=\"8\"]"));
////        Functional.click();
////        //moving to//moving to Nursing
////
////        Thread.sleep(5000);
////        WebElement Nursing=driver.findElement(xpath("//*[text()=\"9\"]"));
////        Nursing.click();
////
////        //back
////        Thread.sleep(5000);
////        WebElement back=driver.findElement(xpath("//*[@class=\"close\"]"));
////        back.click();
//
//
//
//
//
//
//    }
//}