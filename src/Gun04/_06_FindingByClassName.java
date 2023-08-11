package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByClassName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        //eger class ta bosluk varsa ilk kelime alinir. form-textbox validate[required] -> form-textbox alinir

        //birden fazla varsa ayni class namede
        //findElement ayni locatorde birden fazla element bulursa BIRINCISINI gonderir.
        WebElement firstName = driver.findElement(By.className("form-textbox")); //bundan iki tane var aslinda ilkini getirdi bize.
        firstName.sendKeys("Selen");
        firstName.sendKeys(Keys.TAB);



        MyFunc.Bekle(5);
        driver.quit();


    }
}
