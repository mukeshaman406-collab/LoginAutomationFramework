package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginPage {

    WebDriver driver;

    public SignupLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By nameField = By.name("name");
    private By signupEmailField = By.xpath("//input[@data-qa='signup-email']");
    private By signupBtn = By.xpath("//button[@data-qa='signup-button']");

    public void signup(String name, String email) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(signupEmailField).sendKeys(email);
        driver.findElement(signupBtn).click();
    }
}
