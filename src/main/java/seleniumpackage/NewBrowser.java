package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class NewBrowser {

    public static void main(String[]args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
       // WebElement username= driver.findElement(By.xpath("//input[@id='email']"));
       // driver.findElement(By.id("email"));

//        FluentWait<WebDriver> wait=new FluentWait<>(driver)
//                .withTimeout(10,TimeUnit.SECONDS)
//                .pollingEvery(2,TimeUnit.SECONDS);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
        FluentWait<WebDriver> wait1=new FluentWait<>(driver)
                .withTimeout(10,TimeUnit.SECONDS)
                .pollingEvery(2,TimeUnit.SECONDS);
        wait1.until(ExpectedConditions.attributeToBe(By.xpath("//input[@id='email']"),"id","email"));
      // username .sendKeys("Rubal Ahmed");
//        Thread.sleep(1000);
//        driver.navigate().to("https://www.ae.com/us/en");
//      //  Thread.sleep(1000);
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.close();

    }
}
