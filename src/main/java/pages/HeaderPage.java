package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage{
    @FindBy(xpath = "//a[contains(text(),'Contul tău')]")
    WebElement myAccount;
    public HeaderPage(WebDriver driver) {
        super(driver);
    }
    public void clickMyAccountButton() {
        myAccount.click();
    }
}
