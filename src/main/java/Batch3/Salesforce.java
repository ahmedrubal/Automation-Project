package Batch3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Salesforce {
    public static void main(String[] args) {

      //  String text  ="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        driver = new ChromeDriver();
       // driver.get("https://login.salesforce.com/");
        driver.get("https://salesforce.com/");
        driver.manage().window().maximize();
       String text=  driver.findElement(By.xpath("//h3[text()='Small Business']/preceding::h2")).getText();
       Assert.assertEquals(text,"What's new at Salesforce?");

       //   driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Keys.SHIFT,"rubal");
//        driver.findElement(By.cssSelector("#password")).sendKeys("AHMED");
//        driver.findElement(By.cssSelector("input[type*='submit']")).click();

        driver.close();
       // System.out.println(driver.findElements(By.tagName("a")).size());
    }
}
