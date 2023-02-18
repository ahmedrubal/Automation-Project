package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HandlingScroll {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://jqueryui.com/draggable/");
//
//      JavascriptExecutor jse = (JavascriptExecutor)driver;//object creation for JavaScriptExecutor interface
//        //create object for interface don't need to use new keyword (new keyword use for class)
//        jse.executeScript("window.scrollTo(0,500)"); //page scroll up but scroll bar goes down(x and y cordinate)
//        Thread.sleep(1000);// used thread.sleep for wait 5 seconds and exception handelled by using throws keyword
//        jse.executeScript("scrollBy (0, -500)"); //page scroll down by making y cordinate negative value
//        Thread.sleep(5000);
//        jse.executeScript("-200,0"); //page scroll left always have to change x cordinate value
//        Thread.sleep(5000);
//        jse.executeScript("200,0");//page scroll right
//        WebElement txt=driver.findElement(By.xpath("//h2[text() ='Connect with friends and the world around you on Facebook.']"));
//        System.out.println(txt.getText());
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        List<WebElement> number =driver.findElements(By.xpath("//a"));
//        System.out.println("size of links" + number.size());
//        for (WebElement ele: number){
//            System.out.println(ele.getAttribute("href"));
//            System.out.println(ele.getText());
//            System.out.println(ele.getLocation());
//        }
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window. scrollTo(0,200)");
         WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
         driver.switchTo().frame(frame);
         System.out.println(driver.findElement(By.xpath("//p[text()='Drag me around']")).getText());
          WebElement Drag =driver.findElement(By.xpath("//div[@id='draggable']"));
          Thread.sleep(5000);
          Actions action = new Actions(driver);
          action.clickAndHold().moveByOffset(20,60).build().perform();

//        Thread.sleep(5000);
//        driver.close();

    }
}
