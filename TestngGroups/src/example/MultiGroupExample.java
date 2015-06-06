package example;

import org.testng.annotations.Test;

public class MultiGroupExample {
  
  @Test(groups={"group-one"})
  public void testMethodOne() {
  System.out.println("Method one belonging to one group");
  }
  @Test(groups={"group-one","group-two"})
  public void testMethodTwo(){
	  System.out.println("Method two belonging to both groups");
  }
  @Test(groups={"group-two"})
  public void testMethodThree(){
	  System.out.println("Method three belonging to one group");
  }
}
