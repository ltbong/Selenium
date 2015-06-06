package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fro {
	WebDriver driver;
  
  @Test(priority=1)
  public void loginFro()  {
          
	  System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://raviteja/PtsWeb/fro/signin");
	  
	  driver.findElement(By.id("username")).sendKeys("fro");
	  driver.findElement(By.id("password")).sendKeys("123456");
	  driver.findElement(By.id("btn-signIn")).click();
	  driver.manage().window().maximize();  
  }
  @Test(priority=2)
  public void touristReport () {
	  driver.findElement(By.xpath("html/body/div[2]/div/div[2]/table/tbody[1]/tr[1]/td[1]/a[1]")).click();
	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_FromDatePicker_popupButton")).click();
	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_FromDatePicker_dateInput")).sendKeys("01-10-2014");
	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_ToDatePicker_popupButton")).click();
	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_ToDatePicker_dateInput")).sendKeys("31-12-2014");
	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_SearchButton_input")).click();
	  driver.findElement(By.id("ContentPlaceHolder1_ReportViewer1_ReportToolbar_ExportGr_FormatList_DropDownList")).sendKeys("Acrobat (PDF) file");
	  driver.findElement(By.id("ContentPlaceHolder1_ReportViewer1_ReportToolbar_ExportGr_Export")).click();
	  driver.findElement(By.xpath("html/body/div[1]/ul/li[1]/a")).click();
  }
  @Test(priority=3)
  public void notouristReport () throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("html/body/div[2]/div/div[2]/table/tbody[1]/tr[2]/td[1]/a[2]")).click();
	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_FromDatePicker_popupButton")).click();
	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_FromDatePicker_dateInput")).sendKeys("01-10-2014");
	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_ToDatePicker_popupButton")).click();
	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_ToDatePicker_dateInput")).sendKeys("31-12-2014");
	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_SearchButton_input")).click();
	  driver.findElement(By.id("ContentPlaceHolder1_ReportViewer1_ReportToolbar_ExportGr_FormatList_DropDownList")).sendKeys("Acrobat (PDF) file");
	  driver.findElement(By.id("ContentPlaceHolder1_ReportViewer1_ReportToolbar_ExportGr_Export")).click();
	  driver.findElement(By.xpath("html/body/div[1]/ul/li[1]/a")).click();
  }
  @Test(priority=4)
  public void unreportedHotels () {
	  driver.findElement(By.xpath("html/body/div[1]/ul/li[2]/a")).click();
	  driver.findElement(By.id("dateinput")).click();
	  driver.findElement(By.xpath("html/body/div[4]/div[1]/table/tbody/tr[4]/td[6]")).click();
	  driver.findElement(By.className("btn-primary")).click();
	 
  }
}
