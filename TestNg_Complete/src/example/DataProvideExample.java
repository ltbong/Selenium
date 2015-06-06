package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideExample {
  @Test(dataProvider="setData")
  public void getData(String username) {
	  System.out.println("username"+username);
	  //System.out.println("password"+password);
  }
  //First dimension is test case (or test run if you want). Second dimension is parameter index.
  @DataProvider
  public Object[][] setData(){
	  Object[][] data = new Object[3][0];
	  data[0][0]="ravi";
	  data[0][1]="1234";
	  data[1][0]="teja";
	  data[1][1]="5689";
	  data[2][0]="sachin";
	  data[2][1]="7868";
	  return data;
	  //return new Object[][]{{"ravi"},{"teja"},{"254"}};
			  
	  }
			  
  }
  

