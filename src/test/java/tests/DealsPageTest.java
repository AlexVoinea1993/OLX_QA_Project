package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DealsPage;
import pages.HomePage;
import utils.Constants;
import utils.Errors;

public class DealsPageTest extends BaseTest {

    @Test(testName = "filters test review")
    public void filtersTest() {
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookiesNotification();
        Assert.assertTrue(homePage.isLogoDisplayed(), Errors.LOGO_NOT_DISPLAYED);
        Assert.assertEquals(homePage.getLogoColor(), Constants.LIGHT_BLUE_COLOR, Errors.LOGO_COLOR_NOT_CORRECT);
        Assert.assertEquals(homePage.getCategoriesNumber(), 22, Errors.NUMBER_OF_CATEGORIES_NOT_CORRECT);
        homePage.clickCarsOrMotorCyclesOption();
        homePage.clickCarsOption();
        DealsPage dealsPage = new DealsPage(driver);
        dealsPage.clickCloseNotification();
        dealsPage.clickSubCategoriesTab();
        dealsPage.vehicleSelection();
        dealsPage.clickModelTab();
        dealsPage.modelSelection();
        dealsPage.clickBodyTypeTab();
        dealsPage.clickSuvOption();
        if (dealsPage.isSecondNotificationDisplayed()){
            dealsPage.clickSecondNotificationCloseButton();
        }
    }
}
