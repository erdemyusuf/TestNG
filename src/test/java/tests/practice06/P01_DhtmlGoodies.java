package tests.practice06;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class P01_DhtmlGoodies {

    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.


    @Test
    public void test01() {
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        DhtmlGoodiesPage dhtmlgoodiesPage=new DhtmlGoodiesPage();

        Actions actions=new Actions(Driver.getDriver());
        actions.
            dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.southKorea).
            dragAndDrop(dhtmlgoodiesPage.copenhagen, dhtmlgoodiesPage.denmark).
            dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.norway).
            dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy).
            dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.unitedStates).
            dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).
            dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.sweeden).
        perform();

        Driver.closeDriver();

        /*
        Framework ler buyudukce yeni class lar,  methodlar, webelementler olusturdukca kompleks hale gelir
        maintainable-surdurulebilir, reusable, faster, anlasilabilir bir framework icin bir design pattern olarak POM olusturumustur.
        temelde 3 package icerir : tests, pages, utilities(driver)

         */




    }
}
