package demo;
import java.util.Iterator; 
import java.util.Set; 
import java.util.concurrent.TimeUnit; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 
public class flipkartdemo {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver(); 
	   
	  driver.get("http://www.flipkart.com"); 
	   
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
	   
	  try { 
	   
	  
	   if(driver.findElement(By.xpath("//input[@type='password']")).isDisplayed()) { 
	    
	   driver.findElement(By.xpath("(//button)[2]")).click(); 
	   
	           } 
	   
	  }catch(Throwable t) { 
	   
	   System.out.println("Lightbox not displayed"); 
	   
	  } 
	   
	   
	  driver.manage().window().maximize(); 
	   
	  driver.findElement(By.name("q")).sendKeys("Acer Aspire 3 Pentium Quad Core"); 
	   
	  driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	   
	  driver.findElement(By.xpath("(//div[contains(text(),'Laptop')])[1]")).click(); 
	   
	  Set<String> windows = driver.getWindowHandles(); 
	   
	  Iterator<String> itr = windows.iterator(); 
	   
	  String mainWindow = itr.next(); 
	   
	  String childWindow = itr.next(); 
	   
	  driver.switchTo().window(childWindow); 
	  
	  try { 
	    
	   
	   if(driver.findElement(By.xpath("//input[@type='password']")).isDisplayed()) { 
	    
	       driver.findElement(By.xpath("(//button)[2]")).click(); 
	   
	      } 
	   
	  }catch(Throwable t) { 
	   
	   System.out.println("Lightbox not displayed"); 
	   
	  }
	   
	  if(driver.getTitle().contains("Acer Aspire")) { 
	   
	   driver.findElement(By.xpath("(//button)[2]")).click(); 
	  
	  } 
	  
	  System.out.println("Item added to bag sucessfully"); 
}
}
