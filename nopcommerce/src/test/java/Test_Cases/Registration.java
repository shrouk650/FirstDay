package Test_Cases;

import static org.testng.AssertJUnit.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import nopcommerce.registration_Page;

public class Registration extends TestBase{
	
	 
	
	@Test(priority = 1)
	public void Login_button() throws InterruptedException {
		registration_Page  button = new registration_Page(driver);
		button.Registartion_Button().click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		assertTrue(URL.contains("https://demo.nopcommerce.com/register?returnUrl=%2F"));

	}
	@Test(priority = 2)
	public void Vaild_Data() throws IOException, InterruptedException{
		registration_Page data = new registration_Page(driver);
		data.Gender(prop.get_property("Gender")).click();
		data.Enter_FirstName().sendKeys(prop.get_property("Firstname"));
		data.Enter_LastName().sendKeys(prop.get_property("Lastname"));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		data.Enter_Email().sendKeys(prop.get_property("Email"));
		Thread.sleep(2000);
		
		
	}
}
