package Batch3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;

public class MySqlCnnector {
    public static void main(String[] args) throws SQLException {
        String host="localhost";
        String port="3306";
        Connection co = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/ world" , "root","root");
        Statement s = co.createStatement();
       ResultSet rs = s.executeQuery("select*from rubal where id=1;");
       while (rs.next()){
       System.out.println(rs.getString("name"));
       System.out.println(rs.getString("salary"));

           WebDriver  driver;
           System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
           driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(rs.getString("name"));

       }
    }
}
