package example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTestCa {
  
  @Test(groups ={"test-group"})
  public void testMethodOne() {
	  System.out.println("Method one");
  }
  @Test
  public void testMethodTwo(){
	  System.out.println("Method two");
  }
  @Test(groups={"test-group"})
  public void testMethodThree(){
	  System.out.println("Method three");
  }
  
}
