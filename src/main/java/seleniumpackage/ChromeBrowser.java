package seleniumpackage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChromeBrowser {




    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
          // THIS SCREEN SHOT METHOD IS NOT WORKING FROM RAHUL SHETTY
            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File( "C:\\Users\\Rubal Ahmed\\Desktop\\screen shot picture\\"));

        WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
        UserName.sendKeys("Rubal");
//            // Webdriver Browser commands
//      //  Utils.sleep(5);
//        driver.get("https://www.hollisterco.com/shop/us");
//
//
//        String title = driver.getTitle();
//        System.out.println("Title of the page ::" + title);
//        String CurrentUrl = driver.getCurrentUrl();
//        System.out.println("currenturl of the page is::" + CurrentUrl);
//        String pagesource = driver.getPageSource();
//        System.out.println("source code of page is::" + pagesource);
//        // Browser navigation commands
//        driver.navigate().to("https://www.hollisterco.com/shop/us");
//        driver.navigate().back();
//        Thread.sleep(500);
//        driver.navigate().forward();
//        Thread.sleep(500);
//        driver.navigate().refresh();
        driver.close();



    }

}


