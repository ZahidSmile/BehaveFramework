package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    // Locators
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By backpackAddToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private By cartButton = By.id("shopping_cart_container");
    private By finishButton = By.id("finish");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        WebElement usernameInput = driver.findElement(usernameField);
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordField);
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginBtn = driver.findElement(loginButton);
        loginBtn.click();
    }
    public void clickAddToCartForBackpack() {
        WebElement addToCartButton = driver.findElement(backpackAddToCartButton);
        addToCartButton.click();
    }

    public void clickCartButton() {
        WebElement cartButtonElement = driver.findElement(cartButton);
        cartButtonElement.click();
    }

    public void clickFinishButton() {
        WebElement finishButtonElement = driver.findElement(finishButton);
        finishButtonElement.click();
    }
}
