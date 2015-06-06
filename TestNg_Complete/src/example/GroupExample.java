package example;

import org.testng.annotations.Test;

public class GroupExample {
  @Test(groups="Regression")
  public void test() {
	  System.out.println("Method test belongs to regression group");
  }
  @Test(groups="Smoke")
  public void test1(){
	  System.out.println("Method belongs to smoke group");
  }
  @Test(groups="Regression")
  public void test2(){
	  System.out.println("Method test 2 belongs to regression");
  }
  }
