package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.Helpers;

public class Login {

	private WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	private By usernameLocator = By.id("email");
	private By passwordLocator = By.id("passwd");
	private By submitLocator = By.id("SubmitLogin");
	private By logoutButton = By.className("logout");
	

	public void populateUsername(String username) {
		driver.findElement(usernameLocator).sendKeys(username);
		
	}

	public void populatePassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}
	
	public void pressSubmitBtn() {
		driver.findElement(submitLocator).click();
	}
	
	public void loginWith(String username, String password) {
		populateUsername(username);
		populatePassword(password);
		pressSubmitBtn();
		
	}
	
	public void checkLogin() {
		
//		WebElement logoutBtn = driver.findElement(logoutButton);
//		Assert.assertTrue(logoutBtn.isDisplayed());
		Helpers.wait(driver, logoutButton, 20);
		
	}
}