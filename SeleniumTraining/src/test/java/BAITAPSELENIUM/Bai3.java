package BAITAPSELENIUM;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Bai3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.vietnamplus.vn");
        driver.manage().window().maximize();

        // Sử dụng By.name để tìm phần tử tìm kiếm
        WebElement searchInput = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/input"));

        // Gửi từ khóa vào ô tìm kiếm và nhấn ENTER
        searchInput.sendKeys("Nguyễn Phú Trọng", Keys.ENTER);

        // Sử dụng ExpectedConditions để đợi cho phần tử xuất hiện
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstResult = wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Tổng Bí thư Nguyễn Phú Trọng")));

        // Click vào kết quả đầu tiên
        firstResult.click();

        // Đóng toàn bộ cửa sổ trình duyệt
        driver.quit();
    }
}
