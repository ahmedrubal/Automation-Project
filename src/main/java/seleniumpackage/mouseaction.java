package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class mouseaction {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
         driver = new ChromeDriver();
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Utils.implicitWait(driver,5, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com/");
        System.out.println("Title is ::" + driver.getTitle());
       Utils.ExplicitWebdriverWait(driver,5);
         Actions action = new Actions(driver);
        WebElement move=driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
        WebElement searchbox=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        // move to specific element(mouse hoover)
        action.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("umbrella").keyUp(Keys.SHIFT).doubleClick().build().perform();
         action.moveToElement(move).contextClick().build().perform();
    }
}
