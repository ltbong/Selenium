package mobile;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SikkimHome {
	AppiumDriver driver;
  @Test
  public void f() throws MalformedURLException, InterruptedException {
	  //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  File classpathRoot = new File(System.getProperty("user.dir"));
	  File appDir = new File(classpathRoot,"Application");
	  File app = new File(appDir,"SikkimTourismVersion1.2-Aligned.apk");
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  //capabilities.setCapability("deviceName", "5554:Mtourism");
	  capabilities.setCapability("deviceName", "ST21i2");
	  capabilities.setCapability("platformVersion", "4.0.4");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("device", "Android");
	  capabilities.setCapability("app", app.getAbsolutePath());
	  capabilities.setCapability("appPackage", "com.mTourism");
	  //capabilities.setCapability("appActivity", "mtourism.droid.MainActivity");
	  driver = new AppiumDriver(new URL("http://127.0.0.1:4725/wd/hub/"), capabilities);
	  driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Places of Interest']")).click();
	  Thread.sleep(7000);
	  driver.swipe(0, 1100, 0, 800, 0);
	  WebDriverWait myDynamicElement = new WebDriverWait(driver, 15);
	  myDynamicElement.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Explore']")));
	  driver.swipe(0, 1100, 0, 600, 0);
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Baba Harbhajan Singh Temple']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Attractions']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//android.widget.TextView[@text='Accommodation']")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("android:id/home")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//android.widget.TextView[@text='Changu or Tsomgo Lake']")).click();
      Thread.sleep(3000);
      driver.findElement(By.id("android:id/home")).click();
      
  }


}
