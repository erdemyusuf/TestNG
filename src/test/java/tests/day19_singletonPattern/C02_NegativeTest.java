package tests.day19_singletonPattern;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_NegativeTest {
    @Test
    public void negatifTest() {
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));

        HmcPage hmcPage = new HmcPage();
        hmcPage.login.click();
        hmcPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPass"))
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya girileMEdigini test et
        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
        Driver.closeDriver();

    }
}
