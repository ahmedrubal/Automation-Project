package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Handlinglinks {
    public static void main(String[]args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.get("https:/www.facebook.com");
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       List<WebElement> links = driver.findElements(By.tagName("a"));// Every links available in a webpage with anchor tag <a> and for a multiple elements we have to locate using findelements method.
        // ALso evey tag has a href attribute available
        System.out.println(" number of links " + links.size()); //get total numbers of links
        for(WebElement ele: links){//using for each loop i am capturing text of the link , printing value of href attribute and finally printing tag name of links in the console
           System.out.println("links is ::" + ele.getText()  + " get href ::" + ele.getAttribute("href"));
            System.out.println("get tag name ::" + ele.getTagName());

        }
//        System.out.println();
//        Thread.sleep(2000);
//          WebElement link =  driver.findElement(By.xpath("//a[text()='Forgot Password?']")); // FOR A PACIFIC LINK WE HAVE TO LOCATE ELEMENT BY USING FINDELEMENT METHOD
//            System.out.println("Link is " + link.getText());
//            System.out.println("href is " + link.getAttribute("href"));
//            System.out.println(" Tag name " + link.getTagName());
//            Thread.sleep(10000);
//            link.click();
//            Thread.sleep(10000);
            driver.close();

    }
}
