package example;

import org.testng.annotations.Test;

public class TestCasePrioriy {
  @Test(priority=0)
  public void f() {
	  System.out.println("least priority");
  }
  @Test(priority=1)
  public void g(){
	  System.out.println("Moderate priority");
  }
  @Test(priority=2)
  public void n(){
	  System.out.println("high priority");
  }
}
