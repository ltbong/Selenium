package example;



import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class NewTestCaptcha {
  @Test(enabled=false)
  public void slider(){
  WebDriver driver;
  System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("http://jqueryui.com/resources/demos/slider/default.html");
  driver.manage().window().maximize();
  WebElement slider = driver.findElement(By.xpath("html/body/div[1]/span"));
  Actions action = new Actions(driver);
  action.dragAndDropBy(slider, 500, 50).perform();
  }
  @Test
  public void resizable() throws IOException, InterruptedException{
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
	  driver.manage().window().maximize();
	  WebElement resize = driver.findElement(By.xpath("html/body/div[1]/div[3]"));
      Actions act = new Actions(driver);
      act.dragAndDropBy(resize, 400, 200).perform();
      Thread.sleep(3000);
      
      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      //The below method will save the screen shot in d drive with name "screenshot.png"
      FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
      
  }
  
}

