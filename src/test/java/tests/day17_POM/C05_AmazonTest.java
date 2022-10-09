package tests.day17_POM;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C05_AmazonTest {
    @Test
    public void test01() {
        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get("https://amazon.com");
        amazonPage.aramaKutusu.sendKeys("nutella", Keys.ENTER);
        Driver.closeDriver();


    }
}
