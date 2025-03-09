package demo;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class flipkartdemo1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // Assuming Chrome WebDriver
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        
       

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("iphone 15 pro max");
        searchBar.submit();

        
         driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 15 Pro Max (White Titanium, 256 GB)']")).click();
  
        
        // Optionally, close the driver
        driver.quit();
    }
}
