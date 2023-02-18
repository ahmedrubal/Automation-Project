package seleniumpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NewPractice {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.close();
       WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
       //username.sendKeys("ahmednobal@gmail.com");
      // WebElement name = driver.findElement(By. name("pass"));
      // name.sendKeys("");
       //Thread.sleep(500);
      // driver.findElement(By.xpath("//input[@type='submit']")).click();
       //Thread.sleep(4000);
       //driver.navigate().to("https://www.amazon.com/");
        WebDriverWait Wait = new WebDriverWait(driver,5);
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-logo-link']")));
       WebElement searchbox = driver.findElement(By.xpath("//input[@type='text']"));
       searchbox.sendKeys("hand sanitizer");
        driver.findElement(By.xpath("//input[@type='text']")).clear();
      // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement searchbox1 = driver.findElement(By.xpath("//input[@type='text']"));
        searchbox1.sendKeys("hand sanitizer");
        //driver.findElement(By.xpath("//input[@type='text']")).clear();
       driver.findElement(By.xpath("//input[@class='nav-input']")).click();
       Thread.sleep(3000);
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("scrollBy(0,3000)");
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scrollBy(0,-3000)");
        Thread.sleep(3000);
        JavascriptExecutor jsr = (JavascriptExecutor)driver;
        jsr.executeScript("scrollBy(50,0)");
        Thread.sleep(3000);
        JavascriptExecutor jsi = (JavascriptExecutor)driver;
        jsi.executeScript("scrollBy(-50,0)");
       // driver.quit();
    }
}
