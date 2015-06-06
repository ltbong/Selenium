package validationa_obts;


//import java.awt.List;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
		 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Validations {

	/*public Web_Obts(WebElement findElement) {
		// TODO Auto-generated constructor stub
	}*/

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		

		        // declaration and instantiation of objects/variables
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravitejaseetha\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
         
         //WebDriver driver = new FirefoxDriver(); 
         //WebDriver driver = new ChromeDriver();
		        WebDriver driver = new FirefoxDriver();
		 
		       String baseUrl = "http://202.153.45.8/OnLineBusBookSystem/";
		        //String baseUrl = "http://sntonline.in";

		        //String expectedTitle = "Enter From";
		 
		       // String actualTitle = "Enter";
		
		        // launch Firefox and direct it to the Base URL
		 
		        driver.get(baseUrl);
		       // driver.get("http://www.google.com");
		       // WebElement searchBox = driver.findElement(By.id("gbqfbb"));
		        //System.out.println(searchBox.isEnabled());
		       // Actions builder = new Actions(driver);
		        //builder.keyDown(Keys.SHIFT);
		        
		        //builder.click(searchBox);
		        
		        
		        
		        //builder.keyUp(Keys.SHIFT);
		       // Perform the action.
		      // builder.perform();

		        //validations home page
		        //driver.findElement(By.id("search")).click();
		        //String sst = driver.findElement(By.xpath(".//*[@id='form-search']/p[1]/span[2]")).getText();
		        //String sst1 = driver.findElement(By.xpath(".//*[@id='form-search']/p[2]/span[2]")).getText();
		        //String sst2 = driver.findElement(By.xpath(".//*[@id='form-search']/p[3]/span[2]")).getText();
		       // String sst3 = driver.findElement(By.xpath(".//*[@id='form-search']/p[4]/span[2]")).getText();
		 
		        //System.out.println("Validation for from combo box : "+sst);
		        
		        //System.out.println("length :"+sst.length());
		        //System.out.println("Validation for to combo box :"+sst1);
		        //System.out.println("Validation for departure date picker : "+sst2);
		       // System.out.println("Validation for seats combo box : "+sst3);
		        //System.out.println("");
		        Thread.sleep(3000);
			       
		        List<WebElement> fromLocations = driver.findElements(By.name("from_input"));
                for (WebElement locations : fromLocations){
                	System.out.println(locations.getText());
                }
		        driver.findElement(By.name("from_input")).sendKeys("GANGTOK");
		        driver.findElement(By.name("to_input")).sendKeys("NAMCHI");
		        driver.findElement(By.id("date")).sendKeys("12-07-2014");
		        driver.findElement(By.name("NumberOfSeats_input")).sendKeys("5");
		        driver.findElement(By.id("search")).click();
		        Thread.sleep(3000);
		       
		        
		      String message = driver.findElement(By.xpath(".//*[@id='emptymessage']/b")).getText();
		      if(message.equals("OOPs! there are no schedules available for your selection"))
		      {
		    	  System.out.println("\n"+message);
		          
		      }
		      else{
                driver.findElement(By.xpath(".//*[@id='schedulesgrid']/div[2]/table/tbody/tr[1 ]/td[1]/a")).click();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                List<WebElement> allElements = driver.findElements(By.id("seatdetails").id("holder").id("place").className("seat")); 
                System.out.println("single"+allElements.get(2));
                int i =allElements.size();
                allElements.remove(i-1);
                System.out.println("No of seats Available :"+allElements.size());
                System.out.println();
       
                
                for (WebElement seats : allElements){
                	System.out.println(seats.getText());
                	
                }
                
                try
                {
                driver.findElement(By.id("seatdetails").linkText("15")).click();
                //Alert alert = driver.switchTo().alert();
             // Get the text from the alert
                //String alertText = alert.getText();
                //System.out.println(alertText);
                driver.findElement(By.id("seatdetails").linkText("16")).click();
                driver.findElement(By.id("seatdetails").linkText("17")).click();
                driver.findElement(By.id("seatdetails").linkText("18")).click();
                driver.findElement(By.id("seatdetails").linkText("19")).click();
                
                //driver.findElement(By.xpath(".//*[@id='place']/li[2]")).click();
                //driver.findElement(By.xpath(".//*[@id='place']/li[3]")).click();
                driver.findElement(By.xpath(".//*[@id='close']")).click();
                WebElement selectgender = driver.findElement(By.name("Title_ADT_1"));
                selectgender.sendKeys("Mr");
                driver.findElement(By.id("fname_1")).sendKeys("bharath");
                driver.findElement(By.id("age_1")).sendKeys("28");
                driver.findElement(By.name("email")).sendKeys("p@gmail.com");
                driver.findElement(By.name("mobile")).sendKeys("789600000");
                //System.out.println("Total Amount : "+driver.findElement(By.xpath(".//*[@id='sidebar']/h3[3]/span")).getText());
                System.out.println(driver.findElement(By.className("container").id("rightstrip").id("sidebar").className("total")).getText());
                driver.findElement(By.className("btnpaynow")).click();
                driver.findElement(By.id("frm_name_on_card")).sendKeys("ebs");
                driver.findElement(By.name("number_1")).sendKeys("4111");
                driver.findElement(By.name("number_2")).sendKeys("1111");
                driver.findElement(By.name("number_3")).sendKeys("1111");
                driver.findElement(By.name("number_4")).sendKeys("1111");
                driver.findElement(By.id("frm_exp_month")).sendKeys("07");
                driver.findElement(By.id("frm_exp_year")).sendKeys("2016");
                driver.findElement(By.id("frm_cvv")).sendKeys("123");
                driver.findElement(By.id("submitted")).click();
		      
               /*String str = driver.findElement(By.xpath(".//*[@id='emptymessage']/b")).getText();
               Thread.sleep(5000);
                System.out.println("Message when no schedules found :- "+str);*/
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
               //Thread.sleep(8000);
                
		       //driver.close();
		 
		        
		 
		        // exit the program explicitly

		        
               //System.exit(0);
                } catch(UnhandledAlertException e){
		    	  System.out.println("This seat is already reserved");
		      }
		    	  
                }
		      }
                
               
		    }
		

	


