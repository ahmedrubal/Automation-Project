package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumWait {


    public static void main(String[]args){
        WebDriver driver ;
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
       WebElement userName = driver.findElement(By.xpath("//input[@id=\'txtUsername\']"));
       userName.sendKeys("Admin ");
        WebElement password = driver.findElement(By.xpath("//input[@id=\'txtPassword\']"));
        password.sendKeys("admin123 ");
       WebElement button = driver.findElement(By.xpath("//input[@class='button']"));
       button.click();


    }
}
