package example;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Dimension;
 
public class TestSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("https://raviteja/PtsWeb/Ilp/Register");
Dimension d = new Dimension(600, 600);
driver.manage().window().setSize(d);
Select se = new Select(driver.findElement(By.id("Nationality")));
List<WebElement> countries = se.getOptions();
for(WebElement opt:countries){
	System.out.println(opt.getText()+"\n");
}

	}

}
