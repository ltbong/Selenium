package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	WebDriver driver;
	
	@Parameters("browser")	
	@Test
      // use @Parameters to pass the input through xml
    public void monthReport(@Optional("CH") String browserType) throws InterruptedException{
        System.out.println("Browser"+browserType);
        if(browserType.equals("CH")){
        	System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
        	driver= new ChromeDriver();
        	String baseUrl = "http://www.sikkimilp.in/admin/signin";
    	    driver.get(baseUrl);
    	    driver.manage().window().maximize();
    	    driver.findElement(By.id("username")).sendKeys("admin");
    	    driver.findElement(By.id("password")).sendKeys("Design_20");
    	    driver.findElement(By.id("btn-signIn")).click();
    	    Thread.sleep(3000);
    	    driver.findElement(By.className("dropdown-toggle")).click();
    	    driver.findElement(By.xpath("html/body/div[1]/ul/li[3]/ul/li[1]/a")).click();
    	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_FromDatePicker_dateInput")).sendKeys("01-12-2014");
    	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ToDatePicker_dateInput")).sendKeys("21-12-2014");
    	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_SearchButton_input")).click();
            //driver.quit();
        }else {
            //System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe"); 
            driver = new FirefoxDriver();
            String baseUrl = "http://www.sikkimilp.in/admin/signin";
    	    driver.get(baseUrl);
    	    driver.manage().window().maximize();
    	    driver.findElement(By.id("username")).sendKeys("admin");
    	    driver.findElement(By.id("password")).sendKeys("Design_20");
    	    driver.findElement(By.id("btn-signIn")).click();
    	    Thread.sleep(3000);
    	    driver.findElement(By.className("dropdown-toggle")).click();
    		driver.findElement(By.xpath("html/body/div[1]/ul/li[3]/ul/li[3]/a")).click();
    		driver.findElement(By.id("ctl00_ContentPlaceHolder1_MonthYearPicker_dateInput")).sendKeys("December 2014");
    		driver.findElement(By.id("ctl00_ContentPlaceHolder1_SearchButton_input")).click();
            //driver.quit();
        }
 }
}