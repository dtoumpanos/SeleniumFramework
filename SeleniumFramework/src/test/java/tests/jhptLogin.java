package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.husimPhoneList;
import pages.jhptLoginPage;

public class jhptLogin {

	public static WebDriver driver = null;

	@BeforeTest 
		private static void setupTest() {
	
		// Setup and start Chrome in incognito mode with out proxy
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		//System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--no-proxy-server");
		options.addArguments("start-maximized");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	    driver = new ChromeDriver(capabilities);
		}
	    
	@Test
	   public void jhptLogin() {
    // Go to JHPT page
		driver.get("http://10.12.137.252:8090/jhptGui/husimPhoneList.jsf");
		
	// Click login button	
		pages.jhptLoginPage.loginButton(driver).click();
		
	//type 123456
		pages.jhptLoginPage.passwordBox(driver).sendKeys("123456");
		
	//press ENTER
		pages.jhptLoginPage.passwordBox(driver).sendKeys(Keys.RETURN);

	
		// StartPhone 0
		pages.husimPhoneList.dtPhoneList_0(driver).click();
		
		
		// Wait 0.5 seconds
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// StartPhone 1
		pages.husimPhoneList.dtPhoneList_1(driver).click();
		// Wait 0.5 seconds
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}

		// StartPhone 2
		pages.husimPhoneList.dtPhoneList_2(driver).click();
		
		//Wait 5 seconds		
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	// LogOut
		pages.husimPhoneList.logoffLink(driver).click();
	    }
		
		
   /* @AfterTest
        public void tearDownTest() { 
    	driver.close();
    	driver.quit();
    	System.out.println("Test Pass"); 
        } */

}
