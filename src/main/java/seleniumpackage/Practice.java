package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;


public class Practice {

   // String url="https://jqueryui.com/datepicker/";
    public static void main(String[] args) throws InterruptedException {
//        String url="https://jqueryui.com/datepicker/";
//        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//        WebDriver driver= new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("file:///C:/Users/RUBALA~1/AppData/Local/Temp/Rar$EXa13864.18318/WebPage/2ndPage.html");
//       List<WebElement> rows = driver.findElements(By.xpath("//tr"));
//       List<WebElement> cols = driver.findElements(By.xpath("//th"));
//       List<WebElement> data = driver.findElements(By.xpath("//td"));
//       for (int r=0;r<rows.size();r++){
//
//           for (int c=0; c<cols.size();c++){
//
//               System.out.println(data.get(c).getText());
//           }
//        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        arr1.add(4);
        arr1.add(5);
        arr1.add(3);
        arr.addAll(arr1);
        arr.remove(1);

        System.out.println(arr.size());
        System.out.println(arr1.size());
        ListIterator<Integer> collec=arr.listIterator();
        System.out.println();
        while (collec.hasNext()){
            System.out.println(collec.next());
        }


//       ListIterator<WebElement> colum =cols.listIterator();
//        System.out.println(colum.next());





//        WebElement id =driver.findElement(By.xpath("//td[text()='Maria Anders']"));
//        System.out.println(id.getText());
//        driver.switchTo().frame(0);
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//a[@href=\"#\"]")).click();
       // driver.close();



    }

}
