import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//public class Link {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
String baseUrl ="C:\\Users\\ravitejaseetha\\Desktop\\a.html";
WebDriver driver = new FirefoxDriver();
driver.get(baseUrl);
driver.findElement(By.linkText("click here")).click();
System.out.println("the title of the page is :"+driver.getTitle());
driver.quit();

	}

}*/
	
	//package practice_webdriver;

	import java.util.List;

	 

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.*;

	import org.openqa.selenium.firefox.FirefoxDriver;

	import org.openqa.selenium.support.ui.ExpectedConditions;

	import org.openqa.selenium.support.ui.WebDriverWait;

	 

	public class Link {

	 

	    public static void main(String[] args) {

	        String baseUrl = "http://newtours.demoaut.com/";

	        WebDriver driver = new FirefoxDriver();

	        String underConsTitle = "Under Construction: Mercury Tours";

	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	 

	        driver.get(baseUrl);

	        List<WebElement> linkElements = driver.findElements(By.tagName("a"));

	        String[] linkTexts = new String[linkElements.size()];

	        int i = 0;

	 

	        //extract the link texts of each link element

	        for (WebElement e : linkElements) {

	            linkTexts[i] = e.getText();

	            i++;

	        }

	 

	        //test each link

	        for (String t : linkTexts) {

	            driver.findElement(By.linkText(t)).click();

	            if (driver.getTitle().equals(underConsTitle)) {

	                System.out.println("\"" + t + "\""

	                        + " is under construction.");

	            } else {

	                System.out.println("\"" + t + "\""

	                        + " is working.");

	            }

	            driver.navigate().back();

	        }

	        driver.quit();

	    }

	}




