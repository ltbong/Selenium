package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	String message = "Hello World";
	   Message messageUtil = new Message(message);

	   @Test
	   public void testPrintMessage() {
	        Assert.assertEquals(message, messageUtil.printMessage());
	   }
	   public class PerformanceTesting {
		    @Test(invocationCount=12, threadPoolSize=4)
		    public void runTest(){
		        System.out.println("Thread Id: "+Thread.currentThread().getId());
		    }
		}
}

