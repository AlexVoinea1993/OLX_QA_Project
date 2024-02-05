package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends BasePage {
    @FindBy(xpath = "//button[contains(text(),'Accept')]")
    WebElement cookies;
    @FindBy(xpath = "//span[@class='css-1kpgv52']")
    WebElement logo;
    @FindBy(css = "div[data-testid='home-categories-menu-row'] img")
    List<WebElement> categories;
    @FindBy(xpath = "(//span[@class='css-xu7uwr'])[1]")
    WebElement carsOrMotorCycles;
    @FindBy(xpath = "//span[contains(text(),'Autoturisme')]")
    WebElement cars;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookiesNotification() {
        waitForElement(cookies);
        cookies.click();
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    public String getLogoColor() {
        return logo.getCssValue("color");
    }

    public int getCategoriesNumber() {
        return categories.size();
    }

    public void clickCarsOrMotorCyclesOption() {
        carsOrMotorCycles.click();
    }

    public void clickCarsOption() {
        cars.click();
    }
}
