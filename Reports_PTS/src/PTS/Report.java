package PTS;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Report 
{
	WebDriver driver;
	
	@BeforeTest
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	}

	@Test
	public void loginPage() 
	{
		
	    String baseUrl = "http://www.sikkimilp.in/admin/signin";
	    driver.get(baseUrl);
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.id("password")).sendKeys("Design_20");
	    driver.findElement(By.id("btn-signIn")).click();
	    driver.findElement(By.className("dropdown-toggle")).click();
	    driver.findElement(By.xpath("html/body/div[1]/ul/li[3]/ul/li[1]/a")).click();
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_FromDatePicker_dateInput")).sendKeys("01-11-2014");
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ToDatePicker_dateInput")).sendKeys("21-11-2014");
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SearchButton_input")).click();
	}
	
	@Test
	public void monthlyReport ()
	{
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("html/body/div[1]/ul/li[3]/ul/li[3]/a")).click();
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_MonthYearPicker_dateInput")).sendKeys("November 2014");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_SearchButton_input")).click();
	}
    
	@Test
    public void yearlyReport () 
    {
    	driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("html/body/div[1]/ul/li[3]/ul/li[5]/a")).click();
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_MonthYearPicker_dateInput")).sendKeys("2014");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_CountyNameComboBox_Input")).sendKeys("West Indies");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_SearchButton_input")).click();
    }
    
	@AfterMethod
    public void afterReport () throws InterruptedException 
    {
    	
    	//Thread.sleep(8000);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
    	
    }
    
	@AfterTest
    public void logout () 
    {
    	driver.findElement(By.className("glyphicon-user")).click();
    	driver.findElement(By.className("glyphicon-log-out")).click();
    	driver.close();
    }
    
}


