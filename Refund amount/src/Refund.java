

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Refund {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		 
        String baseUrl = "http://202.153.45.8/OnLineBusBookSystem/Employees/refund/Create";
        driver.get(baseUrl);
        driver.findElement(By.id("UserName")).sendKeys("sntsupport");
        driver.findElement(By.id("PassWord")).sendKeys("SNT7546");
        driver.findElement(By.className("btnprintnow")).click();
        driver.get(baseUrl);
        driver.findElement(By.xpath(".//*[@id='retrieveticket']/span[1]/span/span/span")).click();
        //GANGTOK-NAMCHI(19:07)
        driver.findElement(By.xpath(".//*[@id='schedule_listbox']/li[7]")).click();
        //SILIGURI-TEESTA(15:00)
       // driver.findElement(By.xpath(".//*[@id='schedule_listbox']/li[18]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("scheduledate")).sendKeys("19/05/2014");
        driver.findElement(By.xpath(".//*[@id='retrieveticket']/input[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(" .//*[@id='bookingsgrid']/div[2]/table/tbody/tr[1]/td[5]/input")).click();
        driver.findElement(By.name("reason_input")).sendKeys("bus canceled");
        driver.findElement(By.xpath(".//*[@id='retrieveticket']/input[3]")).click();
      /*WebElement element = driver.findElement(By.cssSelector(".k-form-checkbox-row input"));
        if (!element.isSelected())
        {
            element.click();
        }*/
        
	}
}