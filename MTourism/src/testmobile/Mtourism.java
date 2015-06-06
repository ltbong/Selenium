package testmobile;

//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.awt.List;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class Mtourism {

public static void main(String[] args) throws MalformedURLException, InterruptedException {
// TODO Auto-generated method stub
	AppiumDriver driver;

 //File appDir = new File("C:\\Users\\Raviteja\\AppData\\Local\\Android\\sdk\\platform-tools");
 File classpathRoot = new File(System.getProperty("user.dir"));
 File appDir = new File (classpathRoot,"Application");
 File app = new File(appDir, "SikkimTourismVersion1.2-Aligned.apk");
 DesiredCapabilities capabilities = new DesiredCapabilities();
 //capabilities.setCapability("deviceName", "5554:Mtourism");
 capabilities.setCapability("deviceName", "Redmi");
 //capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
 capabilities.setCapability("platformVersion", "4.3.1");
 capabilities.setCapability("platformName", "Android");
 capabilities.setCapability("device", "Android");
 capabilities.setCapability("app", app.getAbsolutePath());
 Thread.sleep(5000);
 capabilities.setCapability("appPackage", "com.mTourism");
 Thread.sleep(5000);
 //capabilities.setCapability("appActivity", "mtourism.droid.MainActivity");
 // Thread.sleep(5000);
  //capabilities.setCapability("appPackage", "com.whatsapp");
 //capabilities.setCapability("appActivity", "com.whatsapp.Conversations");
 //capabilities.setCapability("appWaitActivity", ".MainActivity");
 driver=new AppiumDriver(new URL("http://127.0.0.1:4725/wd/hub/"),capabilities);
 driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
 Thread.sleep(9000);

 
 driver.findElement(By.id("android:id/up")).click();
 //driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
 driver.findElement(By.xpath("//android.widget.TextView[@text='About Sikkim']")).click();
// driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
 driver.findElement(By.xpath("//android.widget.TextView[@text='History']")).click();
 //driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Sub Divisions']")).click();
 //driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
 driver.findElement(By.id("android:id/up")).click();
 //Thread.sleep(3000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Transportation']")).click();
 //Thread.sleep(5000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Railways']")).click();
 //Thread.sleep(5000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Roadways']")).click();
 //Thread.sleep(5000);
 driver.findElement(By.xpath("//android.widget.TextView[@text=' Heli Service']")).click();
 driver.findElement(By.id("android:id/up")).click();
 //Thread.sleep(5000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Home']")).click();
 Thread.sleep(5000);
 driver.swipe(600, 0, 50, 0, 1000);
 Thread.sleep(8000);
 driver.swipe(50,0, 600, 0, 1000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Places of Interest']")).click();
 //Thread.sleep(5000);
 
 Thread.sleep(5000);
 driver.findElement(By.id("android:id/home")).click();
// Thread.sleep(3000);
 driver.findElement(By.id("android:id/up")).click();
 //Thread.sleep(3000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Entry Formalities']")).click();
 //Thread.sleep(3000);
 driver.findElement(By.id("android:id/up")).click();Thread.sleep(1000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Permits']")).click();
 //Thread.sleep(3000);
 driver.findElement(By.id("android:id/up")).click();Thread.sleep(1000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Popular Tour Itineraries']")).click();
 //Thread.sleep(3000);
 driver.findElement(By.id("android:id/up")).click();Thread.sleep(1000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Hotels & Restaurants']")).click();
 //Thread.sleep(3000);
 driver.findElement(By.id("android:id/up")).click();Thread.sleep(1000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Travel Agents']")).click();
 //Thread.sleep(3000);
 driver.findElement(By.id("android:id/up")).click();Thread.sleep(1000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Hot Springs']")).click();
 //Thread.sleep(3000);
 driver.findElement(By.id("android:id/up")).click();Thread.sleep(1000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='People And Culture']")).click();
 //Thread.sleep(3000);
 driver.findElement(By.id("android:id/up")).click();Thread.sleep(1000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Holy Caves']")).click();
 //Thread.sleep(3000);
 driver.findElement(By.id("android:id/up")).click();Thread.sleep(1000);
 driver.swipe(0, 1000,0 , 848, 1000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Flora And Fauna']")).click();
 //Thread.sleep(3000);
 driver.findElement(By.id("android:id/up")).click();Thread.sleep(1000);
 driver.swipe(0, 1000,0 , 848, 1000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Lakes And Mountains']")).click();
 //Thread.sleep(3000);
 driver.findElement(By.xpath("//android.widget.TextView[@text='Mountain']")).click();
 
 //driver.findElementByAndroidUIAutomator('new UiSelector().text("7")') 
//driver.t
 
}
/*public static void swipe()
{  
	
JavascriptExecutor driver = null;
JavascriptExecutor js = (JavascriptExecutor) driver;
HashMap<String, Double> swipeObject = new HashMap<String, Double>();
swipeObject.put("startX", 0.95);
swipeObject.put("startY", 0.5);
swipeObject.put("endX", 0.05);
swipeObject.put("endY", 0.5);
swipeObject.put("duration", 1.8);
js.executeScript("mobile: swipe", swipeObject);
	
 }*/


}