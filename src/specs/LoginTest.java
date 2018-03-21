package specs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobject.Header;
import pageobject.Helpers;
import pageobject.Home;
import pageobject.Login;

//import static org.junit.Assert.*;

//import java.util.concurrent.TimeUnit;

import org.junit.*;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest {
	private static WebDriver driver;
	public static WebDriverWait wait; //explicit wait

	@BeforeClass
	public static void suiteSetup() {
		System.setProperty("webdriver.chrome.driver", "d:\\Automation\\workshop_web_automation\\kit\\chromedriver.exe");
	}
	
	@Before
	public void testSetup() {
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Home homePage = new Home(driver);
		homePage.pressSignIn();
	}
	


	@Test
	public void loginWithSuccess() {
		
		Login loginPage = new Login(driver);
		Helpers.sleep(5000);
		loginPage.loginWith("johnsnow@workshop.com", "iknoweverything");
		Helpers.sleep(5000);

		Header headerPage = new Header(driver);
		headerPage.checkUserLogged("John Snow");
//		loginPage.checkLogin();
		
	}
	
	

	@AfterClass
	public static void tearDownSuite() {
		driver.close();
	}
}
