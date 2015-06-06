package example;

import org.testng.annotations.Test;

public class ExceptionTest {
  @Test(expectedExceptions=ArithmeticException.class)
  public void f() {
	  int e =1/0;
	  System.out.println("outoput"+e);
  }
  @Test
  public void f2(){
	  int g=1/0;
	  System.out.println("output 2 "+g);
  }
}
