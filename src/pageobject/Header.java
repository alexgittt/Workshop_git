package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Header {
	
	
	private WebDriver driver;

	private By logoutButton = By.className("logout");
	private By userAcc = By.className("account");
	
	@SuppressWarnings("unused")
	private Helpers Helpers = new Helpers();
	
	public Header(WebDriver driver) {
		this.driver = driver;
	}
	
	public void signOut() {
		pageobject.Helpers.wait(driver, logoutButton, 10);
		driver.findElement(logoutButton).click();
	}
	
	
	
	public void checkUserLogged(String username) {
		driver.findElement(userAcc);
		
		Assert.assertTrue(driver.findElement(userAcc).isDisplayed());
		Assert.assertEquals(username, driver.findElement(userAcc).getText());
	}

}
