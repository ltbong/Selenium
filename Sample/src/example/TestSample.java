package example;

import java.sql.Driver;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://naukri.com");
String title = getCurrentWindowTitle(driver);
String mainWindow = getMainWindowHandler(driver);
Assert.assertTrue(closeAllOtherWindows(mainWindow,driver));
Assert.assertTrue("Main window title is not matching",title.contains("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com"));
	}
	public static String getMainWindowHandler(WebDriver driver){
		return driver.getWindowHandle();
	}
	public static  String getCurrentWindowTitle(WebDriver driver){
		String title = driver.getTitle();
		return title;
	}
	public static boolean closeAllOtherWindows(String openWindowHandle,WebDriver driver){
		Set<String> windows = driver.getWindowHandles();
		for(String currentWindow : windows){
			if(!currentWindow.equals(openWindowHandle)){
				driver.switchTo().window(currentWindow);
				driver.close();
			}
		}
		driver.switchTo().window(openWindowHandle);
		if(driver.getWindowHandles().size()==1)
			return true;
		else
			return false;	
	}

}
