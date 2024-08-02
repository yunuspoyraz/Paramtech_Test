
  Feature: Login_test

    Background:Login sayfasına git
      Given kullanıcı url adresine gider
      When  kullanıcı Anasayfa Giris Yap butonuna tıklar
      And   kullanıcı Kurumsal Giris butonuna tıklar
      Then  kullanıcı login sayfasını dogrular


    Scenario: TC01_Müster_Login
      When kullanıcı yanlıs TCKN girer
      And  kullanıcı yanlıs sifre girer
      And kullanıcı Giris Yap butonuna tıklar
      Then kullanıcı Hatalı Giris validasyon uyarısını dogrular



    Scenario: TC02_Kullanıcı_Hesap_Olusturma
      When kullanıcı Ad girer
      And  kullanıcı Soyad girer
      And  kullanıcı E-posta Adresi girer
      And  kullanıcı Cep Telefonu Numarası girer
      And  kullanıcı izinleri onaylar
      And  kullanıcı devam butonuna tıklar
      And kullanıcı yanlıs Onay Kodu girer
      Then kullanıcı Hatalı onay kodu uyarısını dogrular





