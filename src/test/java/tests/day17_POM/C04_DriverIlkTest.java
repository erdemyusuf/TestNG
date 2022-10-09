package tests.day17_POM;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_DriverIlkTest {
    @Test
    public void test01() {

        /*
        Testbase class tan extends ederek kullanilan driver yerine Driver class ta olusturdugumuz
         static getDriver() metodu kullaniriz

         driver               OUT
         Driver.getDriver()   IN

         */

        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://bestbuy.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://hepsiburada.com");
        Driver.closeDriver();
    }
}
