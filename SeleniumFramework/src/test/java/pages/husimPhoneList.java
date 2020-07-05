package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class husimPhoneList {
	
	
	private static WebElement element = null;

	public static WebElement logoffLink (WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id=\"logoffLink\"]"));
		return element;
	}

	public static WebElement dtPhoneList_0(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[@id='tabViewPhoneVads:dtPhoneList:0:ViewPhone']"));
		return element;
	}

	public static WebElement dtPhoneList_1(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[@id='tabViewPhoneVads:dtPhoneList:1:ViewPhone']"));
		return element;
	}

	public static WebElement dtPhoneList_2(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[@id='tabViewPhoneVads:dtPhoneList:2:ViewPhone']"));
		return element;

	}

}
