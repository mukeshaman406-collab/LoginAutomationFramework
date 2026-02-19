package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By signupLoginBtn = By.linkText("Signup / Login");
    private By loggedInUser = By.xpath("//a[contains(text(),'Logged in as')]");
    private By logoutBtn = By.xpath("//a[contains(text(),'Logout')]");

    public void clickSignupLogin() {
        driver.findElement(signupLoginBtn).click();
    }

    public String getLoggedInUserText() {
        return driver.findElement(loggedInUser).getText();
    }
    
    public void clickLogout() {
        driver.findElement(logoutBtn).click();
    }

}
