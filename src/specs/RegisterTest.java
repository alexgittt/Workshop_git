package specs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobject.Helpers;
import pageobject.Home;
import pageobject.Register;

//import static org.junit.Assert.*;

//import java.util.concurrent.TimeUnit;

import org.junit.*;

public class RegisterTest {
	
	private static WebDriver driver;
	public static WebDriverWait wait; //explicit wait

	@BeforeClass
	public static void suiteSetup() {
		System.setProperty("webdriver.chrome.driver", "d:\\Automation\\workshop_web_automation\\kit\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Before
	public void testSetup() {
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Home homePage = new Home(driver);
		homePage.pressSignIn();
	}
	
	
	
	@Test
	public void registerWithSuccess() {
		
		Register registerPage = new Register(driver);
		registerPage.createAccount("example@workshop.com");
		Helpers.sleep(3000);
		registerPage.selectMr();
		registerPage.enterCredentials("sds", "sds", "sdsds", "sdsds");
		Helpers.sleep(3000);
		registerPage.selectDate("7", "3", "2018");
		Helpers.sleep(3000);
		registerPage.checkNewsletterCheckbox();
		Helpers.sleep(3000);
	}
	
	@AfterClass
	public static void tearDownSuite() {
		driver.close();
	}
	
}
