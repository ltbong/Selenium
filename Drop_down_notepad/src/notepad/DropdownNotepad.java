package notepad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DropdownNotepad extends Thread {
    public static WebDriver driver;
    public static void main(String[] args) throws IOException {
        driver = new FirefoxDriver();
        driver.get("http://www.etouch.net/home/index.html");
        WebElement service = driver.findElement(By.xpath("//a[text()='Services']"));
        Actions act = new Actions(driver);
        act.moveToElement(service).perform();
        List<WebElement> dropdown = driver.findElements(By.xpath("//li[@id='services']//ul//ul/li"));
        System.out.println(dropdown.size());
        
        FileWriter fileWriter = new FileWriter("C:/Users/ravitejaseetha/Desktop/Desktop/Printer config.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        
        
        for(WebElement ele: dropdown){
            System.out.println(ele.getText());
            bufferedWriter.write(ele.getText()+"\n");
        }
        bufferedWriter.close();
        
        driver.close();
    }
}
