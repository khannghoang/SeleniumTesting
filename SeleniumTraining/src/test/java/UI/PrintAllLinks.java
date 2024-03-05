package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://vn.fifaaddict.com");
        driver.manage().window().maximize();

        // Sử dụng findElements để lấy danh sách tất cả các phần tử a
        List<WebElement> allTags = driver.findElements(By.tagName("option"));

        System.out.println("Total tags are: " + allTags.size());

        for (int i = 0; i < allTags.size(); i++) {
//            System.out.println("Link on the page are: " + allTags.get(i).getAttribute("href"));
            System.out.println("Text on the page are: " + allTags.get(i).getText());
        }

        driver.close();
    }
}
