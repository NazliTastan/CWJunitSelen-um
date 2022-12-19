package Day4_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework {
    //https://id.heroku.com/login sayfasına gidiniz.
    //Bir mail adresi giriniz.
    //Bir password giriniz.
    //Login butonuna tıklayınız.
    //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
    //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
    //Tüm sayfaları kapatınız.
    WebDriver driver;
    @Before
    public void tearDown(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    
    @After
        public void after(){
            driver.quit();

        }

    @Ignore
    public void test(){
     driver.get("https://id.heroku.com/");
        WebElement buttonEmail=driver.findElement(By.xpath("//input[@autofocus='true']"));
        buttonEmail.sendKeys("abc@gmail.com") ;

        WebElement password=driver.findElement(By.cssSelector("#password"));

        WebElement number1=driver.findElement(By.cssSelector("#number1"));
        number1.sendKeys("10");
        WebElement number2=driver.findElement(By.cssSelector("#number2"));
        number2.sendKeys("20");
        driver.findElement(By.cssSelector("#calculate")).click();


        WebElement results=driver.findElement(By.xpath("//p[text()='Answer : ']"));
        System.out.println(results.getText());
    }

}
