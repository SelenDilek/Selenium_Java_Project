package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {

        //oop WebDriver:Interface,Parent,class       ChromeDriver,FirefoxDriver,EdgeDriver : child class
        WebDriver driver = new ChromeDriver(); //driver=browser , tarayici
        //WebDriver driver2 = new FirefoxDriver();
        // WebDriver driver3 = new EdgeDriver();

        driver.get("https://www.hepsiburada.com/"); //web sayfasini acma
        //bu hafizada kaliyor nesne hafizada aciliyor ve kapanmiyor ekran kapansa da hafizada kaliyor. TaskManager dan gorebiliriz halen calistigini.

        MyFunc.Bekle(3);

        //driver.close(); //o andaki acik olan window kapatir.
        driver.quit(); // hepsini kapatir sistemi.Program calisirken olusturulmus olanlarin hepsini kapatir ve hafizadan siler.PC performansi icin kapatmak lazim.

        //hafizadan siler.


        //NOT : SLF4J -> Bu bir loglama fonksiyonudur
        //selenium yazanlar , bunu kullaniyorlar ama selenium icerisinde bir paket olarak
        //eklemiyorlar.
        //java icinde kullaniliyor ama bizim manuel eklemmemizi istiyor.
        //Simple Logging Facade for Java
        //slf4j api ve slf4j nop var. api olani bizde default olarak var. nop yok.
        //bir jar eklenecekse proje-module setting-library-+-jar-apply-ok





        /*

        sdet6 nın üzerine tıkla
sonra sağtıkla
open module settings e tıkla
libraries e tıkla
+ işaretine tıkla
from maven e tıkla
org.slf4j:slf4j-nop:1.7.30    ---> bunu yapıstır arama yerine ve ok ok de
sonra projeni run yap tekrar bak kırmızılıklar gitti



        */
    }
}
