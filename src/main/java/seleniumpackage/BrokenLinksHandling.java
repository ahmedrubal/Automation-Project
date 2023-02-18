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


public class BrokenLinksHandling {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//        //HERE I AM WORKING WITH ONLY ONE LINK
//        String RestApiUrl = driver.findElement(By.xpath("//a[text()='Broken Link']")).getAttribute("href");
//        HttpURLConnection connection =(HttpURLConnection)new URL(RestApiUrl).openConnection();
//        connection.setRequestMethod("HEAD");
//        connection.connect();
//        int respondCode = connection.getResponseCode();
//        System.out.println(respondCode);
//        Thread.sleep(2000);
        // HERE I AM WORKING WITH MULTIPLE LINKS
        List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li'] /a"));
        System.out.println(links.size());
        for(WebElement link: links){
            String url = link.getAttribute("href");
            HttpURLConnection connection =(HttpURLConnection)new URL(url).openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        int respondCode = connection.getResponseCode();
        System.out.println(respondCode);
        if (respondCode>400){
            System.out.println("Text of the link " +link.getText()+ "Responce code of the link" +respondCode);
            Assert.assertTrue(true);
        }

        }
        driver.close();

    }
}
