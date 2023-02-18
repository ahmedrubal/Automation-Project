package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","drivers/ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        WebElement userIdField =driver.findElement(By.id("txtUsername"));
        userIdField.sendKeys("Admin");
        WebElement PasswordField = driver.findElement(By.id("txtPassword"));
        PasswordField.sendKeys("admin123");
        WebElement LoginButton =driver.findElement(By.xpath("//input[@name=\"Submit\"]"));
        LoginButton.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[4]")).click();
//      //  Thread.sleep(2000);
//      //  LoginButton.click();
//        String tagname=userIdField.getTagName();
//        System.out.println("Tag Name is ::" +tagname);
//        String fontcolor = userIdField.getCssValue("color");
//        System.out.println("font color is::" +fontcolor);
//
//       WebElement text = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/span"));
//       String i = text.getText();
//        System.out.println("Text available is::" +i);
//       Dimension size = PasswordField.getSize();
//       int height = size.height;
//       int width = size.width;
//        System.out.println("height is:: " +height);
//        System.out.println("width is ::" +width);







    }
}
