package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test(testName = "verify login test")
    public void loginPageTest() {
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookiesNotification();
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickMyAccountButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUserName();
        loginPage.inputPassword();
        loginPage.clickLogInButton();
    }
}
