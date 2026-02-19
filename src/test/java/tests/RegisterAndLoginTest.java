package tests;

import org.openqa.selenium.JavascriptExecutor;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.TestData;

public class RegisterAndLoginTest extends BaseTest {

    @Test
    public void registerAndLogin() {

        String email = TestData.generateEmail();
        String password = TestData.generatePassword();

        HomePage home = new HomePage(driver);
        home.clickSignupLogin();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='50%'");

        SignupLoginPage signup = new SignupLoginPage(driver);
        signup.signup(TestData.name, email);
        
        js.executeScript("document.body.style.zoom='50%'");

        RegistrationPage reg = new RegistrationPage(driver);
        reg.fillRegistrationForm(password);
        reg.fillAddressDetails(
                TestData.firstName,
                TestData.lastName,
                TestData.company,
                TestData.address1,
                TestData.address2,
                TestData.state,
                TestData.city,
                TestData.zipcode,
                TestData.mobile
        );
        reg.clickCreateAccount();

        js.executeScript("document.body.style.zoom='50%'");

        AccountCreatedPage created = new AccountCreatedPage(driver);
        Assert.assertEquals(created.getAccountCreatedMessage(), "ACCOUNT CREATED!");
        created.clickContinue();
        
        js.executeScript("document.body.style.zoom='50%'");

        HomePage home1 = new HomePage(driver);

        Assert.assertTrue(home1.getLoggedInUserText().contains("Logged in as"));
        home1.clickLogout();
        js.executeScript("document.body.style.zoom='50%'");
        
        home1.clickSignupLogin();
        
        js.executeScript("document.body.style.zoom='50%'");

        LoginPage login = new LoginPage(driver);
        login.login(email, password);

        Assert.assertTrue(home1.getLoggedInUserText().contains("Logged in as"));
    }
}
