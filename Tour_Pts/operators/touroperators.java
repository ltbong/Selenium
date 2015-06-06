package operators;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;
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
import org.openqa.selenium.WebDriver;
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
}
@Test
public void searchGoogle() throws Exception
{
	System.out.println("im in searchgoogle");
	FileInputStream  fi = new FileInputStream("C:\\Users\\ravitejaseetha\\Desktop\\DETAILS OF REGISTERED TRAVEL AGENT OF SIKKIM.xls");
Workbook w = Workbook.getWorkbook(fi);
s = w.getSheet(0);
for(int row=4; row <=s.getRows();row++)
{
String name = s.getCell(1, row).getContents();
//System.out.println("Username "+username);
driver.get("https://raviteja/PtsWeb/touroperator/Create");
driver.findElement(By.id("name")).sendKeys(name);
String travelagency= s.getCell(2, row).getContents();
//System.out.println("Password "+password);
driver.findElement(By.name("ctl00$MPH$txtPassword")).sendKeys(travelagency);

}
}
@AfterTest
public void tearDown()
{
	//driver.findElement(By.linkText("Logout")).click();

}
}