package example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://raviteja/PtsWeb/Ilp/Register");
        driver.manage().window().maximize();
        //driver.switchTo().frame(0);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(),' Add to group']")).click();
        //Alert alert = driver.switchTo().alert();
        //Thread.sleep(3000);
        //alert.accept();
	}

}
