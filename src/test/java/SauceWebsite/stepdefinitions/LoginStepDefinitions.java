package SauceWebsite.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import static org.junit.Assert.assertTrue;

public class LoginStepDefinitions {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @When("the user enters valid username and password")
    public void userEntersValidCredentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @When("clicks the login button")
    public void userClicksLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("the user should be logged in successfully")
    public void userLoggedInSuccessfully() {
        // You can add assertions here to verify successful login.
        assertTrue(driver.getCurrentUrl().contains("/inventory.html"));
    }
    @When("the user adds the backpack to the cart")
    public void addToCartBackpack() {
        loginPage.clickAddToCartForBackpack();
    }

    @When("the user clicks on the cart")
    public void clickCart() {
        loginPage.clickCartButton();
    }

    @When("the user clicks on the finish button")
    public void clickFinishButton() {
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Zahid");
        driver.findElement(By.id("last-name")).sendKeys("Ismail");
        driver.findElement(By.id("postal-code")).sendKeys("75050");
        driver.findElement(By.id("continue")).click();
        loginPage.clickFinishButton();
    }

    @Then("the user should see the purchase confirmation")
    public void verifyPurchaseConfirmation() {
        assertTrue(driver.getCurrentUrl().contains("/checkout-complete.html"));
        driver.quit();
    }
}
