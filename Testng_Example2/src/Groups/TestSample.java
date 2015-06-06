package Groups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSample {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
	  String st = driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[3]/center/input[1]")).getCssValue("font-family");
	  String s1 = driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[3]/center/input[1]")).getCssValue("background-color");
	  System.out.println("Back ground color :"+s1);
	  System.out.println("Font size of the button"+st);
	  driver.close();
	  
			  }
}
