package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Register {
	
	private static WebDriver driver;

	@SuppressWarnings("static-access")
	public Register(WebDriver driver) { 
		this.driver = driver;
	}
	
	private By emailLocator = By.id("email_create");
	private By createAccount = By.id("SubmitCreate");
	private By firstName = By.xpath("//*[@id=\"customer_firstname\"]");
	private By lastName = By.id("customer_lastname");
	private By email = By.id("email");
	private By password = By.id("passwd");
	private By day = By.name("days");
	private By month = By.name("months");
	private By year = By.name("years");
	private By selectMr = By.id("id_gender1");
	private By selectMrs = By.id("ig_gender2");
	private By firstCheck = By.name("newsletter");
	
			
	
	public void enterEmail(String email) {
		driver.findElement(emailLocator).sendKeys(email);
	}

	public void pressCreateAccount() {
		driver.findElement(createAccount).click();
	}
	
	public void createAccount(String email) {
		enterEmail(email);
		Helpers.sleep(5000);
		pressCreateAccount();
	}

	
	
// select separate Mr and Mrs--------------------------------------------------- 
	
	public void selectMr() {
		driver.findElement(selectMr).click();
	}
	
	public void selectMrs() {
		driver.findElement(selectMrs).click();
	}

//select separate Mr and Mrs-----------------------------------------------------

	public void createFirstName(String name) {
		driver.findElement(firstName).sendKeys(name);
		
	}
	
	public void createLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);
		
	}
	
	public void createEmail(String setEmail) {
		driver.findElement(email).sendKeys(setEmail);
		
	}
	
	public void createPassword(String setPwd) {
		driver.findElement(password).sendKeys(setPwd);
	}
	
//select date________________________________________________
	
	public void selectDay(String sday) {
		Select sd = new Select(driver.findElement(day));
		sd.selectByValue(sday);
	}

	public void selectMonth(String smonth) {
		Select sd = new Select(driver.findElement(month));
		sd.selectByValue(smonth);
	}
	
	public void selectYear(String syear) {
		Select sd = new Select(driver.findElement(year));
		sd.selectByValue(syear);
	}
	
	public void selectDate(String sday, String smonth, String syear){
		selectDay(sday);
		selectMonth(smonth);
		selectYear(syear);
		
	}


//select date_______________________________________________		

	
	public void enterCredentials(String name, String lname, String setEmail, String setPwd) {
		createFirstName(name);
		createLastName(lname);
		createEmail(setEmail);
		createPassword(setPwd);
		
	}
	
//checking if the checkbox is selected	
	
	public void checkNewsletterCheckbox() {
		WebElement cb = driver.findElement(firstCheck);
		boolean x;
		x = ((WebElement) cb).isSelected();
//		x = true;
		
		if(x == false) {
			cb.click();	
		}
		else {
			System.out.print("Already checked");
			
		}
				
					
		Helpers.sleep(3000);		
		}
		
	}




