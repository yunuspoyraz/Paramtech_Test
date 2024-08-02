package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class createAccountstepdefinitions extends ReusableMethods{

    @When("kullanıcı Ad girer")
    public void kullanıcı_ad_girer() {

        sendText(login.ad, ConfigReader.getPropertyValue("Ad"));
    }
    @When("kullanıcı Soyad girer")
    public void kullanıcı_soyad_girer() {

        sendText(login.soyad, ConfigReader.getPropertyValue("Soyad"));
    }
    @When("kullanıcı E-posta Adresi girer")
    public void kullanıcı_e_posta_adresi_girer() {

        sendText(login.Eposta, ConfigReader.getPropertyValue("yunuspoyrazqa@gmail.com"));
    }

    @When("kullanıcı Cep Telefonu Numarası girer")
    public void kullanıcı_cep_telefonu_numarası_girer() {

        sendText(login.GSMNumarası, ConfigReader.getPropertyValue("5454540665"));
    }
    @When("kullanıcı izinleri onaylar")
    public void kullanıcı_izinleri_onaylar() {

        click(login.checkBox1);
        click(login.checkBox2);
        click(login.checkBox3);
        click(login.checkBox4);
    }
    @When("kullanıcı devam butonuna tıklar")
    public void kullanıcı_devam_butonuna_tıklar() {

        click(login.devamButon);
    }
    @When("kullanıcı yanlıs Onay Kodu girer")
    public void kullanıcı_yanlıs_onay_kodu_girer() {

        sendText(login.onaykodu1,ConfigReader.getPropertyValue("OnayKodu1"));
        sendText(login.onaykodu1,ConfigReader.getPropertyValue("OnayKodu2"));
        sendText(login.onaykodu1,ConfigReader.getPropertyValue("OnayKodu3"));
        sendText(login.onaykodu1,ConfigReader.getPropertyValue("OnayKodu4"));
        sendText(login.onaykodu1,ConfigReader.getPropertyValue("OnayKodu5"));
        sendText(login.onaykodu1,ConfigReader.getPropertyValue("OnayKodu6"));

    }
    @Then("kullanıcı Hatalı onay kodu uyarısını dogrular")
    public void kullanıcıHatalıOnayKoduUyarısınıDogrular() {

        Assert.assertEquals(login.onayKodHataText.getText(),"Girdiğiniz onay kodu hatalıdır.");
    }


}
