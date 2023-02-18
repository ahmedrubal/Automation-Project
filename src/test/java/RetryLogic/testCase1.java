package RetryLogic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCase1 {
    public WebDriver driver;
    @Test
    public void fbTest(){
        System.setProperty("webdriver.chrome.driver","drivers/ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        System.out.println("facebook working as expectd");
    }
    @Test
    public void twitterTest(){
        System.setProperty("webdriver.chrome.driver","drivers/ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("twitter is not working as expected");
        Assert.assertTrue(false);
    }
    @Test
    public void instaTest(){
        System.setProperty("webdriver.chrome.driver","drivers/ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("insta is working as expected");
    }




}
