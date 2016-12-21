package guru.gittestframe;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws AWTException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mstemp001\\workspace\\HybridDemo\\ChromeDriver\\chromedriver.exe"); 
		 WebDriver driver=new ChromeDriver();
	                
	  // Maximize the window
	  driver.manage().window().maximize();
	 
	  // Open facebook
	  driver.get("https://cs52.salesforce.com/5005B000000pYyX/e?retURL=%2F5005B000000pYyX&_CONFIRMATIONTOKEN=VmpFPSxNakF4TmkweE1pMHlORlF3TmpveU1Eb3hOeTQwTXpsYSxMc3hQVnphb2xzTmNIeEk0XzF4VWo3LE5EUmpNakUx&common.udd.actions.ActionsUtilORIG_URI=%2F5005B000000pYyX%2Fe");
	 
	  // Enter Username
	  driver.findElement(By.id("username")).sendKeys("vennila@mstsolutions.com.fullcopy");
	 
	  // Enter password
	  driver.findElement(By.id("password")).sendKeys("metasoft2");
	 
	  // Create object of Robot class
	  Robot r=new Robot();
	 
	   // Press Enter
	   r.keyPress(KeyEvent.VK_ENTER);
    }
}
