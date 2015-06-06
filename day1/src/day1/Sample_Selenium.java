package day1;

/*import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver dr1 =new FirefoxDriver();
		FirefoxDriver dr2 =new FirefoxDriver();
		dr1.get("http://www.google.com");
		dr2.get("http://www.yahoo.com");
	}

}*/
/*import io.selendroid.SelendroidCapabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.android.AndroidDriver;
public class Sample_Selenium {
public static void main(String args[])throws Exception
{

	AndroidDriver ad=new AndroidDriver();
ad.getSessionId();
System.out.println("Started");
//FirefoxDriver dr1 =new FirefoxDriver();
ad.get("http://www.google.com");
System.out.println("Application Title"+ ad.getTitle());
Thread.sleep(2000);
ad.findElement(By.name("Email")).sendKeys("type your email");
ad.findElement(By.name("Passwd")).sendKeys("type password");
ad.findElement(By.name("signIn")).click();
System.out.println("Opened");
ad.close();
 }
}*/



import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;

 
 
public class Sample_Selenium {
 
 
 
    public static void main(String[] args) {
 
        // declaration and instantiation of objects/variables
 
        WebDriver driver = new FirefoxDriver();
 
        String baseUrl = "http://newtours.demoaut.com";

        String expectedTitle = "Welcome: Mercur Tours";
 
        String actualTitle = "";
 
 

        // launch Firefox and direct it to the Base URL
 
        driver.get(baseUrl);
 
 
 
        // get the actual value of the title
 
        actualTitle = driver.getTitle();
 
 
 
        /*
 
         * compare the actual title of the page witht the expected one and print
 
         * the result as "Passed" or "Failed"
 
         */
 
        if (actualTitle.contentEquals(expectedTitle)){
 
            System.out.println("Test Passed!");
 
        } else {
 
            System.out.println("Test Failed");
 
        }

        

       //close Firefox

        driver.close();
 
        
 
        // exit the program explicitly

        System.exit(0);
 
    }
}

