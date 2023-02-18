package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindowHandling {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https:/accounts.google.com/signup");
        String parentid =driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
        System.out.println(driver.getTitle());
        Set<String> windows =driver.getWindowHandles();
        windows.remove(parentid);
        Iterator<String> wi=windows.iterator();
        if(wi.hasNext()){
            String childid =wi.next();
            System.out.println(childid);
            driver.switchTo().window(childid);
        }
        //String childid =wi.next();
        System.out.println(parentid);


        WebElement HelpCenter =driver.findElement(By.xpath("//a[text()='Help Center']"));
        Actions action = new Actions(driver);
        action.contextClick(HelpCenter).build().perform();
       /* System.out.println("after switch to child window");
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentid);
        System.out.println("after switching back to parent");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rubal");
       // driver.switchTo().window(childid);
       */

    }
}
