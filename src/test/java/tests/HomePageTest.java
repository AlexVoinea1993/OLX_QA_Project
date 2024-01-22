package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Constants;
import utils.Errors;

public class HomePageTest extends BaseTest {

    @Test(testName = "verify home page")
    public void homePageTest() {
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookiesNotification();
        Assert.assertTrue(homePage.isLogoDisplayed(), Errors.LOGO_NOT_DISPLAYED);
        Assert.assertEquals(homePage.getLogoColor(), Constants.LIGHT_BLUE_COLOR, Errors.LOGO_COLOR_NOT_CORRECT);
        Assert.assertEquals(homePage.getCategoriesNumber(), 21, Errors.NUMBER_OF_CATEGORIES_NOT_CORRECT);
        homePage.clickCarsOrMotorCyclesOption();
        homePage.clickCarsOption();
        homePage.scrollDownPage();
    }
}
