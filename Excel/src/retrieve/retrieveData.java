package retrieve;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import java.io.FileInputStream;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Iterator;

//import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;




import jxl.read.biff.BiffException;



//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class retrieveData{
Sheet s;
WebDriver driver;
@BeforeMethod
public void setUp()
{
	//System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	//driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--test-type");
    driver = new ChromeDriver(options);
    driver.get("https://www.gmail.com/intl/en/mail/help/about.html");

driver.manage().window().maximize();
driver.findElement(By.className("maia-button")).click();
}

@Test(dataProvider="DataInput")
public void searchGoogle(String first,String last,String gmail,String password,String confirm,String month,String birthday,String birthyear,String gender,String mobile,String mail ) throws Exception
{

driver.findElement(By.id("FirstName")).sendKeys(first);
WebElement Tr = driver.findElement(By.id("LastName"));
Tr.sendKeys(last);
Tr.sendKeys(Keys.TAB);
driver.findElement(By.id("GmailAddress")).sendKeys(gmail);
driver.findElement(By.id("Passwd")).sendKeys(password);
driver.findElement(By.id("PasswdAgain")).sendKeys(confirm);
driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]")).click();

String[] Flds = month.split("-"); 
String year=Flds[2];
System.out.println(year);
String date=Flds[0];
String moth=Flds[1];
String renew_upto=month+"-"+date+"-"+year;
switch(month)
{
case "January" : driver.findElement(By.xpath(".//*[@id=':1']/div")).click();
 break;
case "February" : driver.findElement(By.xpath(".//*[@id=':2']/div")).click();
 break;
case "March" : driver.findElement(By.xpath(".//*[@id=':3']/div")).click();
break;
case "April" : driver.findElement(By.xpath(".//*[@id=':4']/div")).click();
break;
case "May" : driver.findElement(By.xpath(".//*[@id=':5']/div")).click();
break;
case "June" : driver.findElement(By.xpath(".//*[@id=':6']/div")).click();
break;
case "July" : driver.findElement(By.xpath(".//*[@id=':7']/div")).click();
break;
case "August" : driver.findElement(By.xpath(".//*[@id=':8']/div")).click();
break;
case "September" : driver.findElement(By.xpath(".//*[@id=':9']/div")).click();
break;
case "October" : driver.findElement(By.xpath(".//*[@id=':a']/div")).click();
break;
case "November" : driver.findElement(By.xpath(".//*[@id=':b']/div")).click();
break;
case "December" : driver.findElement(By.xpath(".//*[@id=':c']/div")).click();
break;
}

driver.findElement(By.id("BirthDay")).sendKeys(birthday);
driver.findElement(By.id("BirthYear")).sendKeys(birthyear);
driver.findElement(By.id("Gender")).click();
switch(gender)
{
case "Male" : driver.findElement(By.xpath(".//*[@id=':f']/div")).click();
break;
case "Female" : driver.findElement(By.xpath(".//*[@id=':e']/div")).click();
break;
}
driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys(mobile);
driver.findElement(By.id("RecoveryEmailAddress")).sendKeys(mail);
Thread.sleep(1000);
driver.findElement(By.id("SkipCaptcha")).click();
driver.findElement(By.id("TermsOfService")).click();
//driver.findElement(By.id("submitbutton")).click();
//driver.get("https://www.gmail.com/intl/en/mail/help/about.html");
}

@DataProvider(name="DataInput")
public static Iterator inputData() throws BiffException, IOException{
	ArrayList myData = new ArrayList();
	FileInputStream  fi = new FileInputStream("C:\\Users\\Raviteja\\Desktop\\Gmail.xls");
	Workbook w = Workbook.getWorkbook(fi);
	Sheet s = w.getSheet("Sheet1");
	for(int row=1; row <s.getRows();row++)
	{
	String first = s.getCell(0, row).getContents();
	String last= s.getCell(1, row).getContents();
	String gmail= s.getCell(2, row).getContents();
	String password= s.getCell(3, row).getContents();
	String confirm = s.getCell(4,row).getContents();
	String month= s.getCell(5, row).getContents();
	String birthday= s.getCell(6, row).getContents();
	String birthyear = s.getCell(7,row).getContents();
	String gender= s.getCell(8, row).getContents();
	String mobile = s.getCell(9,row).getContents();
	String mail = s.getCell(10,row).getContents();
	myData.add(new Object[]{first,last,gmail,password,confirm,month,birthday,birthyear,gender,mobile,mail});
	}
 return myData.iterator();
}

@AfterTest
public void tearDown()
{
	//driver.findElement(By.linkText("Logout")).click();

}
}






//Backup


//package retrieve;
/*import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class retrieveData{
Sheet s;
WebDriver driver;
@BeforeMethod
public void setUp()
{
	//System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	//driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--test-type");
    driver = new ChromeDriver(options);
    driver.get("https://www.gmail.com/intl/en/mail/help/about.html");

driver.manage().window().maximize();
driver.findElement(By.className("maia-button")).click();
}

@Test
public void searchGoogle() throws Exception
{
FileInputStream  fi = new FileInputStream("C:\\Users\\Raviteja\\Desktop\\Gmail.xls");
Workbook w = Workbook.getWorkbook(fi);
s = w.getSheet(0);
for(int row=1; row <=1;row++)
{
String first = s.getCell(0, row).getContents();
driver.findElement(By.id("FirstName")).sendKeys(first);
String last= s.getCell(1, row).getContents();
WebElement Tr = driver.findElement(By.id("LastName"));
Tr.sendKeys(last);
Tr.sendKeys(Keys.TAB);
String gmail= s.getCell(2, row).getContents();
driver.findElement(By.id("GmailAddress")).sendKeys(gmail);
String password= s.getCell(3, row).getContents();
driver.findElement(By.id("Passwd")).sendKeys(password);
String confirm = s.getCell(4,row).getContents();
driver.findElement(By.id("PasswdAgain")).sendKeys(confirm);
driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]")).click();
String month= s.getCell(5, row).getContents();//.trim();
String[] Flds = month.split("-"); 
String year=Flds[2];
System.out.println(year);
String date=Flds[0];
String moth=Flds[1];
String renew_upto=month+"-"+date+"-"+year;
switch(month)
{
case "January" : driver.findElement(By.xpath(".//*[@id=':1']/div")).click();
 break;
case "February" : driver.findElement(By.xpath(".//*[@id=':2']/div")).click();
 break;
case "March" : driver.findElement(By.xpath(".//*[@id=':3']/div")).click();
break;
case "April" : driver.findElement(By.xpath(".//*[@id=':4']/div")).click();
break;
case "May" : driver.findElement(By.xpath(".//*[@id=':5']/div")).click();
break;
case "June" : driver.findElement(By.xpath(".//*[@id=':6']/div")).click();
break;
case "July" : driver.findElement(By.xpath(".//*[@id=':7']/div")).click();
break;
case "August" : driver.findElement(By.xpath(".//*[@id=':8']/div")).click();
break;
case "September" : driver.findElement(By.xpath(".//*[@id=':9']/div")).click();
break;
case "October" : driver.findElement(By.xpath(".//*[@id=':a']/div")).click();
break;
case "November" : driver.findElement(By.xpath(".//*[@id=':b']/div")).click();
break;
case "December" : driver.findElement(By.xpath(".//*[@id=':c']/div")).click();
break;
}
String birthday= s.getCell(6, row).getContents();
driver.findElement(By.id("BirthDay")).sendKeys(birthday);
String birthyear = s.getCell(7,row).getContents();
driver.findElement(By.id("BirthYear")).sendKeys(birthyear);
driver.findElement(By.id("Gender")).click();
String gender= s.getCell(8, row).getContents();
switch(gender)
{
case "Male" : driver.findElement(By.xpath(".//*[@id=':f']/div")).click();
break;
case "Female" : driver.findElement(By.xpath(".//*[@id=':e']/div")).click();
break;
}
String mobile = s.getCell(9,row).getContents();
driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys(mobile);
String mail = s.getCell(10,row).getContents();
driver.findElement(By.id("RecoveryEmailAddress")).sendKeys(mail);
Thread.sleep(1000);
driver.findElement(By.id("SkipCaptcha")).click();
Thread.sleep(1000);
driver.findElement(By.id("TermsOfService")).click();
driver.findElement(By.id("submitbutton")).click();
//driver.get("https://accounts.google.com/SignUp?service=mail&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-en");


}
}

@AfterTest
public void tearDown()
{
	//driver.findElement(By.linkText("Logout")).click();

}
}*/

