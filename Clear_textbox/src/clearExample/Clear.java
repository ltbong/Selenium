package clearExample;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clear {
    public static void main(String[] args) throws InterruptedException {
    	int a;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string which you want to send and then clean");
        //String input = in.nextLine();
        a=in.nextInt();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.in/?gfe_rd=cr&ei=zQmQU9D3OoyK8QfpxoDQBA&gws_rd=ssl");
        WebElement box = driver.findElement(By.name("q"));
        box.sendKeys(""+a);
        //box.sendKeys(input);
        Thread.sleep(5000); //simply wait to see that input string has been sent to box
        
        //this for block is used to clear the input from box
        //this we can do by using clear method but clear sometime won't work so use this way
        //box.clear();
        box.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        box.sendKeys(Keys.BACK_SPACE);
    }
}    