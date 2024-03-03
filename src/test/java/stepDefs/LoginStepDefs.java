package stepDefs;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

	WebDriver driver = BaseClass.driver;

	@Given("I have launched the app URL")
	public void i_have_launched_the_app_url() {
		driver.get("https://www.simplilearn.com/");

	}

	@And("I click on the Login link")
	public void i_click_on_the_Login_link() {
		WebElement loginLink = driver.findElement(By.className("login"));
		loginLink.click();

	}

	@And("I enter the username")
	public void i_enter_the_username() {
		WebElement userName = driver.findElement(By.className("email"));
		userName.sendKeys("Abc@xyz.com");

	}

	@And("I enter the password")
	public void i_enter_the_password() {
		// Write code here that turns the phrase above into concrete actions

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Abc@1234");

	}

	@And("I click on the login button")
	public void i_click_on_the_login_button() {

		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}

	@Then("I should land to the home page")
	public void i_should_land_to_the_home_page() {

	}

//Scenario Outline: Validate Login failure scenario using data parameters
	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String userNameVal) {
		WebElement userName = driver.findElement(By.className("email"));
		userName.sendKeys(userNameVal);

	}

	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String passwordVal) {
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(passwordVal);

	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String message) {
		WebElement Error = driver.findElement(By.className("error_msg"));
		Assert.assertEquals(Error.getText(), message);
	}

	@Then("I should see below login options on the screen")
	public void i_should_see_below_login_options_on_the_screen(List<String> Options) {
		// Write code here that turns the phrase above into concrete actions

		for (String option : Options) {

			WebElement LoginOption = driver.findElement(By.xpath("//button[@data-clickedtype='" + option + "']"));
			Assert.assertTrue(LoginOption.isDisplayed());
		}
	}
}