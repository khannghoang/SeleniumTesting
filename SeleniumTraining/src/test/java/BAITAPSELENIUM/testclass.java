package BAITAPSELENIUM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclass {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        // WebDriverManager.chromedriver().setup();
        // WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://pltpro.net");
        Thread.sleep(2000);
        driver.quit();
    }
    
}
