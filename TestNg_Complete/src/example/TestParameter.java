package example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {
  
  @Parameters({"browser"})
  @Test
  public void testMethod(String browser) {
	  System.out.println("browser passed as : "+browser);
  }
  @Parameters({"username","password"})
  @Test
  public void credentials(String username,String password){
	  System.out.println("Username is : "+username);
	  System.out.println("Password is :" +password);
  }
}
