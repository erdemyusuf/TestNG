package tests.day20_smoke_E2E;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_SmokePozitifTest {
    @Test
    public void pozitifTest() {

        //https://www.hotelmycamp.com/ adresine git  login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));

        HmcPage hmcPage = new HmcPage();
        /*Page class'ındaki locate'lerimize ulaşabilmek için
        Page classımızdan bir obje oluşturarak, oluşturmuş olduğumuz obje ile
        page classımızdaki locate'lerimize ulaşabiliriz
         */

        hmcPage.login.click();

        //test data username: manager ,
        //test data password : Manager1!
        hmcPage.userName.sendKeys(ConfigReader.getProperty("userName"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password"))
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya BASARILI sekilde girilebildigini test et
        Assert.assertTrue(hmcPage.girisYapildi.isDisplayed());
        Driver.closeDriver();
    }
}
