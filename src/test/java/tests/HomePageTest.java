package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Constants;
import utils.Errors;

public class HomePageTest extends BaseTest {

//  Tema: Intru pe site: click pe auto,moto,si ambarcatiuni click iar pe autoturisme, click pe subcategorie
//  Suzuki, aleg modelul Vitara, caroserie off-road, pret de la 5000, 20.000, an de fabricatie 2015 - 2020,
//  rulaj km de la 50,000 la 300,000, combustibil benzina, cutie de viteze automata, capacitate cilindrica
//  de la 1500 - 3000 cmc, putere CP: de la 200, la 500, culoare gri, volan stanga, stare utilizat, salveaza
//  cautarea, bifeaza doar cu poze. Ultimul este: (assert cate rezultate au ramas)


    @Test(testName = "verify home page")
    public void homePageTest() {
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookiesNotification();
        Assert.assertTrue(homePage.isLogoDisplayed(), Errors.LOGO_NOT_DISPLAYED);
        Assert.assertEquals(homePage.getLogoColor(), Constants.LIGHT_BLUE_COLOR, Errors.LOGO_COLOR_NOT_CORRECT);
        Assert.assertEquals(homePage.getCategoriesNumber(), 22, Errors.NUMBER_OF_CATEGORIES_NOT_CORRECT);
        homePage.clickCarsOrMotorCyclesOption();
        homePage.clickCarsOption();
    }
}
