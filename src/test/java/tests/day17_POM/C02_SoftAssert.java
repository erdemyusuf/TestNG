package tests.day17_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C02_SoftAssert extends TestBaseBeforeMethodAfterMethod {

    @Test (groups = "grup1")
    public void test01() {

        SoftAssert softAssert=new SoftAssert();

        /*
        Fail olan testlerin hepsini gorme imkani verir
        assertAll() metodunun oldugu yere kadar olan tum fail testleri gosterir
        bu metot sonrasi fail varsa gostermez

        Assert class static olmasina ragmen softAssert static degildir. bu yuzden obje olustururuz
         */

        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");

        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon1225"), "girilen kelimeyi icermiyor");

        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue( aramaKutusu.isEnabled(),"webelemente erisilemedi");

        //4-arama kutusuna Nuella yazıp aratın
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        //5-arama yapıldıgını test edin
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonuc.isDisplayed());

        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(sonuc.getText().contains("Nutellaaaa"),"icerik bulunamadi");
        softAssert.assertAll();


    }



}

