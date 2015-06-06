package example;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "D:\\raviteja\\Downloads\\selenium-2.37.0\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://flipkart.com");
		Cookie name = new Cookie("mycookie","22456");
		driver.manage().addCookie(name);
		Set<Cookie> cookies = driver.manage().getCookies();
		for(Cookie cook : cookies){
			System.out.println("Cookie name "+cook+"\n");
		}
	
	}

}
