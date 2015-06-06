package hello;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTestParallel {
	WebDriver driver;
  @Parameters("browser")	
  @Test
  public void testCaseOne(String browser) throws InterruptedException {
	if(browser.equals("Chrome")){
		
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://raviteja/PtsWeb/Ilp/Register");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.findElement(By.id("Nationality")).click();
	  Thread.sleep(2000);
	  Actions act =new Actions(driver);
	  act.sendKeys(Keys.chord(Keys.DOWN,Keys.TAB)).perform();
	  Thread.sleep(2000);
	  act.sendKeys(Keys.chord(Keys.TAB,Keys.ENTER)).perform();
	  Thread.sleep(2000);
	  //Alert alert = driver.switchTo().alert();
	  //alert.accept();
	  String s = (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;");

	  System.out.println("Browser name : " + s);
	  
	}
	else if (browser.equals("IE")){
		driver = new ChromeDriver();
		driver.get("http://Yahoo.com");
		System.out.println("Not found");
		
	}
  }
  
}
