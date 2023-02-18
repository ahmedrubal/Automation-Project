package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class MultipleWindow {


    public static void main(String[]args) throws InterruptedException {

        WebDriver driver;

        String url1="http://demo.guru99.com/popup.php";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().window().maximize();

        driver.get(url1);
        String parentid=  driver.getWindowHandle();
        System.out.println(parentid);
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
//        Set<String> handles=driver.getWindowHandles();
//        for (String id:handles){
//            System.out.println(id);
//        }
//        handles.remove(parentid);
////        for(String id:handles) { //line 36,37 and line 39 used for same purpose but just 2 diffrent way
////           String childid=id;
////        }
//         String childid=handles.iterator().next();
//         driver.switchTo().window(childid);
//        WebElement btn= driver.findElement(By.xpath("//input[@name='btnLogin']"));
//
//        if (btn.isDisplayed()){
//            System.out.println("i am in child window");
//        }else {
//            System.out.println("i am in parent window");
//        }
//        driver.switchTo().defaultContent();
      driver.quit();









    }
}
