

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Register {

    WebDriver driver;
	
	@BeforeTest
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
 @Test
 public void login () 
 {
	 String baseUrl = "https://raviteja/ptsweb";
     driver.get(baseUrl);
     driver.findElement(By.id("button-start")).click();
 }
 @AfterTest
 public void register ()
 {
	 driver.findElement(By.className("glyphicon-calendar")).click();
	 List<WebElement> dates = driver.findElement(By.className(" table-condensed")).findElements(By.tagName("td"));
	 for (WebElement report : dates){
		 if (report.getText().equals("22")){
			 report.click();
			 break;
		 }
		 
	 }
 }
}
