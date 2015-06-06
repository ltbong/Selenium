package Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




//import com.mysql.jdbc.ResultSet;
//import com.mysql.jdbc.Statement;
import com.thoughtworks.selenium.SeleneseTestBase;

public class NewTest extends SeleneseTestBase{
     WebDriver driver;
     String url ="";
     @BeforeTest
public void setUp() throws Exception{
     driver = new FirefoxDriver();
     url = "http://www.sntonline.in";
     driver.get(url);
     driver.findElement(By.linkText("Employee Login")).click();
}
     @Test
     public void CreateDB() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, InterruptedException{
           //Prepare connection
    	 Thread.sleep(5000);
      Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
         String userName ="sa";
         String password ="Design_20";

         String url ="jdbc:sqlserver://192.168.0.11\\TECHNOID;instanceName=SQLEXPRESS;DatabaseName=OBTS;integratedSecurity=true;";
         //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         //Connection conn = DriverManager.getConnection(url, userName, password);
         //String userName = "sa";
         //String password = "password";
         //String url = "jdbc:microsoft:sqlserver://TECHNOID-DELL"+";databaseName=obts";
         Connection con = DriverManager.getConnection(url, userName, password);
         Statement statement = con.createStatement();
         ResultSet resultSet = statement
                 .executeQuery("SELECT UserName,Password FROM LoginUsers");
         while (resultSet.next()) {
          String id = resultSet.getString("UserName");
             String info = resultSet.getString("Password");
             driver.findElement(By.id("UserName")).sendKeys(id);
             driver.findElement(By.id("PassWord")).sendKeys(info);
             driver.findElement(By.className("btnprintnow")).click();

         //String result = new result[20];
         }
          
     }      
}
