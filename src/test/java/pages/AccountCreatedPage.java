package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreatedPage {

    WebDriver driver;

    public AccountCreatedPage(WebDriver driver) {
        this.driver = driver;
    }

    private By accountCreatedMsg = By.xpath("//h2[@data-qa='account-created']");
    private By continueBtn = By.xpath("//a[@data-qa='continue-button']");

    public String getAccountCreatedMessage() {
        return driver.findElement(accountCreatedMsg).getText();
    }

    public void clickContinue() {
        driver.findElement(continueBtn).click();
    }
}
