package Batch3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import sun.awt.SunHints;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class PPurpose {
    public static void main(String[]args) throws AWTException, InterruptedException {
        WebDriver driver;
        System .setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://artoftesting.com/samplesiteforselenium");
       // Actions action =new Actions(driver);
        Thread.sleep(5000);
        WebElement right= driver.findElement(By.xpath("//a[text()='Home']"));
        Actions action =new Actions(driver);
        action.moveToElement(right).contextClick(right).build().perform();
       // action.contextClick(right);
        Thread.sleep(5000);

        action.keyUp(right,Keys.ARROW_UP).keyDown(right,Keys.ENTER).build().perform();
        //action.contextClick();
//        Robot robot=new Robot();
//        robot.keyPress(KeyEvent.VK_UP);
//        robot.keyRelease(KeyEvent.VK_UP);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);


//        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ahmed");
//        WebElement doubleclick= driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
//       // Actions action =new Actions(driver);
//        action.doubleClick(doubleclick).build().perform();
//        Alert alert= driver.switchTo().alert();
//       String actualtext = alert.getText();
//        System.out.println(actualtext);
//        String exptext="Hi! Art Of Testing, Here!";
//        if (actualtext.equals(exptext)){
//            System.out.println("text matched");
//        }else {
//            System.out.println("not mATCHED");
//        }
//        alert.accept();




}  }
