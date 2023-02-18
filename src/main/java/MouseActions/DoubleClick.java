package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import seleniumpackage.Utils;

import java.util.concurrent.TimeUnit;

public class DoubleClick {
  public  WebDriver driver;

    String url1 = "https://artoftesting.com/samplesiteforselenium";
    public void Double()  {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url1);
        Utils.sleep(5);
        WebElement artOfTesting = driver.findElement(By.xpath("//button[@id=\"dblClkBtn\"]"));
        Actions actions = new Actions(driver);
        Utils.sleep(5);
        actions.doubleClick(artOfTesting).build().perform();


        String acctualText =  driver.switchTo().alert().getText();
        System.out.println(acctualText);
       String expectedText = "Hi! Art Of Testing, Here!";
       if(acctualText.equals(expectedText)){
           System.out.println("Text Matched");
       }
       else {
           System.out.println("Not Matched");
       }

       Utils.fluentWait(driver,5,TimeUnit.SECONDS);
        driver.switchTo().alert().accept();
      // Utils.implicitWait(driver,5,TimeUnit.SECONDS);
       WebElement male= driver.findElement(By.xpath("//input[@id=\"male\"]"));
       male.click();


       // driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        DoubleClick obj = new DoubleClick();
       obj.Double();
    }
}
