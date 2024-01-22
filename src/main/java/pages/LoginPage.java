package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@name='username']")
    WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    @FindBy(xpath = "//span[contains(text(),'Intră în cont')]")
    WebElement logIn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputUserName() {
        waitForElement(username);
        username.sendKeys(Constants.EMAIL);
    }

    public void inputPassword() {
        password.sendKeys(Constants.PASSWORD);
    }

    public void clickLogInButton() {
        logIn.click();
    }
}
