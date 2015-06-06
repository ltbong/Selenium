package modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllReports 
{
	WebDriver driver;
	
	@BeforeTest
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	}

	@Test(priority=1)
	public void loginPage() throws InterruptedException 
	{
		
	    String baseUrl = "https://raviteja/ptsweb/admin/signin";
	    driver.get(baseUrl);
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.id("password")).sendKeys("Design_20");
	    driver.findElement(By.id("btn-signIn")).click();
	    Thread.sleep(2000);
	}
	@Test(priority=2)
	public void rapIssuance () throws InterruptedException 
	{
		
	    driver.findElement(By.className("dropdown-toggle")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("html/body/div[1]/ul/li[4]/ul/li[1]/a")).click();
	   
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_FromDatePicker_dateInput")).sendKeys("01-11-2014");
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ToDatePicker_dateInput")).sendKeys("21-11-2014");
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SearchButton_input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("ContentPlaceHolder1_ReportViewer1_ReportToolbar_ExportGr_FormatList_DropDownList")).sendKeys("Acrobat (PDF) file");
	    driver.findElement(By.id("ContentPlaceHolder1_ReportViewer1_ReportToolbar_ExportGr_Export")).click();
	}
	@Test(priority=3)
	public void dailyVisiting () throws InterruptedException 
	{
		
	    driver.findElement(By.className("dropdown-toggle")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("html/body/div[1]/ul/li[4]/ul/li[3]/a")).click();
	   
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_FromDatePicker_dateInput")).sendKeys("01-11-2014");
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ToDatePicker_dateInput")).sendKeys("21-11-2014");
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SearchButton_input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("ContentPlaceHolder1_ReportViewer1_ReportToolbar_ExportGr_FormatList_DropDownList")).sendKeys("Acrobat (PDF) file");
	    driver.findElement(By.id("ContentPlaceHolder1_ReportViewer1_ReportToolbar_ExportGr_Export")).click();
	}
	
	@Test(priority=4)
	public void monthlyReport () throws InterruptedException
	{
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("html/body/div[1]/ul/li[4]/ul/li[5]/a")).click();
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_MonthYearPicker_dateInput")).sendKeys("November 2014");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_SearchButton_input")).click();
		Thread.sleep(2000);
	    driver.findElement(By.id("ContentPlaceHolder1_ReportViewer1_ReportToolbar_ExportGr_FormatList_DropDownList")).sendKeys("Acrobat (PDF) file");
	    driver.findElement(By.id("ContentPlaceHolder1_ReportViewer1_ReportToolbar_ExportGr_Export")).click();

	}
    
	@Test(priority=5)
    public void yearlyReport () throws InterruptedException 
    {
    	driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("html/body/div[1]/ul/li[4]/ul/li[7]/a")).click();
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_MonthYearPicker_dateInput")).sendKeys("2014");
		//driver.findElement(By.id("ctl00_ContentPlaceHolder1_CountyNameComboBox_Input")).sendKeys("West Indies");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_SearchButton_input")).click();
		Thread.sleep(2000);
	    driver.findElement(By.id("ContentPlaceHolder1_ReportViewer1_ReportToolbar_ExportGr_FormatList_DropDownList")).sendKeys("Acrobat (PDF) file");
	    driver.findElement(By.id("ContentPlaceHolder1_ReportViewer1_ReportToolbar_ExportGr_Export")).click();

    }
    
	@AfterMethod
    public void afterReport () throws InterruptedException 
    {
    	
    	Thread.sleep(2000);
    	
    	
    }
    
	/*@AfterTest
    public void logout () 
    {
    	driver.findElement(By.className("glyphicon-user")).click();
    	driver.findElement(By.className("glyphicon-log-out")).click();
    	driver.close();
    }*/
    
}