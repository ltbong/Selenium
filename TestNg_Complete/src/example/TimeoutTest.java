package example;

import org.testng.annotations.Test;

public class TimeoutTest {
  @Test(timeOut=4000)
  public void test() throws InterruptedException{
  Thread.sleep(3000);
  System.out.println("Successfull");
  }
}
