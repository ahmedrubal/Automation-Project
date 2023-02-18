package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Handlingradiobuttonandcheckbox {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/sampleSiteForSelenium.html");
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse .executeScript("scrollBy(0,1200)");



        //RADIO BUTTON

      /*  WebElement male = driver.findElement(By.id("male"));// just inspect element and use click method for selecting a radio button or checkboxes
        male.click();
        Thread.sleep(5000);
       WebElement female = driver.findElement(By.id("female"));
      //  female.click();
        if (male.isSelected()){// here i used if else condition by using isselected method just to verify is the selected element selected or not to validate
            System.out.println("if block");
            female.click();}
            else{
                male.click();
            System.out.println("else block");
        }*/
            //CHECK BOXES
        WebElement automation = driver.findElement(By.xpath("//input[@class='Automation']"));// this is checkbox handling
            automation.click();
           // driver.close();
      




    }
}
