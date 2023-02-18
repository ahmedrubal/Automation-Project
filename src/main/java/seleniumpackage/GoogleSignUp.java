package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GoogleSignUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signup");
        String parentWindow = driver.getWindowHandle();

        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[text()=\"Help\"]")).click();
       Set<String> multipeleWindows = driver.getWindowHandles();
       multipeleWindows.remove(parentWindow);
       Iterator<String> wi = multipeleWindows.iterator();

       if(wi.hasNext()){
           String childWindow = wi.next();
           driver.switchTo().window(childWindow);
       }
        Thread.sleep(5000);

       WebElement verifyChildWindow = driver.findElement(By.xpath("//*[text()='How can we help you?']"));
        System.out.println(verifyChildWindow.getText());
        System.out.println(driver.getTitle());
       Assert.assertTrue(true);
       Assert.assertEquals(verifyChildWindow.getText(),"How can we help you?");
       driver.findElement(By.xpath("//input[@placeholder='Describe your issue']")).sendKeys("h");
       List<WebElement> options = driver.findElements(By.xpath("//ul[@class='sbsb_b']"));



    }
}
