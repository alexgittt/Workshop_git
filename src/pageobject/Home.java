package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
	private WebDriver driver;

	private By signInLocator = By.className("login");

	public Home(WebDriver driver) {
		this.driver = driver;
	}

	public void pressSignIn() {
		driver.findElement(signInLocator).click();
	}
	
	

}
