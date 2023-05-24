package edureka.project;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.testng.Assert.assertEquals;

public class App 
{
    public static void main( String[] args )
    {
    	 System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");   	
    	 ChromeOptions chromeOptions = new ChromeOptions(); 	 
    	 chromeOptions.addArguments("--no-sandbox");
    	 chromeOptions.addArguments("--headless"); //should be enabled for Jenkins
    	 chromeOptions.addArguments("--disable-dev-shm-usage"); //should be enabled for Jenkins
    	 chromeOptions.addArguments("--window-size=1920x1080"); //should be enabled for Jenkins 	 
    	 WebDriver driver = new ChromeDriver(chromeOptions);
    	 System.out.println("Hi,This is the test case of my Certification Project");
         driver.get("http://3.135.225.0:32732/index.php");
    	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	 driver.findElement(By.id("About Us")).click();
    	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	 String test= driver.findElement(By.id("PID-ab2-pg")).getText();
    	 assertEquals(test, "This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
    	 System.out.println("Test Succeeded!!");driver.quit();	 
    	 driver.quit();
    	
    }
}
