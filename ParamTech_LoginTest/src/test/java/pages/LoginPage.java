package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utilities.ReusableMethods.driver;

public class LoginPage {
    @FindBy(xpath = "//*[.='Hoş Geldin!'])[2]")
    public WebElement HosGeldinText;

    @FindBy(xpath = "//input[@*='GSM, TCKN ya da Kart Numarası']")
    public WebElement userInfoBox;

    @FindBy(xpath = "//input[@*='Şifre']")
    public WebElement userPasswordBox;

    @FindBy(xpath = "//*[contains(text(),'Hatalı bilgi girişi yaptınız.')]")
    public WebElement hataliGirisMesaj;

    @FindBy(xpath = "(//*[.='Giriş Yap'])[2]")
    public WebElement girisYapButon2;

    @FindBy(xpath = "//*[.='Hesap Oluştur']")
    public WebElement hesapOlusturButon;

    @FindBy(xpath = "//*[@placeholder='Ad']")
    public WebElement ad;

    @FindBy(xpath = "//*[@placeholder='Soyad']")
    public WebElement soyad;

    @FindBy(xpath = "//*[@placeholder='E-Posta Adresi']")
    public WebElement Eposta;

    @FindBy(xpath = "//*[@placeholder='GSM Numarası']")
    public WebElement GSMNumarası;

    @FindBy(xpath = "//*[@name='checkBox1']")
    public WebElement checkBox1;

    @FindBy(xpath = "//*[@name='checkBox2']")
    public WebElement checkBox2;

    @FindBy(xpath = "//*[@name='checkBox3']")
    public WebElement checkBox3;

    @FindBy(xpath = "//*[@name='checkBox4']")
    public WebElement checkBox4;

    @FindBy(id = "continue_from_signup")
    public WebElement devamButon;

    @FindBy(xpath = "//*[@name='input1']")
    public WebElement onaykodu1;

    @FindBy(xpath = "//*[@name='input2']")
    public WebElement onaykodu2;

    @FindBy(xpath = "//*[@name='input3']")
    public WebElement onaykodu3;

    @FindBy(xpath = "//*[@name='input4']")
    public WebElement onaykodu4;

    @FindBy(xpath = "//*[@name='input5']")
    public WebElement onaykodu5;

    @FindBy(xpath = "//*[@name='input6']")
    public WebElement onaykodu6;

    @FindBy(id = "  continue_from_otp")
    public WebElement onaylaButon;

    @FindBy(xpath = "//*[contains(text(),'Girdiğiniz onay kodu hatalıdır.')]")
    public WebElement onayKodHataText;



    public LoginPage() {
        PageFactory.initElements(driver,this);
    }


}







