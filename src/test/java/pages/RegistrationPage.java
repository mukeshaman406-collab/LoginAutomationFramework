package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    private By gender = By.id("id_gender1");
    private By password = By.id("password");
    private By days = By.id("days");
    private By months = By.id("months");
    private By years = By.id("years");
    private By newsletter = By.id("newsletter");
    private By optin = By.id("optin");

    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By company = By.id("company");
    private By address1 = By.id("address1");
    private By address2 = By.id("address2");
    private By country = By.id("country");
    private By state = By.id("state");
    private By city = By.id("city");
    private By zipcode = By.id("zipcode");
    private By mobile = By.id("mobile_number");

    private By createAccountBtn = By.xpath("//button[@data-qa='create-account']");

    public void fillRegistrationForm(String passwordValue) {

        driver.findElement(gender).click();
        driver.findElement(password).sendKeys(passwordValue);

        new Select(driver.findElement(days)).selectByIndex(24);
        new Select(driver.findElement(months)).selectByIndex(8);
        new Select(driver.findElement(years)).selectByIndex(22);

        driver.findElement(newsletter).click();
        driver.findElement(optin).click();
    }

    public void fillAddressDetails(String fName, String lName, String comp,
                                   String addr1, String addr2,
                                   String stateVal, String cityVal,
                                   String zip, String mob) {

        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(company).sendKeys(comp);
        driver.findElement(address1).sendKeys(addr1);
        driver.findElement(address2).sendKeys(addr2);

        new Select(driver.findElement(country)).selectByVisibleText("India");

        driver.findElement(state).sendKeys(stateVal);
        driver.findElement(city).sendKeys(cityVal);
        driver.findElement(zipcode).sendKeys(zip);
        driver.findElement(mobile).sendKeys(mob);
    }

    public void clickCreateAccount() {
        driver.findElement(createAccountBtn).click();
    }
}
