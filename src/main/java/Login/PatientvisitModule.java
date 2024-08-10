package Login;

import Base.Baseconstructor;
import org.openqa.selenium.*;


public class PatientvisitModule extends Baseconstructor {
    public PatientvisitModule() {
        System.out.println("PatientvisitModule");

    }

    public PatientvisitModule(WebDriver driver) {
        System.out.println("appointment");

        this.driver = driver;
    }

    public void Patientvisit() {
        Baseconstructor base = new Baseconstructor();
        base.SleepMethod(10000);
        //Patientvisit
        base.ClickUsingWait(base.prop.getProperty("Patientvisit"));

        //Appointmet through  patientvisit
        base.SleepMethod(20000);
        base.ClickUsingWait(base.prop.getProperty("Appointment1"));

        //Editeappointement
        base.ClickUsingWait(base.prop.getProperty("Editeappointement"));

        //clicking on the visittime
        base.ClickUsingWait(base.prop.getProperty("visittime"));

        //choosingtime
        base.ClickUsingWait(base.prop.getProperty("choosingtime"));

        //am/pm
        base.ClickUsingWait(base.prop.getProperty("am/pm"));

        //setpup the visittime
        base.SleepMethod(3000);
        base.Click(base.prop.getProperty("setvisittime"));

        //clicking on closebutton
        base.SleepMethod(5000);

       // base.Click(base.prop.getProperty("closebutton"));

        base.SleepMethod(5000);
        try {
            WebElement closebutton = driver.findElement(By.xpath("(//*[text()='Close'])[1]"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", closebutton);
            closebutton.click();
        }
        catch (StaleElementReferenceException A){
            System.out.println("error message"+A.getMessage());
        }
        base.SleepMethod(3000);
        WebElement closebutton1 = driver.findElement(By.xpath("(//*[text()='Close'])[1]"));
        closebutton1.click();




        // clicking on VisitTypedropdown
         base.SleepMethod(3000);

            base.ClickUsingWait(base.prop.getProperty("VisitTypedropdown"));

            //choosevisittype Unschedule
            base.ClickUsingWait(base.prop.getProperty("choosevisittype"));

            //clicking on RecordedDuringdropdown
            base.ClickUsingWait(base.prop.getProperty("RecordedDuringdropdown"));

            //chooseRecordedDuring
            base.ClickUsingWait(base.prop.getProperty("chooseRecordedDuring"));

            //choosing urgencydropdown
            base.ClickUsingWait(base.prop.getProperty("urgencydropdown"));

            //choosingurgency
            base.ClickUsingWait(base.prop.getProperty("choosingurgency"));

            //PatientArrivalCondition dropdown
            base.ClickUsingWait(base.prop.getProperty("PatientArrivalCondition"));

            //choosingPatientArrivalCondition
            base.ClickUsingWait(base.prop.getProperty("choosingPatientArrivalCondition"));

            //clicking on ToConsultdropdown
            base.ClickUsingWait(base.prop.getProperty("ToConsultdropdown"));

            //choosing on doctor
            base.ClickUsingWait(base.prop.getProperty("ToConsultdropdown1"));

            //consultingdoctor
            base.ClickUsingWait(base.prop.getProperty("consultingdoctor"));

            //choosingconsultingdoctor
            base.ClickUsingWait(base.prop.getProperty("choosingconsultingdoctor"));

            //consultigtype
            base.ClickUsingWait(base.prop.getProperty("consultigtype"));

            //choosingconsultigtype
            base.ClickUsingWait(base.prop.getProperty("choosingconsultigtype"));

            //ChiefComplaint textbox
            base.ClickUsingSendKeys(base.prop.getProperty("ChiefComplaint"), "Fever");

            //clicking on  VisitPayment
            base.ClickUsingWait(base.prop.getProperty("VisitPayment"));

            //clicking on close button
            base.ClickUsingWait(base.prop.getProperty("closeVisitPaymentpopup"));

            //clicking on back button
            base.ClickUsingWait(base.prop.getProperty("backVisitPaymentpopup"));


            // WebElement Requestsappointments = driver.findElement(xpath("//*[@id=\"Requests\"]"));
//        Requestsappointments.click();
//        //Editeappointement
//        Thread.sleep(2000);
//        WebElement Editeappointement = driver.findElement(xpath("//*[@class=\"footerIcons ng-star-inserted\"]"));
//        Editeappointement.click();
//        //Scrollbar
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0,300)");
//        //clicking on the visittime
//        Thread.sleep(2000);
//        WebElement visittime = driver.findElement(xpath("//*[@formcontrolname=\"VisitTime\"]"));
//        visittime.click();
//
//        //choosingtime10
//        Thread.sleep(5000);
//        WebElement choosingtime10 = driver.findElement(xpath("//*[text()=\" 6 \"]"));
//        choosingtime10.click();
//
//        //am/pm
//        Thread.sleep(3000);
//        WebElement pm = driver.findElement(xpath("//*[text()=\"PM\"]"));
//        pm.click();
//
//
//
////   //choosingtime
////        Thread.sleep(5000);
////        WebElement choosingtime = driver.findElement(xpath("(//*[@class=\"clock-face__number clock-face__number--outer ng-star-inserted\"])[31]"));
////        choosingtime.click();
//
//
//        //setpup the visittime
//        Thread.sleep(2000);
//        WebElement setvisittime = driver.findElement(xpath("//*[text()=\"Ok\"]"));
//        setvisittime.click();
//
//        //clicking on close button
//        Thread.sleep(3000);
//        WebElement close1 = driver.findElement(xpath("//*[text()=\"Close\"]"));
//        close1.click();
//
//        // clicking on VisitType dropdown
//        Thread.sleep(2000);
//        WebElement VisitType = driver.findElement(xpath("//*[@formcontrolname=\"VisitType\"]"));
//        VisitType.click();
//
//        //choosevisittype
//        Thread.sleep(3000);
//        WebElement choosevisittype = driver.findElement(xpath("//*[text()=\"Unschedule\"]"));
//        choosevisittype.click();
//
//        //clicking on RecordedDuringdropdown
//        Thread.sleep(2000);
//        WebElement RecordedDuringdropdown = driver.findElement(xpath("//*[@formcontrolname=\"RecordedDuring\"]"));
//        RecordedDuringdropdown.click();
//
//        //chooseRecordedDuring
//        Thread.sleep(3000);
//        WebElement chooseRecordedDuring = driver.findElement(xpath("//*[text()=\" Day care \"]"));
//        chooseRecordedDuring.click();
//
//        //choosing urgencydropdown
//        Thread.sleep(2000);
//        WebElement urgencydropdown = driver.findElement(xpath("(//*[@class=\"col-lg-3\"])[6]"));
//        urgencydropdown.click();
//
//        //choosingurgency
//        Thread.sleep(3000);
//        WebElement choosingurgency = driver.findElement(xpath("//*[text()=\" Urgent \"]"));
//        choosingurgency.click();
//
//        //PatientArrivalCondition dropdown
//        Thread.sleep(2000);
//        WebElement PatientArrivalCondition = driver.findElement(xpath("//*[@formcontrolname=\"PatientArrivalCondition\"]"));
//        PatientArrivalCondition.click();
//
//        //choosingPatientArrivalCondition
//        Thread.sleep(3000);
//        WebElement choosingPatientArrivalCondition = driver.findElement(xpath("//*[text()=\" Delayed \"]"));
//        choosingPatientArrivalCondition.click();
//
//        //clicking on ToConsult dropdown
//        Thread.sleep(2000);
//        WebElement ToConsult = driver.findElement(xpath("//*[@formcontrolname=\"ToConsult\"]"));
//        ToConsult.click();
//
//        //choosing on doctor
//        WebElement doctor = driver.findElement(xpath("//*[text()=\" Naresh  Sharma \"]"));
//        doctor.click();
//        //consultingdoctor
//        Thread.sleep(2000);
//        WebElement consultingdoctor = driver.findElement(xpath("//*[@formcontrolname=\"Provider\"]"));
//        consultingdoctor.click();
//
//        //choosingconsultingdoctor
//        WebElement choosingconsultingdoctor = driver.findElement(xpath("//*[text()=\" Naresh  Sharma \"]"));
//        choosingconsultingdoctor.click();
//
//        //consultigtype
//        Thread.sleep(2000);
//        WebElement consultigtype = driver.findElement(xpath("//*[@formcontrolname=\"ConsultationType\"]"));
//        consultigtype.click();
//
//        //choosingconsultigtype
//        Thread.sleep(2000);
//        WebElement choosingconsultigtype = driver.findElement(xpath("//*[text()=\"  Spec., Proc/ Test \"]"));
//        choosingconsultigtype.click();
//
//        //ChiefComplaint textbox
//        Thread.sleep(2000);
//        WebElement ChiefComplaint = driver.findElement(xpath("//*[@formcontrolname=\"ChiefComplaint\"]"));
//        ChiefComplaint.sendKeys("Diabetic");
//
//        //clicking on  VisitPayment
//        Thread.sleep(2000);
//            WebElement VisitPayment = driver.findElement(xpath("//*[text()=\" Visit Payment \"]"));
//            VisitPayment.click();
//
//        //clicking on close button
//        WebElement close = driver.findElement(xpath("//*[text()='Close']"));
//        close.click();
//
//        //clicking on back button
//        WebElement back = driver.findElement(xpath("//*[text()=' Back ']"));
//        back.click();
//


        }
    }

