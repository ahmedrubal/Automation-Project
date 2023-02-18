package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class udemy {
    public static void main(String[] args) throws InterruptedException {
        System .setProperty("webdriver.chrome.driver","drivers/Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("muhibul");
        driver.findElement(By.id("pass")).sendKeys("123");
        driver.findElement(By.linkText("Log In")).click();
        System.out.println( driver.findElement(By.linkText("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText());

       /* Actions action = new Actions(driver);


        WebElement client = driver. findElement(By.linkText("Clients"));
        Thread.sleep(2000);
        action.moveToElement(client).perform();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Design")).click();
        Thread.sleep(1000);
        System.out.println(driver.getCurrentUrl());*/




    }
}
