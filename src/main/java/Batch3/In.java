package Batch3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class In {
    public static void main(String[] args) throws InterruptedException {
         WebDriver driver;
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        String actual = driver.findElement(By.xpath("//div[@id='branding']/a/img")).getAttribute("src");
        Assert.assertEquals(actual,"https://opensource-demo.orangehrmlive.com/webres_6051af48107ce6.31500353/themes/default/images/logo.png");
//        List<WebElement> options = driver.findElements(By.xpath("//div[@id='mainMenu']/ul"));
//        Iterator<WebElement> clickingTo = options.iterator();
//        while (clickingTo.hasNext()){
//           clickingTo.next();
//            System.out.println(clickingTo);
//        }

        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerdriver=driver.findElement(By.xpath("//div[@id='mainMenu']/ul"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        driver.findElement(By.xpath("//span[@class='quickLinkText']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rubal");
        driver.findElement(By.xpath("//li/select")).click();
//        for (int i =0;i<footerdriver.findElements(By.tagName("a")).size();i++){
//
//            String clickIn =Keys.chord(Keys.CONTROL,Keys.ENTER);
//            footerdriver.findElements(By.tagName("a")).get(i).sendKeys(clickIn);
//
//
//        }




       // driver.close();


    }
}
