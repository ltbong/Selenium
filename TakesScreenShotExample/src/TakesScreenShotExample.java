
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TakesScreenShotExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.packtpub.com/");
	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    System.out.println(scrFile.getAbsolutePath());
	    FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
	}

}
