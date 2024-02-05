package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DealsPage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Nu, merci')]")
    WebElement close1;
    @FindBy(xpath = "//div[@class='css-12snx2d']")
    WebElement subCategoriesTab;
    @FindBy(css = "li[data-categoryid='205']")
    WebElement suzuki;
    @FindBy(xpath = "(//div[@data-testid='dropdown-head'])[1]")
    WebElement model;
    @FindBy(xpath = "(//p[contains(text(),'Vitara')])[2]")
    WebElement vitara;
    @FindBy(xpath = "(//div[@class='css-t0lbh8'])[8]")
    WebElement bodyType;
    @FindBy(xpath = "(//div[@class='css-1r7x5tm'])[11]")
    WebElement suv;
    @FindBy(xpath = "//button[contains(text(),'Nu, mulțumesc')]")
    WebElement close2;


    public DealsPage(WebDriver driver) {
        super(driver);
    }

    public void clickCloseNotification() {
        waitInSeconds(2);
        if (isNotificationDisplayed()) {
            close1.click();
        }
    }

    public void clickSubCategoriesTab() {
        waitInSeconds(2);
        waitForElement(subCategoriesTab);
        scrollToElement(subCategoriesTab);
        scrollUpOrDownPage(-200);
        subCategoriesTab.click();
    }

    public boolean isNotificationDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(close1));
            return close1.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void vehicleSelection() {
        suzuki.click();
    }

    public void clickModelTab() {
        model.click();
    }

    public void modelSelection() {
        vitara.click();
    }

    public void clickBodyTypeTab() {
        bodyType.click();
    }

    public void clickSuvOption() {
        suv.click();
    }

    public boolean isSecondNotificationDisplayed() {
        try {
            if (close2.isDisplayed())
                return true;

        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public void clickSecondNotificationCloseButton() {
        close2.click();
    }

    public void scrollToTheTopOfThePage() {
        scrollUpOrDownPage(-1000);
    }
}

