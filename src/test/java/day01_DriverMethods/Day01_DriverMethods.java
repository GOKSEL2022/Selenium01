package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Boş bir browser açtık,obje oluşturduk.
        driver.get("https://www.amazon.com");  // İstenilen sayfaya gider.
        System.out.println("Sayfa Başlığı : " + driver.getTitle());
        System.out.println("Sayfa Url'i :" + driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());  Sayfanın kaynak kodlarını String olarak getirir.
        System.out.println(driver.getWindowHandle());// Bize o window'a ait hash degerini verir.
        //Biz bu hash degerlerini bir Stringe atayıp pencereler arası geçiş yapabilir,yeni sekme açabiliriz.

    }
}
