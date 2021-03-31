import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasketPage;
import pages.HomePage;
import pages.ProductList;

import static org.testng.Assert.*;

public class AddBasketTests extends BaseTest{

    @Test
    public void succesfulAddToBasket(){
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        ProductList productList =  homePage.goToTvDisplayAndSound();
        productList.addToBasketFirstProduct();
        String productTitle = productList.getFirstProductTitle();
        BasketPage basketPage = productList.clickBasket();
        String productTitleInBasket = basketPage.getProductTitleInBasket();
        assertTrue(productTitleInBasket.contains(productTitle));
        assertTrue(productTitleInBasket.contains(productTitle));
        //assertEquals(By.className("pb-basket-item-actions"),1 );




    }
}
