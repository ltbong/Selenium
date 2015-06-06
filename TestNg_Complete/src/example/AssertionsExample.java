package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
  @Test
  public void verifyTitle() {
	  System.setProperty("webdriver.chrome.driver","D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
      driver.navigate().to("http://google.com");
      	Assert.assertEquals(driver.getTitle(),"Google" );
      	Assert.assertTrue(login(),"User failed to login");
  }
  @Test
  public boolean login(){
	  int i = 0;
	  boolean ad=false;
	  if(i<=0){
		  System.out.println("i is equal to 0");
	  }
	  return ad;
  }
}
