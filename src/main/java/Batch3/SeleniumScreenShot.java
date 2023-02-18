package Batch3;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SeleniumScreenShot {
    String filepath = "C:\\Users\\Rubal Ahmed\\Desktop\\screen shot picture";



    public void takesScreen() throws IOException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/draggable/");
        driver.close();
        TakesScreenshot screen=((TakesScreenshot)driver);
        File fi= screen.getScreenshotAs(OutputType.FILE);
        File  DestFile = new File(filepath + "picture" + System.currentTimeMillis() +".jpg");
        FileUtils.copyFile(fi, DestFile);}


    public static void main(String[] args) throws IOException {
        SeleniumScreenShot ss= new SeleniumScreenShot();
     ss.takesScreen();
    }
}
