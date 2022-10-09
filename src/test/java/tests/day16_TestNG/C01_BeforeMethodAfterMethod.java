package tests.day16_TestNG;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {

    // TestNG framework'unde @Before ve @After notasyonları yerine @BeforeMethod ve @AfterMethod kullanılır
    //Çalışma prensibi JUnit deki Before,After ile aynıdır


    @Test
    public void amazonTesti() {
        driver.get("https://amazon.com");

    }

    @Test (groups = "grup1")
    public void bestbuyTesti() {
        driver.get("https://bestbuy.com");
    }

    @Test
    public void youtubeTesti() {
        driver.get("https://youtube.com");
    }



}