package example;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

import sun.util.logging.resources.logging;

public class ListenerClass extends TestListenerAdapter {
	@Override //Use this annotation to tell the compiler that the method is supposed to be overriding a method in the superclass. If by chance it doesn't, the compiler tells you. This allows you to catch typos like wrong case or incorrect return types/parameters.
	public void onTestStart(ITestResult tr) {
		log("Test Started....");
	}
@Override
public void onFinish(ITestContext tc){
	log(" Invoked after all the tests have run and all their Configuration methods have been called.");
}
	@Override
	public void onTestSuccess(ITestResult tr) {

		System.out.println("Test '" + tr.getName() + "' PASSED");

		// This will print the class name in which the method is present
		log(tr.getTestClass());

		// This will print the priority of the method.
		// If the priority is not defined it will print the default priority as
		// 'o'
		log("Priority of this method is " + tr.getMethod().getPriority());
		System.out.println(".....");
	}

	@Override
	public void onTestFailure(ITestResult tr) {

		log("Test '" + tr.getName() + "' FAILED");
		log("Priority of this method is " + tr.getMethod().getPriority());
		System.out.println(".....");
	}


	@Override
	public void onTestSkipped(ITestResult tr) {
		log("Test '" + tr.getName() + "' SKIPPED");
		System.out.println(".....");
	}

	private void log(String methodName) {
		System.out.println(methodName);
	}

	private void log(IClass testClass) {
		System.out.println(testClass);
	}

}
