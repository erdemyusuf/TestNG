package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private Driver(){
    }

    static WebDriver driver;

    public static WebDriver getDriver(){

        /*

        testlerimizi calistirdigimizda her seferinde yeni driver olusur ve
        her test metodu icin yeni pencere acilir. eger driver a bir deger atanmamissa
        yani driver== null ise bir kere driver calistirmak icin if icinde yazariz

         */


        if(driver==null){
            switch (ConfigReader.getProperty("browser")){

              case "chrome":
                  WebDriverManager.chromedriver().setup();
                  driver = new ChromeDriver();
                  break;
             case "edge":
                 WebDriverManager.edgedriver().setup();
                 driver=new EdgeDriver();
                 break;
              case "firefox":
                  WebDriverManager.firefoxdriver().setup();
                  driver=new FirefoxDriver();
                  break;

              case "headless-chrome":
                  WebDriverManager.chromedriver().setup();
                  driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                  break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver; //void olmadigi icin return ettik.
    }

    public static void closeDriver(){
        if(driver!=null){       // driver a deger atanmissa
            driver.close();
            driver=null;       //
        }

    }

    public static void quitDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }

    }

}
