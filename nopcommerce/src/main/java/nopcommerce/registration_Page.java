package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registration_Page {
	WebDriver driver;

	public registration_Page(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement Registartion_Button() {
		return (driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")));
	}
	
	public WebElement Gender(String value) {
		return (driver.findElement(By.xpath("(//input[@type=\"radio\"])["+value+"]")));
	} 

	public WebElement Enter_FirstName() {
		return (driver.findElement(By.id("FirstName")));
	}

	public WebElement Enter_LastName() {
		return (driver.findElement(By.id("LastName")));
	}

	public WebElement Enter_Email() {
		return (driver.findElement(By.id("Email")));
	}

	
}
