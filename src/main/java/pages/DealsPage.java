package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DealsPage extends BasePage {
    @FindBy(xpath = "(//div[@class='css-t0lbh8'])[6]")
    WebElement subCategory;

    public DealsPage(WebDriver driver) {
        super(driver);
    }

    public void clickSubCategoriesTab() {
        subCategory.click();
        Select select = new Select(subCategory);
        select.selectByIndex(205);
    }
}
