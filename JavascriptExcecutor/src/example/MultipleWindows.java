package example;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		String parentWindow = driver.getWindowHandle();
		String subWindow = null;
		System.out.println(parentWindow);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='newBrwWin()']")).click();
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
	        while(iterator.hasNext()){
	        	subWindow = iterator.next();
	        }
	        driver.switchTo().window(subWindow);
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        Actions action = new Actions(driver);
	        WebElement ele = driver.findElement(By.linkText("TUTORIALS"));
	        //Thread.sleep(2000);
	        action.moveToElement(ele);
	        Thread.sleep(3000);
	        WebElement ele1 = driver.findElement(By.linkText("Selenium WebDriver"));
	        action.moveToElement(ele1);
	        action.click().build().perform();
	      
	}

}
