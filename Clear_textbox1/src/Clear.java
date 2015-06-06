import java.util.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import clearExample.FirefoxDriver;
//import clearExample.WebDriver;
//import clearExample.WebElement;


public class Clear {

	public static void main(String[] args) throws InterruptedException {
    	int a;
    	String s;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string which you want to send and then clean");
        //String input = in.nextLine();
        //a=in.nextInt();
        s=in.nextLine();
        System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
	       
	    WebDriver driver = new ChromeDriver();		 
        //WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.in/?gfe_rd=cr&ei=zQmQU9D3OoyK8QfpxoDQBA&gws_rd=ssl");
        WebElement box = driver.findElement(By.name("q"));
        box.sendKeys(""+s);
        //box.sendKeys(input);
        Thread.sleep(5000); //simply wait to see that input string has been sent to box
        
        //this for block is used to clear the input from box
        //this we can do by using clear method but clear sometime won't work so use this way
        //box.clear();
        box.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        box.sendKeys(Keys.BACK_SPACE);
    }
}    