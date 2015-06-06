package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPAge {


public static WebElement element = null;

public static WebElement datepicker_Arrival(WebDriver driver){
	element = driver.findElement(By.id("fromDate"));
	return element;
}
/*@FindBy(id="fromaDate")
public WebElement arrival;*/

public static WebElement datepicker_Arrivaldate(WebDriver driver){
	element = driver.findElement(By.xpath("//td[contains(text(),'28')]"));
	return element;
}
public static WebElement txtbox_Name(WebDriver driver){
	element = driver.findElement(By.id("username"));
	return element;
}
public static WebElement select_Gender(WebDriver driver){
	element = driver.findElement(By.id("Gender"));
	return element;
}
public static WebElement datepicker_Dateofbirth(WebDriver driver){
	element = driver.findElement(By.id("DateOfBirth"));
	return element;
}
public static WebElement datepicker_DateofbirthYear(WebDriver driver){
	element = driver.findElement(By.xpath("//span[contains(text(),'2010')]"));
	return element;
}
public static WebElement datepicker_Dateofbirthmonth(WebDriver driver){
	element = driver.findElement(By.xpath("//span[contains(text(),'Jan')]"));
	return element;
}
public static WebElement datepicker_Dateofbirthdate(WebDriver driver){
	element = driver.findElement(By.xpath("//td[contains(text(),'7')]"));
	return element;
}
public static WebElement select_Nationality(WebDriver driver){
	element = driver.findElement(By.id("Nationality"));
	return element;
}
public static WebElement txtbox_State(WebDriver driver){
	element = driver.findElement(By.id("state"));
	return element;
}
public static WebElement txtbox_Mobile(WebDriver driver){
	element = driver.findElement(By.id("PhoneNo"));
	return element;
}
public static WebElement txtbox_Email(WebDriver driver){
	element = driver.findElement(By.id("Email"));
	return element;
}
public static WebElement txtbox_Passport(WebDriver driver){
	element = driver.findElement(By.id("PassportNumber"));
	return element;
}
public static WebElement datepicker_Passportvalidity(WebDriver driver){
	element = driver.findElement(By.id("passportvaliditydate"));
	return element;
}
public static WebElement datepicker_Passportyear(WebDriver driver){
	element = driver.findElement(By.xpath("//span[contains(text(),'2018')]"));
	return element;
}
public static WebElement datepicker_Passportmonth(WebDriver driver){
	element = driver.findElement(By.xpath("//span[contains(text(),'Jan')]"));
	return element;
}
public static WebElement datepicker_Passportdate(WebDriver driver){
	element = driver.findElement(By.xpath("//td[contains(text(),'8')]"));
	return element;
}
public static WebElement txtbox_Visanumber(WebDriver driver){
	element = driver.findElement(By.id("VisaNumber"));
	return element;
}
public static WebElement select_Visatype(WebDriver driver){
	element = driver.findElement(By.id("visatype"));
	return element;
}
public static WebElement datepicker_Visavalidity(WebDriver driver){
	element = driver.findElement(By.id("VisaValidityDate"));
	return element;
}
public static WebElement txtbox_visaissued(WebDriver driver){
	element = driver.findElement(By.id("visaissuedin"));
	return element;
}
public static WebElement txtbox_Purpose(WebDriver driver){
	element = driver.findElement(By.id("purposeofvisit"));
	return element;
}
public static WebElement input_Image(WebDriver driver){
	element = driver.findElement(By.id("input-id"));
	return element;
}
public static WebElement capture_Image(WebDriver driver){
	element = driver.findElement(By.id("btnCapture"));
	return element;
}
public static WebElement button_Snapshot(WebDriver driver){
	element = driver.findElement(By.id("btn2"));
	return element;
}
public static WebElement button_Savesnapshot(WebDriver driver){
	element = driver.findElement(By.id("saveImage"));
	return element;
}
public static WebElement button_Add(WebDriver driver){
	element = driver.findElement(By.xpath("//button[@value='Add to group']"));
	return element;
}
public static WebElement button_Save(WebDriver driver){
	element = driver.findElement(By.xpath("//button[@value='Save RAP']"));
	return element;
}
}
