package example;

import org.testng.annotations.Test;

@Test
public class ClassLevelAnnotation {
  
  public void oneMethod() {
	  System.out.println("MEthod one");
  }
  public void twoMethod(){
	  System.out.println("method two");
	  int i = 1/0;
  }
  @Test(dependsOnMethods={"twoMethod"})
  public void threeMehod(){
	  System.out.println("Method three");
  }
}
