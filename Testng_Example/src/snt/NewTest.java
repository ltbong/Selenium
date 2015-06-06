package snt;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testng.Workbook;
import jxl.Sheet;
import jxl.Workbook;
public class NewTest {
	Sheet s;
     WebDriver driver;
     @BeforeTest
     public void start()
 	 {
 		System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
 	    driver = new ChromeDriver();
 	 }
       
	 @Test
     public void testCase1() throws FileNotFoundException 
	 {
		 FileInputStream  fi = new FileInputStream("C:\\Users\\ravitejaseetha\\Desktop\\tourist.xls");
		 Workbook w = Workbook.getWorkbook(fi);
     }
 
        
 
    }