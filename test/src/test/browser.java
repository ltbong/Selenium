package test;


import java.awt.List;
import java.util.TreeSet;

import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
		 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {
/*
	public browser(WebElement findElement) {
		// TODO Auto-generated constructor stub
	}*/

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		new browser().go();
	}
public void go(){
	Book b1 = new Book("How cats work");
	Book b2 = new Book("Remix your body");
	Book b3 = new Book("Finding Emo");
	
	TreeSet<Book> tree = new TreeSet<Book>();
	tree.add(b1);
	tree.add(b2);
	tree.add(b3);
	System.out.println(tree);
	
}
}
class Book{
	String title;
	public Book(String t){
		title=t;
	}
}

	
		     /*   // declaration and instantiation of objects/variables
		        System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
		       // WebDriver driver = new FirefoxDriver();
		        WebDriver driver = new ChromeDriver();		 
		        String baseUrl = "http://raviteja/ptsweb/admin/signin";

		        //String expectedTitle = "Enter From";
		 
		       // String actualTitle = "Enter";
		
		        // launch Firefox and direct it to the Base URL
		 
		        driver.get(baseUrl);
		        
		        driver.findElement(By.id("search")).click();
		        String sst = driver.findElement(By.xpath(".//*[@id='form-search']/p[1]/span[2]")).getText();
		        String sst1 = driver.findElement(By.xpath(".//*[@id='form-search']/p[2]/span[2]")).getText();
		        String sst2 = driver.findElement(By.xpath(".//*[@id='form-search']/p[3]/span[2]")).getText();
		        String sst3 = driver.findElement(By.xpath(".//*[@id='form-search']/p[4]/span[2]")).getText();
		 
		        System.out.println("Validation for from combo box : "+sst);
		        System.out.println("Validation for to combo box : "+sst1);
		        System.out.println("Validation for departure date picker : "+sst2);
		        System.out.println("Validation for seats combo box : "+sst3);*/
		 
		        // get the actual value of the title
		 
		       // actualTitle = driver.getTitle();

		       // driver.findElement(By.xpath(".//*[@id='header']/div/ul/li[4]/a")).click();
				// driver.findElement(By.name("UserName")).sendKeys("admin");
				// driver.findElement(By.name("PassWord")).sendKeys("Design_20");
				// driver.findElement(By.className("btnprintnow")).submit();
				// driver.findElement(By.name("ctl00$ContentPlaceHolder1$FromDatePicker$dateInput")).sendKeys("01-12-2013");
				// WebElement input = (new WebDriverWait(driver, 32)).until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_ContentPlaceHolder1_ToDatePicker_dateInput")));
				// driver.findElement(By.name("ctl00$ContentPlaceHolder1$ToDatePicker$dateInput")).sendKeys("24-01-2014");
				
				
				// driver.findElement(By.id("ctl00_ContentPlaceHolder1_DepotTypeComboBox_Arrow")).click();
				
				
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//WebElement List = driver.findElement(By.className("rcbList"));
				//Get Item Three
				
			    //WebElement Item = List.findElement(By.className("rcbHovered"));
			    //System.out.println(Item);
			   
				//Item.click(); 
				//WebElement select = driver.findElement(By.id("ctl00_ContentPlaceHolder1_DepotTypeComboBox_Input"));
			     //driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_DepotTypeComboBox_Input']")).sendKeys("g");
				 //driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_DepotTypeComboBox_Input']")).click();
				 
		
				 
				 /*Select depotName = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_DepotTypeComboBox_Input']")));
				 depotName.selectByVisibleText("GANGTOK");*/
		 

		
	
		      
		/*
		 
		         * compare the actual title of the page witht the expected one and print
		 
		         * the result as "Passed" or "Failed"
		 
		         */
		 
		       /* if (sst.contentEquals(expectedTitle)){
		 
		            System.out.println("Test Passed!Validation for Leaving from combo box : "+sst );
		 
		        } else{
		        	
		      
		 
		            System.out.println("Test Failed");
		        }*/
		 
		        

		        

		       //close Firefox

		        //driver.close();
		 
		        
		 
		        // exit the program explicitly

		        //System.exit(0);
		 
	

