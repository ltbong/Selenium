package example;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestProfile {
public static void main (String[] args){
	
	FirefoxProfile prof = new FirefoxProfile();
	prof.setPreference("browser.startup.homepage", "http://google.com");
	WebDriver driver = new FirefoxDriver(prof);
	WebDriverWait wait = new WebDriverWait(driver,10);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sample")));
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
}
}
