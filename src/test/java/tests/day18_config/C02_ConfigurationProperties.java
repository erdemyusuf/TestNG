package tests.day18_config;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {

    @Test
    public void test01() {
        String url=ConfigReader.getProperty("amazonUrl");
        Driver.getDriver().get(url);

        String url1=ConfigReader.getProperty("faceUrl");
        Driver.getDriver().get(url1);

        Driver.closeDriver();

    }
}
