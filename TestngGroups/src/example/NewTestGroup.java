package example;

import org.testng.annotations.Test;

public class NewTestGroup {
	@Test(groups ={"test-group"})
	  public void testMethodOne() {
		  System.out.println("Method one");
	  }
	  public void testMethodTwo(){
		  System.out.println("Method two");
	  }
	  @Test(groups={"test-group"})
	  public void testMethodThree(){
		  System.out.println("Method three");
	  }
}
