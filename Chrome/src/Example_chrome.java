


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_chrome

{

  
   public static void main(String[] args) 
   {
    // TODO Auto-generated method stub
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravitejaseetha\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
          
          //WebDriver driver = new FirefoxDriver(); 
          WebDriver driver = new ChromeDriver();
          driver.get("http://www.sntonline.in");
   }
}
