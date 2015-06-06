package example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://w3schools.com/js/tryit.asp?filename=tryjs_prompt");
driver.manage().window().maximize();
driver.switchTo().frame(0);
Thread.sleep(5000);
driver.findElement(By.tagName("button")).click();
Thread.sleep(5000);
Alert alert = driver.switchTo().alert();
alert.sendKeys("yo yo");
System.out.println(alert.getText());
Thread.sleep(5000);
alert.accept();
	}

}
