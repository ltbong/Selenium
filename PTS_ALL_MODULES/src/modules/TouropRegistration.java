package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TouropRegistration {
   
  WebDriver driver;
  
  @BeforeMethod
  public void login() {
	  System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	  driver = new ChromeDriver();
      driver.get("https://raviteja/PtsWeb/admin/signin");
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("Design_20");
	  driver.findElement(By.id("btn-signIn")).click();
	  driver.manage().window().maximize();
	  
	  
	 
  }
  @Test(invocationCount=1,threadPoolSize=2,successPercentage=98)
  public void addTouroperator (){
	  driver.findElement(By.xpath("html/body/div[1]/ul/li[2]/a")).click();
	  driver.findElement(By.className("glyphicon-plus")).click();
	  driver.findElement(By.id("name")).sendKeys("Kumar");
	  driver.findElement(By.id("travelagency")).sendKeys("SVR Travels");
	  driver.findElement(By.id("registrationnumber")).sendKeys("54TYCD");
	  driver.findElement(By.id("mobilenumber")).sendKeys("90224658587");
	  driver.findElement(By.id("phonenumber")).sendKeys("5897885552");
	  driver.findElement(By.id("address")).sendKeys("Sikkim");
	  driver.findElement(By.id("email")).sendKeys("ravitejaseetha@gmail.com");
	  driver.findElement(By.id("website")).sendKeys("http://sntonline.in");
	  driver.findElement(By.id("locationname")).sendKeys("East Sikkim");
	  Select grade = new Select(driver.findElement(By.id("grade")));
	  grade.selectByIndex(6);
	  driver.findElement(By.id("renewedupto")).click();
	  driver.findElement(By.xpath("html/body/div[4]/div[1]/table/tbody/tr[4]/td[5]")).click();
	  driver.findElement(By.id("remarks")).sendKeys("No Remarks");
	  driver.findElement(By.xpath(".//*[@id='tourOperator']/div[13]/div/input[1]")).click();
  }
  @AfterTest
  public void logout () throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.className("glyphicon-user")).click();
	  driver.findElement(By.className("glyphicon-log-out")).click();
  }
}
