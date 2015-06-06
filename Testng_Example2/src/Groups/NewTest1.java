package Groups;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;


/*public class NewTest1 {
	  @BeforeGroups({"secondGroup","firstGroup"})
	    public void executeBeforeGroup(){
	        System.out.println("executeBefore both Group");
	    }
	    @AfterGroups("firstGroup")
	    public void executeAfterGroup(){
	        System.out.println("executeAfter firstGroup");
	    }
	    
	    @Test(groups="firstGroup")
	    public void method1(){
	        System.out.println("method1");
	    }
	    @Test(groups="firstGroup")
	    public void method2(){
	        System.out.println("method2");
	    }
	    @Test(groups="secondGroup")
	    public void method3(){
	        System.out.println("method3");
	    }
	    @Test(groups="secondGroup")
	    public void method4(){
	        System.out.println("method4");
	    }
	    @Test(dependsOnGroups={"secondGroup","firstGroup"})
	    public void method5(){
	        System.out.println("if both group passed then method5 test will execute");
	    }
}*/
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {

    WebDriver driver;
	
	@BeforeTest
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
 @Test
 public void login () 
 {
	 String baseUrl = "https://raviteja/ptsweb";
     driver.get(baseUrl);
     driver.manage().window().maximize();
     driver.findElement(By.id("button-start")).click();
     
 }
 @Test
 public void register () throws InterruptedException
 {
	 driver.findElement(By.className("glyphicon-calendar")).click();
	 List<WebElement> dates = driver.findElement(By.className("table-condensed")).findElements(By.tagName("td"));
	 for (WebElement report : dates)
	 {
		 if (report.getText().equals("22"))
		 {
			 report.click();
			 break;
		 }
		 
	 }
	 String[] names = {"Ravi","Bharath","Nageshwar"};
     int i;
     for (i=0;i<names.length;i++)
     {
    	 driver.findElement(By.id("username")).sendKeys(names[i]);
     
     driver.findElement(By.xpath(".//*[@id='dobDatePicker']/span/span")).click();
     driver.findElement(By.xpath("html/body/div[9]/div[3]/table/tbody/tr/td/span[3]")).click();
     driver.findElement(By.xpath("html/body/div[9]/div[2]/table/tbody/tr/td/span[3]")).click();
     driver.findElement(By.xpath("html/body/div[9]/div[1]/table/tbody/tr[1]/td[5]")).click();
     Select nationality = new Select(driver.findElement(By.id("Nationality")));
     nationality.selectByIndex(10);
     driver.findElement(By.id("state")).sendKeys("Jamaica");
     driver.findElement(By.id("PhoneNo")).sendKeys("95735579999");
     driver.findElement(By.id("Address")).sendKeys("jamaica");
     driver.findElement(By.id("Email")).sendKeys("ravitejaseetha@gmail.com");
     driver.findElement(By.id("PassportNumber")).sendKeys("AP-938"+i);
     driver.findElement(By.xpath(".//*[@id='passportValidityDatepicker']/span/span")).click();
     driver.findElement(By.xpath("html/body/div[9]/div[3]/table/tbody/tr/td/span[8]")).click();
     driver.findElement(By.xpath("html/body/div[9]/div[2]/table/tbody/tr/td/span[8]")).click();
     driver.findElement(By.xpath("html/body/div[9]/div[1]/table/tbody/tr[3]/td[7]")).click();
     driver.findElement(By.id("VisaNumber")).sendKeys("V1844"+i);
     driver.findElement(By.xpath(".//*[@id='visaValidityDatepicker']/span/span")).click();
     driver.findElement(By.xpath("html/body/div[9]/div[3]/table/tbody/tr/td/span[8]")).click();
     driver.findElement(By.xpath("html/body/div[9]/div[2]/table/tbody/tr/td/span[8]")).click();
     driver.findElement(By.xpath("html/body/div[9]/div[1]/table/tbody/tr[4]/td[3]")).click();
     Select visaissued = new Select(driver.findElement(By.id("visaissuedin")));
     visaissued.selectByIndex(10);
     driver.findElement(By.id("purposeofvisit")).sendKeys("Test");
     driver.findElement(By.xpath(".//*[@id='registerForm']/div/div[2]/div/div[2]/div[2]/div[7]/div/div[1]/button")).click();
     //driver.findElement(By.id("registerForm")).clear();
     driver.findElement(By.id("Email")).clear();
     driver.findElement(By.id("username")).clear();
     driver.findElement(By.id("PassportNumber")).clear();
     driver.findElement(By.id("VisaNumber")).clear();
     driver.findElement(By.id("PhoneNo")).clear();
     }
     
  }
 @AfterTest
 public void save () throws InterruptedException
 {
	 driver.findElement(By.xpath(".//*[@id='registerForm']/div/div[1]/div[2]/div/div/button")).click();
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

