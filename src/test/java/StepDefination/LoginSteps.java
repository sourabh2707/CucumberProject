package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.login_page;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	public static WebDriver driver;
    login_page lp=new login_page( driver);


	@Given("user should be on the login page")
	public void user_should_be_on_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_valid_credentials(String user, String pass) {
		lp.credentials(user,pass);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		lp.click();
	}

	@Then("user should be navigated to the home page")
	public void user_should_be_navigated_to_the_home_page() {
		System.out.println("User is on Home Page");
		String abc = driver.getPageSource();
		String xyz = "Dashboard";

		if (abc.contains(xyz)) {

			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}
		
		driver.quit();
	}

}
