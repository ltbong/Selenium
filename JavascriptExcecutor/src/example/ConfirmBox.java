package example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://www.tizag.com/javascriptT/javascriptprompt.php");
driver.manage().window().maximize();
//driver.switchTo().frame(0);
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,600)");
Thread.sleep(5000);
	//driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
    driver.findElement(By.xpath("//input[@onclick='prompter()']")).click();
	Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("hello world");
	Thread.sleep(3000);
	System.out.println(alert.getText());
	alert.accept();
	driver.quit();
	}

}
