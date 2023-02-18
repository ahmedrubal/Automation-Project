package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;


public class FramesWithDragAndDrop {
    public static void main(String[] args)  {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for (WebElement link: links){
            System.out.println(link);
            System.out.println(link.getAttribute("href"));
        }
       // System.out.println(driver.findElements(By.tagName("iframe")).size());
        String header = driver.findElement(By.xpath("//h2[@class='logo']/a ")).getText().toUpperCase();

        System.out.println(header);
        if(header.endsWith("UI")){
            System.out.println("header matched");
        }else {
            System.out.println("not matched");
        }
        driver.close();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//a[text()='Slider']")).click();
//        Thread.sleep(5000);
//        driver.switchTo().frame(0);
//        WebElement moveAble = driver.findElement(By.xpath("//div[@id='slider']/span"));
//        if (moveAble.isEnabled()) {
//            System.out.println("it is enabled in an webapplication");
//        } else {
//            System.out.println("not enable in a page");
//        }
//
//
//            WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
//            Actions action = new Actions(driver);
//            action.clickAndHold(moveAble).moveByOffset(150, 0).release(moveAble).build().perform();
//
//            //action.clickAndHold(moveAble).moveToElement(slider,150,0).build().perform();


            //BY using index
//    driver.switchTo().frame(0);
//        //By using webelement
//    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
//    driver.findElement(By.xpath("//div[@id=\"draggable\"]")).click();
//    Actions action = new Actions(driver);
//    WebElement source= driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
//    WebElement target =driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
//    Thread.sleep(5000);
//    action.dragAndDrop(source,target).build().perform();
//    //come out from frame
//         driver.switchTo().defaultContent();


        }
    }
