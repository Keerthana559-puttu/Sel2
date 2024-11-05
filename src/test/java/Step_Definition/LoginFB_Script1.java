package Step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFB_Script1 
{
	WebDriver driver;
	@Given("user open the testUrl")
	public void user_open_the_test_url() {
	    //System.out.println("User entered Url ");
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedrivernew.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("user enters valid email address {string}")
	public void user_enters_valid_email_address(String validUN) {
		//System.out.println("User entered valid Username "+validUN);
		driver.findElement(By.id("email")).sendKeys(validUN);
	}

	@When("user enters valid password {string}")
	public void user_enters_valid_password(String validPWD) {
		//System.out.println("User entered valid Password "+validPWD);
		driver.findElement(By.id("pass")).sendKeys(validPWD);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		//System.out.println("User clicked on Login button");
		driver.findElement(By.name("login")).click();
	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		System.out.println("User logged in successfully");
		
	}

	@When("user enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidUN) {
		//System.out.println("User entered invalid Username "+invalidUN);
		driver.findElement(By.id("email")).sendKeys(invalidUN);
	}

	@When("user enters invalid password {string}")
	public void user_enters_invalid_password(String invalidPWD) {
		//System.out.println("User entered invalid Password "+invalidPWD);
		driver.findElement(By.id("pass")).sendKeys(invalidPWD);
	}

	@Then("user should get warning message")
	public void user_should_get_warning_message() {
		System.out.println("User gets PLEASE ENTER VALID CREDENTIALS message ");
	}

	@When("user enters no credentials")
	public void user_enters_no_credentials() {
		System.out.println("User gets PLEASE ENTER CREDENTIALS message ");
	}

}
