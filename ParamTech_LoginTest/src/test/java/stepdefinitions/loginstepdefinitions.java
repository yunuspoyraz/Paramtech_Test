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

public class loginstepdefinitions extends ReusableMethods {



        @Given("kullanıcı url adresine gider")
        public void kullanıcıUrlAdresineGider() {

        openBrowserAndLauchApplication();
        }

        @When("kullanıcı Anasayfa Giris Yap butonuna tıklar")
        public void kullanıcı_anasayfa_giris_yap_butonuna_tıklar() {

        click(home.girisYapButon1);
        }

        @When("kullanıcı Kurumsal Giris butonuna tıklar")
        public void kullanıcı_kurumsal_giris_butonuna_tıklar() {

            click(createAccount.kurumsalGirisButon);
        }
        @Then("kullanıcı login sayfasını dogrular")
        public void kullanıcı_login_sayfasını_dogrular() {

            Assert.assertEquals(login.HosGeldinText,"Hoş Geldin!");
        }
        @When("kullanıcı yanlıs TCKN girer")
        public void kullanıcı_void_yanlıs_TCKN_girer() {

            sendText(login.userInfoBox, ConfigReader.getPropertyValue("TCKN"));
        }

        @When("kullanıcı yanlıs sifre girer")
        public void kullanıcı_yanlıs_sifre_girer() {

            sendText(login.userPasswordBox, ConfigReader.getPropertyValue("sifre"));
        }

        @When("kullanıcı Giris Yap butonuna tıklar")
        public void kullanıcı_giris_yap_butonuna_tıklar() {

            click(login.girisYapButon2);
        }

        @Then("kullanıcı Hatalı Giris validasyon uyarısını dogrular")
        public void kullanıcıHatalıGirisValidasyonUyarısınıDogrular() {

            Assert.assertEquals(login.hataliGirisMesaj.getText(),"Hatalı bilgi girişi yaptınız. Lütfen bilgilerinizi kontrol ediniz.");

        }
}


