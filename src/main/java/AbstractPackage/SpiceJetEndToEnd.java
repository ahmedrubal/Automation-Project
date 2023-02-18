package AbstractPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;


public class SpiceJetEndToEnd {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://beta.spicejet.com/");
        WebElement text = driver.findElement(By.xpath("//div[text()='Welcome aboard.']"));
        WebDriverWait wait = new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOf(text));
        System.out.println(text.getText());

       WebElement roundTrip = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[2]"));
       roundTrip.click();

        System.out.println(roundTrip.isSelected());
        driver.findElement(By.xpath("//input[@type='text']")).click();
        WebElement agra = driver.findElement(By.xpath("//div[text()='Agra']"));
        agra.click();
        Thread.sleep(2000);
        WebElement jaipur = driver.findElement(By.xpath("//div[text()='Jaipur']"));
        jaipur.click();
//   HERE WE CAN USE ACTIONS CLASS ALSO TO CLICK ON ELEMENT jaipur
//        Actions action = new Actions(driver);
//        action.moveToElement(jaipur).click().build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73']")).click();
       WebElement seniorCitizen = driver.findElement(By.xpath("//div[text()='Senior Citizen']"));
       Thread.sleep(3000);
      // seniorCitizen.click();

        System.out.println(seniorCitizen.isEnabled());
        if (seniorCitizen.isDisplayed())
        if (seniorCitizen.isDisplayed()){
            seniorCitizen.click();
        }
        List<WebElement> options = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[6]"));
        for (int i =0; i<options.size();i++){
           String get = options.get(i).getText();
            System.out.println(get);
            if (get.contains("Students")){
                Assert.assertTrue(true);
            }
        }
        Thread.sleep(2000);
       driver.close();













    }
}
