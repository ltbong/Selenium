package signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class FacebookRegister {
  
  WebDriver driver; 
  @Test
  public void retrieveUrl() {
	  System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--test-type");
	  driver = new ChromeDriver(options);
  }
}
