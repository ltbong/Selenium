package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.io.FileInputStream;




//import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;




//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Datadriven{
Sheet s;
WebDriver driver;
@BeforeMethod
public void setUp()
{
driver = new FirefoxDriver();
System.out.println("im in setup");
//driver.get("http:\\www.gmail.com");
driver.get("https://raviteja/PtsWeb/touroperator/Create");
}
@Test
public void searchGoogle() throws Exception
{
	System.out.println("im in searchgoogle");
	FileInputStream  fi = new FileInputStream("C:\\Users\\ravitejaseetha\\Desktop\\tourist1.xls");
Workbook w = Workbook.getWorkbook(fi);
s = w.getSheet(0);
for(int row=1; row <=s.getRows();row++)
{
String name = s.getCell(0, row).getContents();
driver.findElement(By.id("name")).sendKeys(name);
String TravelAgency= s.getCell(1, row).getContents();
WebElement Tr = driver.findElement(By.id("travelagency"));
Tr.sendKeys(TravelAgency);
Tr.sendKeys(Keys.TAB);

String registrationnumber= s.getCell(2, row).getContents();
driver.findElement(By.id("registrationnumber")).sendKeys(registrationnumber);
String mobilenumber= s.getCell(5, row).getContents();
driver.findElement(By.id("mobilenumber")).sendKeys(mobilenumber);
String Phonenumber = s.getCell(6,row).getContents();
driver.findElement(By.id("phonenumber")).sendKeys(Phonenumber);
String address= s.getCell(9, row).getContents();
driver.findElement(By.id("address")).sendKeys(address);
String Email= s.getCell(3, row).getContents();
driver.findElement(By.id("email")).sendKeys(Email);
String Website = s.getCell(4,row).getContents();
driver.findElement(By.id("website")).sendKeys(Website);
driver.findElement(By.id("locationname")).sendKeys("East Sikkim");
//String Grade = s.getCell(3,row).getContents();
//driver.findElement(By.id("grade")).sendKeys(Grade);
driver.findElement(By.id("renewedupto")).clear();
Thread.sleep(1000);
String Date = s.getCell(8,row).getContents().trim();
/*String[] Flds = Date.split("/"); 
String year=Flds[2];
System.out.println(year);
String date=Flds[0];
String month=Flds[1];
String renew_upto=month+"/"+date+"/"+year;*/
driver.findElement(By.id("renewedupto")).sendKeys(Date);
Thread.sleep(1000);
String Remarks = s.getCell(7,row).getContents();
driver.findElement(By.id("remarks")).sendKeys(Remarks);
driver.findElement(By.xpath(".//*[@id='tourOperator']/div[13]/div/input[1]")).click();
Thread.sleep(1000);
driver.get("https://raviteja/PtsWeb/touroperator/Create");


}
}
@AfterTest
public void tearDown()
{
	//driver.findElement(By.linkText("Logout")).click();

}
}