package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class jhptLoginPage {
	
	
	private static WebElement element = null;
	
	
	public static WebElement loginButton (WebDriver driver) {
		
		element = driver.findElement(By.xpath("//a[@id='loginLink']"));
		return element;
		
	}
	
	public static WebElement passwordBox (WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@id='inputAdminPassword']"));
		return element;
		
	}
	
	public static WebElement okButton (WebDriver driver) {
		
		element = driver.findElement(By.xpath("//span[contains(text(),'Ok')]"));
		return element;
		
	}


}

