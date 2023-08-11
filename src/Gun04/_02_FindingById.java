package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _02_FindingById {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        //1. text box i bul (id=first_8) ona isim ver mesela isimKutusu
        //2. isimKutusuna "Selen" yazisini gonder.


        WebElement isimKutusu = driver.findElement(By.id("first_8"));
        isimKutusu.sendKeys("Selen"); //kutucuklara yazi gonderme

        //3. text box i bul (id=last_8)ona isim ver mesela soyadKutusu
        //4. soyadKutusu "Dilek" yazisini gonder. #dies hashtag #id yaparsak (ctrl+f) sadece id lere bakiyor
        WebElement soyadKutusu = driver.findElement(By.id("last_8"));
        soyadKutusu.sendKeys("Dilek");









        MyFunc.Bekle(5);
        driver.quit();



//        1-  1.texbox ı bul (id=first_8) , ona bir isim ver mesala isimKutusu
//        2-  isimKutusuna "ismet" yazısını gönder
//
//        3-  2.texbox ı bul , ona bir isim ver mesala soyadKutusu
//        4-  soyadKutusu "temur" yazısını gönder
// Chrome ctrl+f ye basıldığında inspect bölümünde
        // (inpect bölümü aktifken) arama kutusunu açar
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar


    }
}
