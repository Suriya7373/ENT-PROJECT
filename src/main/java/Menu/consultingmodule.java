package Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.CdpVersionFinder;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;
import java.util.Optional;
import java.time.Duration;

import static org.openqa.selenium.By.xpath;

public class consultingmodule {
    WebDriver driver;

    public consultingmodule(WebDriver driver) {

        this.driver = driver;
    }

    public void consulting() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
        // Thread.sleep(5000);
        //clicking on consulting
        WebElement consulting = driver.findElement(xpath("//div[normalize-space()='Consulting']"));
        consulting.click();
        //searchpatient
        Thread.sleep(3000);
        WebElement searchpatient = driver.findElement(xpath("//*[@formcontrolname=\"Patient\"]"));
        searchpatient.sendKeys("Rabin");

        //clivking on kevinpatient
        Thread.sleep(3000);
        WebElement Rabinpatient=driver.findElement(xpath("//*[text()=\" Rabin      john - MR0000118 \"]"));
        Rabinpatient.click();

        //searchpatient
        Thread.sleep(3000);
        WebElement searchpatient1=driver.findElement(xpath("//*[text()=\"Search\"]"));
        searchpatient1.click();

        //Editeconsulting
        Thread.sleep(3000);
        WebElement Editeconsulting=driver.findElement(xpath("//*[@class=\"footerIcons\"]"));
        Editeconsulting.click();

        //choosing RecordedBy
        Thread.sleep(3000);
        WebElement RecordedBy=driver.findElement(xpath("//*[@formcontrolname=\"RecordedBy1\"]"));
        RecordedBy.click();

        //choosing doctor NareshSharma
        Thread.sleep(3000);
        WebElement NareshSharma=driver.findElement(xpath("//*[text()=\"Naresh  Sharma\"]"));
        NareshSharma.click();

        //choosingprobelmlocation
        Thread.sleep(3000);
        WebElement probelmlocation=driver.findElement(xpath("//*[@formcontrolname=\"ProblemAreaID\"]"));
        probelmlocation.click();

        //choosingchoosingprobelmlocation
        Thread.sleep(3000);
        WebElement choosingchoosingprobelmlocation=driver.findElement(xpath("(//*[text()=\"Otosclerosis\"])[1]"));
        choosingchoosingprobelmlocation.click();

        //clicking outside to updatethe previous value
        Thread.sleep(2000);
        WebElement outside=driver.findElement(xpath("//*[@class=\"cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing\"]"));
        outside.click();

       //Entering problemduration
        Thread.sleep(3000);
        WebElement problemduration=driver.findElement(xpath("//*[@formcontrolname=\"ProblemDuration\"]"));
        problemduration.sendKeys("1");

        //choosing problem symptomsdropdown
        Thread.sleep(3000);
        WebElement symbtomsdropdown=driver.findElement(xpath("//*[@formcontrolname=\"SymptomsID\"]"));
        symbtomsdropdown.click();

        //choosing symptoms
        Thread.sleep(2000);
        WebElement symptoms=driver.findElement(xpath("//*[text()=\"Fussiness \"]"));
        symptoms.click();

        //clicking outside to updatethe previous value
//        Thread.sleep(5000);
//        WebElement outside1= (WebElement) driver.findElements(xpath("//*[@class=\"cdk-overlay-connected-position-bounding-box\"]"));
        outside1.click();
//        Thread.sleep(3000);
//        List<WebElement> elements = driver.findElements(By.xpath("//*[@class=\"cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing\"]"));
//        WebElement element = elements.get(0);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", element);
//        element.click();


        //choosing problemtype
        Thread.sleep(5000);
        WebElement choosingproblemtype=driver.findElement(xpath("(//*[@class=\"mat-select-value\"])[5]"));
        choosingproblemtype.click();

        //choosing problem type hearingloss
        Thread.sleep(3000);
        WebElement hearingloss=driver.findElement(xpath("(//*[text()=\"Hearing loss\"])[2]"));
        hearingloss.click();

        //clicking outside to updatethe previous value
        Thread.sleep(2000);
        WebElement outside2=driver.findElement(xpath("//*[@class=\"cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing\"]"));
        outside2.click();

        //choosing problemstatusdropdown
        Thread.sleep(3000);
        WebElement problemstatusdropdown=driver.findElement(xpath("//*[@formcontrolname=\"ProblemStatus\"]"));
        problemstatusdropdown.click();

        //choosing problemstatus
        Thread.sleep(3000);
        WebElement problemstatus=driver.findElement(xpath("//*[text()=\"Func., health\"]"));
        problemstatus.click();

        //choosing save button
        Thread.sleep(3000);
        WebElement save=driver.findElement(xpath("//*[@class=\"custome-button mat-primary schedbtn mat-flat-button mat-button-base\"]"));
        save.click();






//        //view intakesummary
//        Thread.sleep(10000);
//        WebElement intakesummary=driver.findElement(xpath("//*[@mattooltip=\"Intake Summary\"]"));
//        intakesummary.click();
//
//        //moving allergypart
//        Thread.sleep(5000);
//        WebElement allergypart=driver.findElement(xpath("(//*[text()=\"2\"])[2]"));
//        allergypart.click();
//
//        //moving problemlist
//        Thread.sleep(5000);
//        WebElement problemlist=driver.findElement(xpath("//*[text()=\"3\"]"));
//        problemlist.click();
//
//        //moving to medication
//        Thread.sleep(5000);
//        WebElement medication=driver.findElement(xpath("//*[text()=\"4\"]"));
//        medication.click();
//       //moving to Social
//        Thread.sleep(5000);
//        WebElement Social=driver.findElement(xpath("(//*[text()=\"5\"])[1]"));
//        Social.click();
//
//        //moving to ROS
//        Thread.sleep(5000);
//        WebElement ROS=driver.findElement(xpath("//*[text()=\"6\"]"));
//        ROS.click();
//
//        //moving to ROS
//        Thread.sleep(5000);
//        WebElement Nutrition=driver.findElement(xpath("//*[text()=\"7\"]"));
//        Nutrition.click();
//
//        //moving to Functional
//        Thread.sleep(5000);
//        WebElement Functional=driver.findElement(xpath("//*[text()=\"8\"]"));
//        Functional.click();
//        //moving to//moving to Nursing
//
//        Thread.sleep(5000);
//        WebElement Nursing=driver.findElement(xpath("//*[text()=\"9\"]"));
//        Nursing.click();
//
//        //back
//        Thread.sleep(5000);
//        WebElement back=driver.findElement(xpath("//*[@class=\"close\"]"));
//        back.click();






    }
}