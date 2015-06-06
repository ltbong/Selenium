package automationFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;



import java.util.Iterator;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPAge;

public class PageObjecPts {
  //public static WebDriver driver = null;
	WebDriver driver;
	@Test(dataProvider="dataInput")
  public void registerTourist(String name,String nationalty,String state,String mobile,String email,String passport,String image,String visa) throws InterruptedException {
	  RegistrationPAge ra = new RegistrationPAge();
	  driver = new FirefoxDriver();
      WebDriverWait wait = new WebDriverWait(driver,10);
      
      driver.navigate().to("https://raviteja/ptsweb");
      
      driver.manage().window().maximize();
      
      wait.until(ExpectedConditions.visibilityOf(HomePage.get_started(driver)));
      /*driver.findElement(By.id("userName")).sendKeys("ramesht@gmail.com");
      driver.findElement(By.id("password")).sendKeys("Design_20");
      driver.findElement(By.id("login")).click();*/
      HomePage.get_started(driver).click();
      //wait.until(ExpectedConditions.textToBePresentInElement(RegistrationPAge.select_Nationality(driver), "Select country..."));
      Thread.sleep(3000);
      RegistrationPAge.datepicker_Arrival(driver).click();
      //ra.arrival.click();
 
      Thread.sleep(1000);
      driver.findElement(By.className("today")).click();
      //RegistrationPAge.datepicker_Arrivaldate(driver).click();
      
      RegistrationPAge.txtbox_Name(driver).sendKeys(name);
      
      Select gender = new Select(RegistrationPAge.select_Gender(driver));
      
      gender.selectByIndex(0);
      
      RegistrationPAge.datepicker_Dateofbirth(driver).click();
      
      Thread.sleep(1000);
      
      RegistrationPAge.datepicker_DateofbirthYear(driver).click();
      
      RegistrationPAge.datepicker_Dateofbirthmonth(driver).click();
      
      RegistrationPAge.datepicker_Dateofbirthdate(driver).click();
      Select nationality = new Select(RegistrationPAge.select_Nationality(driver));
      switch(nationalty){
      case "Nepal" : nationality.selectByIndex(8);
      break;
      case "Tibetan refugee" : nationality.selectByIndex(13);
      break;
      case "South Africa" : nationality.selectByIndex(10);
      break;
      case "Srilanka" : nationality.selectByIndex(11);
      break;
      }
      RegistrationPAge.txtbox_State(driver).sendKeys(state);
      
      RegistrationPAge.txtbox_Mobile(driver).sendKeys(mobile);
      
      RegistrationPAge.txtbox_Email(driver).sendKeys(email);
      
      RegistrationPAge.txtbox_Passport(driver).sendKeys(passport);
      
      RegistrationPAge.datepicker_Passportvalidity(driver).click();
      Thread.sleep(1000);
      RegistrationPAge.datepicker_Passportyear(driver).click();
      
      RegistrationPAge.datepicker_Passportmonth(driver).click();
      
      RegistrationPAge.datepicker_Passportdate(driver).click();
      
      if(RegistrationPAge.txtbox_Visanumber(driver).isEnabled()){
    	  
    	  RegistrationPAge.txtbox_Visanumber(driver).sendKeys(visa);
    	  Select visatype = new Select(RegistrationPAge.select_Visatype(driver));
    	  visatype.selectByIndex(2);
    	  RegistrationPAge.datepicker_Visavalidity(driver).click();
    	  Thread.sleep(1000);
          RegistrationPAge.datepicker_Passportyear(driver).click();
          RegistrationPAge.datepicker_Passportmonth(driver).click();
          RegistrationPAge.datepicker_Passportdate(driver).click();
          RegistrationPAge.txtbox_visaissued(driver).sendKeys(nationalty);
      }  
      RegistrationPAge.txtbox_Purpose(driver).sendKeys("Tourism");
      
      //RegistrationPAge.input_Image(driver).sendKeys(image);
      
      RegistrationPAge.capture_Image(driver).click();
      
      Thread.sleep(5000);
      
      RegistrationPAge.button_Snapshot(driver).click();
      
      RegistrationPAge.button_Savesnapshot(driver).click();
      
      RegistrationPAge.button_Add(driver).click();
      
      //RegistrationPAge.button_Save(driver).click();
  }
	@DataProvider(name="dataInput")
	public static Iterator inputData() throws BiffException, IOException{
		ArrayList myData = new ArrayList();
		FileInputStream fs = new FileInputStream("C:\\Users\\Raviteja\\Desktop\\Tourist.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");
		for(int row = 1;row<sh.getRows();row++){
			String name = sh.getCell(0, row).getContents();
			String nationalty = sh.getCell(1, row).getContents();
			String state = sh.getCell(2, row).getContents();
			String mobile = sh.getCell(3, row).getContents();
			String email = sh.getCell(4, row).getContents();
			String passport = sh.getCell(5, row).getContents();
			String image = sh.getCell(6, row).getContents();
			String visa = sh.getCell(7, row).getContents();
			myData.add(new Object[]{name,nationalty,state,mobile,email,passport,image,visa});
		}
		return  myData.iterator();
	}
}
