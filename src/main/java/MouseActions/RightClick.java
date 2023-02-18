package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class RightClick {
    WebDriver driver;
    String url="http://demo.guru99.com/test/newtours/";

    public void launch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    WebElement newTours = driver.findElement(By.xpath("//a[text()=\"New Tours\"]"));
    Actions actions = new Actions(driver);
       actions.contextClick(newTours).build().perform();
       Thread.sleep(2000);
       driver.close();}

    public static void main(String[] args) throws InterruptedException {
        RightClick obj = new RightClick();
        obj.launch();



    }
}
