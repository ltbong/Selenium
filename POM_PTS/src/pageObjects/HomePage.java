package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
public static WebElement element=null;

public static WebElement get_started(WebDriver driver){
	element = driver.findElement(By.id("button-start"));
	return element; 
}
}
