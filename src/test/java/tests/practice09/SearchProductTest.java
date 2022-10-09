package tests.practice09;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchProductPage;
import utilities.Driver;

public class SearchProductTest {

    SearchProductPage searchProductPage;

    @Test
    public void searchProductPage() {


        // 1. Tarayıcıyı başlat
        // 2. 'https://automationexercise.com/' url'sine gidin
        Driver.getDriver().get("https://automationexercise.com/");

        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String expectedUrl="https://automationexercise.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        // 4. 'Ürünler' butonuna tıklayın
        searchProductPage=new SearchProductPage();
        searchProductPage.products.click();

        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        Assert.assertTrue(searchProductPage.allProductsText.isDisplayed());
        /* 2. yol
        String productPageUrl="https://automationexercise.com/products";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),productPageUrl);
        */

        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        searchProductPage.searchBox.sendKeys("blue top");
        searchProductPage.searchButton.click();

        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        Assert.assertTrue(searchProductPage.searchVerify.isDisplayed());

        // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
        Assert.assertTrue(searchProductPage.blueTop.isDisplayed());


    }
}
