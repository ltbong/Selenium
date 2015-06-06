package example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcel {
	Sheet s;
	public static WebDriver driver;
	public WebDriverWait wait;
/*@BeforeClass
public void testSetup(){
	System.setProperty("webdriver.chrome.driver","D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	wait = new WebDriverWait(driver,5);
}*/
@Test(dataProvider="data")
public void VerifyInvalidLogin(String first, String last)throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.manage().window().maximize();
	wait = new WebDriverWait(driver,5);
	driver.navigate().to("http://gmail.com");
	driver.findElement(By.id("Email")).sendKeys(first);
	driver.findElement(By.id("Passwd")).sendKeys(last);
	
	//wait for element to be visible and perform click
	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("signIn"))));
	driver.findElement(By.id("signIn")).click();	
	
	//Check for error message
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("errormsg_0_Email")));
	String actualErrorDisplayed = driver.findElement(By.id("errormsg_0_Passwd")).getText();
	String requiredErrorMessage = "The email or password you entered is incorrect. ?";
	Assert. assertEquals(requiredErrorMessage, actualErrorDisplayed);
	//driver.quit();
}
 /* @DataProvider(name="data")
  public Object[][] loginData(){
	  Object[][] arrayObject = getExcelData("C:\\Users\\Raviteja\\Desktop\\Book1.xls","Sheet1");
	  return arrayObject;
  }*/

/*public String[][] getExcelData(String fileName, String sheetName) {
	String[][] arrayExcelData = null;
	try {
		FileInputStream fs = new FileInputStream(fileName);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet(sheetName);
		int totalNoOfCols = sh.getColumns();
		int totalNoOfRows = sh.getRows();
		arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
		for (int i= 1 ; i < totalNoOfRows; i++) 
		{
			for (int j=0; j < totalNoOfCols; j++)
			{
				arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
			}
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
		e.printStackTrace();
	} catch (BiffException e) {
		e.printStackTrace();
	}
	return arrayExcelData;*/
 /*@DataProvider(name="data")
 public Iterator<String> inputData() throws BiffException, IOException{
	 ArrayList myData = new ArrayList();
	 FileInputStream fs = new FileInputStream("C:\\Users\\Raviteja\\Desktop\\Book1.xls");
	 Workbook wb = Workbook.getWorkbook(fs);
	 Sheet sh = wb.getSheet("Sheet1");
	 int rows = sh.getRows();
	 //int coloumns = sh.getColumns();
	 for(int i =1 ; i < rows ; i++){
		 
		 String name = sh.getCell(0,i).getContents();
		 String password = sh.getCell(1,i).getContents();
	 myData.add(new Object[]{name,password});
	 }
	 return myData.iterator();
	 }*/
@DataProvider(name="data")
public Object[][] inputData() throws BiffException, IOException{
	String[][]  arrayData = null;
	FileInputStream fs = new FileInputStream("C:\\Users\\Raviteja\\Desktop\\Book2.xls");
	Workbook wb = Workbook.getWorkbook(fs);
	Sheet sh = wb.getSheet("Sheet1");
	int rows = sh.getRows();
	int coloumns = sh.getColumns();
	
	arrayData = new String[rows][coloumns];
	for(int i = 0; i<rows;i++){
		for(int j=0; j<coloumns; j++){
			arrayData[i][j] = sh.getCell(j, i).getContents();
		}
	}
	return arrayData;
}
}


