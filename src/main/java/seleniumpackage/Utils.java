package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Utils {
    WebDriver driver;
    public static void sleep(int time){
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.getMessage();
        }
    }
    public static void implicitWait(WebDriver driver,long time,TimeUnit TimeUnit){
        driver.manage().timeouts().implicitlyWait(time,TimeUnit);
    }
    public static void ExplicitWebdriverWait(WebDriver driver,long time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.alertIsPresent());

    }
    public static void fluentWait(WebDriver driver,long time ,TimeUnit timeUnit){
               Wait wait = new FluentWait<WebDriver>(driver)
              .withTimeout(10,TimeUnit.SECONDS)
              .pollingEvery(2,TimeUnit.SECONDS);
               wait.until(ExpectedConditions.alertIsPresent());

    }






    public static void main(String[] args) {

    }
}
