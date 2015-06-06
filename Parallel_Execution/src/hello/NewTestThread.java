package hello;

import org.testng.annotations.Test;

public class NewTestThread {
  @Test(invocationCount=5,threadPoolSize=3)
  public void count() {
	  System.out.println("Thread id : " + Thread.currentThread().getId());
  }
}
