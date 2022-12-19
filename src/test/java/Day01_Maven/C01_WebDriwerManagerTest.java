package Day01_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriwerManagerTest {
    public static void main(String[] args) {
    // Set Path.
   // Create chrome driver
    // Maximize the window
   // Open google home page https://www.google.com/
   // Verify that you are Google in the title.


        //webdriver manager clasını kulanarak chromdriver binary lerimizi indirdik
        WebDriverManager.chromedriver().setup();
        //driver obj mizi olusturduk
        WebDriver driver = new ChromeDriver();
        //google ANASAYFAMIZI ACTIK
        driver.get("https://www.google.com/");
        //title imizi aldık
        String title = driver.getTitle();
        //tıtle imizi doğruladık
        if(title.equalsIgnoreCase("Google")){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("test falsed");
        }
        //driver kapattık

        driver.quit();


    }

}
