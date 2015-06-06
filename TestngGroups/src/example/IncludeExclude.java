package example;

import org.testng.annotations.Test;

public class IncludeExclude {
  @Test(groups={"include-group"})
  public void groupOne() {
	  System.out.println("Group one include");
  }
  @Test(groups={"include-group"})
  public void groupTwo() {
	  System.out.println("Group two include");
  }
  @Test(groups={"include-group","exclude-group"})
  public void groupThree() {
	  System.out.println("Group three include and exclude");
  }
}
