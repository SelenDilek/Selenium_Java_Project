package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        //textbox lari name ile bulun adinizi ve soyadinizi doldurun ve butonu da id veya name ile bulup tiklatin

        WebElement firstName = driver.findElement(By.name("q8_name[first]"));
        firstName.sendKeys("Selen");

        WebElement lastName = driver.findElement(By.name("q8_name[last]"));
        lastName.sendKeys("Dilek");

        MyFunc.Bekle(2);

        WebElement btnSubmit = driver.findElement(By.id("input_2"));
        btnSubmit.click();










        MyFunc.Bekle(5);
        driver.quit();

    }
}
