package pageobject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {
	
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		}	catch (Exception e) {}
	}
		
		
	public static void sleepMe(int timee, WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		

	public static void wait(WebDriver driver, By by, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		
	}
	

}
