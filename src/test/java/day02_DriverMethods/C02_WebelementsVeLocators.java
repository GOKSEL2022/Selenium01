package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebelementsVeLocators {
    public static void main(String[] args) {

        /*
                                           *****ÖNEMLİ NOT*****
                            ---Sayfanın içerisindeki belirli bir bölüme ulaşma---
        Eğer bir webelementi (web sayfasindaki her bir buton veya text/yazı) locate(konumunu belirleme)
        etmek istersek önce manuel olarak web sayfasını açıp sayfa üzerinde sağ click yapıp incele'ye tıklarız.
        Karşımıza çıkan HTML kodlarından locater'lardan (konum belirleyiciler) eşsiz(uniq) olanı seçeriz.
        Genellikle id Attribute 'u kullanırız.Seçtiğimiz attribute degerini findelement() methodu içine
        findelement(By.id("atribute degeri") şeklinde yazarız.
         */
        System.setProperty("webdriver.chrom.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim.
        driver.get("https://www.amazon.com");

        //Search bölümünü locate edelim.
        //WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));

        //Searc bölümünde iphone aratalım.
        aramaKutusu.sendKeys("iphone", Keys.ENTER);

        //Amazon sayfasındaki <input> ve <a> taglarının sayısnı yazdırınız.
        List<WebElement> inputTags =driver.findElements(By.tagName("input"));
        System.out.println("İnput Tag Saysı:"+ inputTags.size());

        List<WebElement> linklerList=driver.findElements(By.tagName("a"));
        System.out.println("Link Saysı:"+ linklerList.size());  //linklerin sayısını bulduk

        for (WebElement w:linklerList){
            System.out.println(w.getText());    // linkleri yazdırdık
        }
    }
}
