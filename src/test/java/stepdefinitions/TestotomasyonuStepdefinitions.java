package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestotomasyonuStepdefinitions {

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Given("kullanici testotomasyonu sayfasina gider")
    public void kullanici_testotomasyonu_sayfasina_gider() {
        Driver.getDriver().get("https://www.testotomasyonu.com");
    }

    @When("arama kutusuna phone yazip aratir")
    public void arama_kutusuna_phone_yazip_aratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {
        String unexpectedSonucYazisi = "0 Products Found";
        String actualSonucYazisi = testotomasyonuPage.aramaSonucElementi.getText();

        Assertions.assertNotEquals(unexpectedSonucYazisi,actualSonucYazisi);
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();
    }

    @When("arama kutusuna dress yazip aratir")
    public void aramaKutusunaDressYazipAratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("dress" + Keys.ENTER);
    }

    @When("arama kutusuna java yazip aratir")
    public void arama_kutusuna_java_yazip_aratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("java" + Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @Then("arama sonucunda urun bulunamadigini test eder")
    public void arama_sonucunda_urun_bulunamadigini_test_eder() {

        String expectedSonucYazisi = "0 Products Found";
        String actualSonucYazisi = testotomasyonuPage.aramaSonucElementi.getText();

        Assertions.assertEquals(expectedSonucYazisi,actualSonucYazisi);
    }
}
