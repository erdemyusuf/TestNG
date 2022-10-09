package tests.practice07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {

    // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
   // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
   //Tüm yapılacakların üzerini çiz.
   //Tüm yapılacakları sil.
   //Tüm yapılacakların silindiğini doğrulayın.


    @Test
    public void test01() {
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        WebUniversityPage webUniversityPage=new WebUniversityPage();
        List<String> workList=new ArrayList<>(Arrays.asList("Kahvaltıyı hazırla", "Bulaşıkları yıka", "Bebekle ilgilen", "Çocuğunun ödevine yardım et", "Selenyum çalış"," Uyu"));
            /*
             Arrays.asList() metodu tek tek add yapmak yerine toplu gondermek icindir
             List olusturma nedenimiz yapılacakları toplu olarak loop ile gondermek icindir
            */

        Actions actions=new Actions(Driver.getDriver());
        for (String w:workList ) {
            actions.click(webUniversityPage.addNewTodo).sendKeys(w).sendKeys(Keys.ENTER).perform();
        }

        //Tüm yapılacakların üzerini çiz.
        List<WebElement> todos=webUniversityPage.todosWebElement;
        for (WebElement w:todos) {
            w.click();
        }

        //Tüm yapılacakları sil.
        List<WebElement> deleteButtons =webUniversityPage.deleteButtonsWebElement;
        for (WebElement w:deleteButtons) {
            w.click();

        }

        //Tüm yapılacakların silindiğini doğrulayın.
        Assert.assertTrue(webUniversityPage.todo.isDisplayed());

        Driver.closeDriver();



    }
}
