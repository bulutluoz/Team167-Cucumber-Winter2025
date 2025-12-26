
  Feature: US1001 Testotomasyonu arama testleri

    Scenario: TC01 phone arama testi
      Given kullanici testotomasyonu sayfasina gider
      When arama kutusuna phone yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir



      Scenario: TC02 dress arama testi
        Given kullanici testotomasyonu sayfasina gider
        When arama kutusuna dress yazip aratir
        Then arama sonucunda urun bulunabildigini test eder
        And sayfayi kapatir

       Scenario: TC03 java arama testi
         Given kullanici testotomasyonu sayfasina gider
         When arama kutusuna java yazip aratir
         Then arama sonucunda urun bulunamadigini test eder
         And sayfayi kapatir

