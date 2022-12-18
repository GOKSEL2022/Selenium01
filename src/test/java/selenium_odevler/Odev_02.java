package selenium_odevler;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev_02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            /*

        ODEV 2
Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin
Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
Sayfayi kapatin
         */

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın Konumu :" + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutları:" + driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(80,0));
        driver.manage().window().setSize(new Dimension(800,600));

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin.
        Point actualPosition=driver.manage().window().getPosition();
        if (actualPosition.equals(new Point(80,0))) {
            System.out.println("Sayfa boyutu" + actualPosition + "ile aynı");
        }else System.out.println("Sayfa boyutu" + actualPosition+" ile aynı değil.");

        Dimension actualSize=driver.manage().window().getSize();
        if (actualSize.equals(new Dimension(800,600))) {
            System.out.println("Sayfa konumu" + actualSize + " ile aynı.");
        }else System.out.println("Sayfa konumu" + actualSize + "ile aynı değil.");

        //driver.manage().window().getPosition();
        //driver.manage().window().getSize();

        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }

    }

