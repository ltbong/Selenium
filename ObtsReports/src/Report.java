

		// TODO Auto-generated method stub

	

//package examples;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Report {

	
	
   public static void main(String[] args) throws InterruptedException {

        // declaration and instantiation of objects/variables

        WebDriver driver = new FirefoxDriver();
        driver.get("http://202.153.45.8/OnLineBusBookSystem/Search/SearchBus");
        driver.findElement(By.xpath(".//*[@id='header']/div/ul/li[4]/a")).click();
        driver.findElement(By.xpath(".//*[@id='UserName']")).sendKeys("admin");
        driver.findElement(By.xpath(".//*[@id='PassWord']")).sendKeys("Design_20");
        driver.findElement(By.xpath(".//*[@id='retrieveticket']/div/input")).click();
        driver.findElement(By.className("rcCalPopup")).click();
        WebElement dateWidget = driver.findElement(By.id("ctl00_ContentPlaceHolder1_FromDatePicker_calendar"));  
        List<WebElement> rows=dateWidget.findElements(By.tagName("tr"));  
        List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  
          
        for (WebElement cell: columns){  
         //Select 13th Date   
         if (cell.getText().equals("1")){  
         cell.findElement(By.linkText("1")).click();  
         break;  
         }  
        }
        
        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ToDatePicker_popupButton']")).click();
        WebElement widget = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ToDatePicker_calendar_Top"));  
        List<WebElement> r=widget.findElements(By.tagName("tr"));  
        List<WebElement> c=widget.findElements(By.tagName("td"));  
          
        for (WebElement cell: c){  
         //Select 13th Date   
         if (cell.getText().equals("29")){  
         cell.findElement(By.linkText("29")).click();  
         break;  
         }  
        }
        
          driver.findElement(By.id("ctl00_ContentPlaceHolder1_DepotTypeComboBox_Arrow")).click();;
	      driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_DepotTypeComboBox_Input']")).sendKeys("g");
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_DepotTypeComboBox_DropDown']/div/ul/li[3]")).click();
	      
	     driver.findElement(By.xpath("//div[@id='content']/div[24]")).click();
	     
	      
         
	      //List<WebElement> linkElements = driver.findElements(By.tagName("a"));
	     // String[] linkTexts = new String[linkElements.size()];
	      //System.out.println("no of links"+linkElements.size());
	      /*int i = 0;
	      for (WebElement e : linkElements) {

	            linkTexts[i] = e.getText();

	            i++;

	        }
	      for (String t : linkTexts) {

	            driver.findElement(By.linkText(t)).click();

	            if (driver.getTitle().equals("underConsTitle")) {

	                System.out.println("\"" + t + "\""

	                        + " is under construction.");

	            } else {

	                System.out.println("\"" + t + "\""

	                        + " is working.");

	            }

	            driver.navigate().back();

	        }

	        driver.quit();*/

	    
	

	      // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        //List<WebElement> s=widget.findElements(By.tagName("tr"));
      
      
    

   }
}
