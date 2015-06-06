package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
  @Test
  public void methodOne() {
	  System.out.println("running in "+Thread.currentThread().getId());
	  System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://google.com");
  }
  @Test(enabled=false)
  public void methodTwo(){
	  System.out.println("running in "+Thread.currentThread().getId());
	  WebDriver driver1= new FirefoxDriver();
	  driver1.get("http://technoidentity.com");
  }
}
