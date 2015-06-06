package modules;



import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TouristRegistration {

    WebDriver driver;
	
	@BeforeTest
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\Raviteja\\Downloads\\selenium-java-2.45.0\\selenium-2.45.0\\IEDriverServer_x64_2.45.0\\IEDriverServer.exe");
	    driver = new ChromeDriver();
	}
 @Test(priority=1)
 public void retrieveURL () 
 {
	 String baseUrl = "https://raviteja/ptsweb";
     driver.get(baseUrl);
     driver.manage().window().maximize();
     //driver.findElement(By.id("button-start")).click();
     driver.findElement(By.id("userName")).sendKeys("ramesht@gmail.com");
     driver.findElement(By.id("password")).sendKeys("Design_20");
     driver.findElement(By.id("login")).click();
     
 }
 @Test(threadPoolSize=4,priority=2)
 public void addTourists () throws InterruptedException
 {
	 driver.findElement(By.className("glyphicon-calendar")).click();
	 Thread.sleep(3000);
	 //driver.findElement(By.xpath("//td[contains(text(),'30')]")).click();
	 driver.findElement(By.className("today")).click();
	 Thread.sleep(2000);
	/* List<WebElement> dates = driver.findElement(By.className("table-condensed")).findElements(By.tagName("td"));
	 for (WebElement report : dates)
	 {
		 if (report.getText().equals("27"))
		 {
			 
			 report.click();
			 Thread.sleep(2000);
			 break;
		 }
		 
	 }*/
	 String[] names = {"Raviteja"};
     int i;
     for (i=0;i<names.length;i++)
     {
    	 driver.findElement(By.id("username")).sendKeys(names[i]);
     //driver.findElement()
     driver.findElement(By.id("DateOfBirth")).click();
     
     driver.findElement(By.xpath("//span[contains(text(),'2010')]")).click();
     driver.findElement(By.xpath("//span[contains(text(),'Jan')]")).click();
     driver.findElement(By.xpath("//td[contains(text(),'2"+i+"')]")).click();
     //Select nationality = new Select(driver.findElement(By.id("Nationality")));
     //nationality.selectByIndex(10);
     //driver.findElement(By.name("Nationality")).click();
     //Thread.sleep(2000);
     /*Actions act = new Actions(driver);
     act.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN)).perform();
     act.sendKeys(Keys.chord(Keys.TAB)).perform();*/
     Select nationality = new Select(driver.findElement(By.id("Nationality")));
     //nationality.selectByIndex(6);
     nationality.selectByVisibleText("Srilanka");
     //Thread.sleep(2000);
     String message = driver.findElement(By.className("modal-body")).getText();
     String mess="nationality";
     WebElement ele = driver.findElement(By.xpath("//button[@data-dismiss='modal']"));
     if(ele.isDisplayed()){
     Assert.assertTrue(message.contains(mess),"PROBLEM");
     driver.findElement(By.xpath("//button[@data-dismiss='modal']")).click();
     System.out.println(message);
     System.out.println("Please enter another index of nationality");
     Scanner inp = new Scanner(System.in);
     String country = inp.nextLine();
     nationality.selectByVisibleText(country);
     Actions act = new Actions(driver);
     act.sendKeys(Keys.chord(Keys.TAB)).perform();
     }
     //String mainPage = driver.getWindowHandle();
     //Thread.sleep(3000);
     // get the address of main page
     //Alert alt = driver.switchTo().alert();  //this will switch the control to alert pop-up 
     //alt.accept(); // to click on OK or to accept the alert pop-up
     //alt.dismiss(); // to click on CANCEL
     //driver.switchTo().window(mainPage); // switch control to main page
     //System.out.println("No of countries in drop down : " +(nationality.getOptions().size()-1));
     driver.findElement(By.id("state")).sendKeys("Jamaica");
     driver.findElement(By.id("PhoneNo")).sendKeys("95735579999");
     driver.findElement(By.id("Address")).sendKeys("jamaica");
     driver.findElement(By.id("Email")).sendKeys("ravitejaseetha@gmail.com");
     driver.findElement(By.id("PassportNumber")).sendKeys("559t"+i);
     driver.findElement(By.xpath(".//*[@id='passportValidityDatepicker']/span/span")).click();
     driver.findElement(By.xpath("//span[contains(text(),'2018')]")).click();
     driver.findElement(By.xpath("//span[contains(text(),'Jan')]")).click();
     driver.findElement(By.xpath("//td[contains(text(),'2"+i+"')]")).click();
     driver.findElement(By.id("VisaNumber")).sendKeys("V117"+i);
     Select visatype = new Select (driver.findElement(By.id("visatype")));
     visatype.selectByIndex(3);
     driver.findElement(By.xpath(".//*[@id='visaValidityDatepicker']/span/span")).click();
     driver.findElement(By.xpath("//span[contains(text(),'2017')]")).click();
     driver.findElement(By.xpath("//span[contains(text(),'Jan')]")).click();
     driver.findElement(By.xpath("//td[contains(text(),'2"+i+"')]")).click();
     driver.findElement(By.id("visaissuedin")).sendKeys("Jamaica");
     driver.findElement(By.id("purposeofvisit")).sendKeys("Test");
     //driver.findElement(By.id("input-id")).sendKeys("C:\\Users\\Raviteja\\Desktop\\41999_honda_passport-pic-65301-tmb.png");
     driver.findElement(By.id("btnCapture")).click();
     Thread.sleep(5000);
     driver.findElement(By.id("btn2")).click();
     driver.findElement(By.id("saveImage")).click();
     Thread.sleep(1000);
     /*Alert alert = driver.switchTo().alert();
     alert.accept();*/
     driver.findElement(By.xpath("//button[@value='Add to group']")).click();
     driver.findElement(By.id("Email")).clear();
     driver.findElement(By.id("username")).clear();
     driver.findElement(By.id("PassportNumber")).clear();
     driver.findElement(By.id("VisaNumber")).clear();
     driver.findElement(By.id("PhoneNo")).clear();
     } 
  }
 @Test(priority=3)
 public void saveRAP () throws InterruptedException
 {
	 //driver.findElement(By.xpath(".//*[@id='registerForm']/div/div[1]/div[2]/div/div/button")).click();
	 Thread.sleep(8000);
	 String message = driver.findElement(By.className("panel-heading")).getText();
	 if (message.equals("RAP Report")){
		 System.out.println("Sucess");
	 }
	 else{
		 System.out.println("Failure");
	 }
 }

}