package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {
  @Test(enabled=true)
  public void f() {
	  System.out.println("Test one");
	  System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://mail.technoidentity.com");
  }
  @Test
  public void test(){
	  int j= 1;
	  if(j<=2)
		  throw new SkipException("skipping this method");
	  System.out.println("Exceuted successfully");
  }
  @Test
	public void testCaseSkipException(){
			System.out.println("Im in skip exception");
			throw new SkipException("Skipping this exception");
		}
}
