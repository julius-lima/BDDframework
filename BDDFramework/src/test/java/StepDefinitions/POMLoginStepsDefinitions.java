package StepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginPage;


public class POMLoginStepsDefinitions {
	static WebDriver driver;
	loginPage login;
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1/");
		
	}

	
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) throws InterruptedException {
		
		login = new loginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
		
		
		//driver.findElement(By.id("user-name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(passaword);
		//Thread.sleep(2000);

	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {
		
		login.clickLogin();

		//driver.findElement(By.id("login-button")).click();

	}

	@Then("User is navegated to Home Page")
	public void user_is_navegated_to_home_page() {
		
		login.isLogoDisplayed();
		
		/*org.testng.Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size() >// 0,
		  "o usuário direcionado para a página inicial");*/

	}

	@And("Close the Browser")
	public void close_the_browser() {
		
		driver.close();
		
	}

}
