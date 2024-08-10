package Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        Thread.sleep(5000);
        WebElement Editeconsulting=driver.findElement(xpath("//*[@class=\"footerIcons\"]"));
        Editeconsulting.click();

        //choosing RecordedBy
        Thread.sleep(5000);
        WebElement RecordedBy=driver.findElement(xpath("//*[@formcontrolname=\"RecordedBy1\"]"));
        RecordedBy.click();

        //choosing doctor NareshSharma
        Thread.sleep(5000);
        WebElement NareshSharma=driver.findElement(xpath("//*[text()=\"Naresh  Sharma\"]"));
        NareshSharma.click();

        //choosingprobelmlocation
        Thread.sleep(5000);
        WebElement probelmlocation=driver.findElement(xpath("//*[@formcontrolname=\"ProblemAreaID\"]"));
        probelmlocation.click();

        //choosingchoosingprobelmlocation
        Thread.sleep(5000);
        WebElement choosingchoosingprobelmlocation=driver.findElement(xpath("(//*[text()=\"Otosclerosis\"])[1]"));
        choosingchoosingprobelmlocation.click();

       //Entering problemduration
        Thread.sleep(5000);
        WebElement problemduration=driver.findElement(xpath("//*[@formcontrolname=\"ProblemDuration\"]"));
        problemduration.sendKeys("1");




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