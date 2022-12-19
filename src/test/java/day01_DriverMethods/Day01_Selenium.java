package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_Selenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        /*
      En temel haliyle otomasyon yapmak icin Class'imiza otomasyon icin gerekli olan
      webdriver'in yerini gostermemiz gerekir. Bunun icin Java kutuphanesinden System.setProperty()
      method'unun icine ilk olarak driver'i yazariz. Ikinci olarak driver'in fiziki yolunu kopyalariz.
 */
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");


    }
}
