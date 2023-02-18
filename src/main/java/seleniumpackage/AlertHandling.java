package seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("http://testautomationpractice.blogspot.com/");
//        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
//
//        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert() ;
//        System.out.println(alert.getText());
//       // alert.accept();
//        alert.dismiss();
//       String text= driver.findElement(By.xpath("//p[@id='demo']")).getText();
//        if(text.equals("You pressed Cancel!")){
//            System.out.println("You pressed cancel");
//        }else {
//            System.out.println("print nothing");
//        }
        WebElement ca= driver.findElement(By.xpath("//input[@id='datepicker']"));
        ca.click();
        Thread.sleep(5000);
        WebElement date= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]/a"));
        Thread.sleep(5000);
        Actions action=new Actions(driver);
        action.moveToElement(date).click();
       // Thread.sleep(5000);


//
//        Select select=new Select(ca);
//       select.selectByVisibleText("25");

       // WebElement calender2=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]/a"));
//        WebDriverWait wait= new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.visibilityOf(calender));

       // calender2.click();
       // calender.click();
       driver.close();

    }
}
