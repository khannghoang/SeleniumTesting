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

public class Bai5 {
////	Bài tập 5: Kiểm thử form và validation
//Mở trang web với một biểu mẫu (ví dụ: Đăng ký).
//Nhập thông tin hợp lệ và kiểm tra xem bạn có thể đăng ký thành công hay không.
//Nhập thông tin không hợp lệ và kiểm tra xem thông báo lỗi xuất hiện hay không.
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.vietnamplus.vn");
        driver.manage().window().maximize();
        driver.findElement(By.className("ic-profile")).click();
        driver.findElement(By.id("txtLoginEmail")).sendKeys("hok74554@gmail.com");
        driver.findElement(By.id("txtLoginPassword")).sendKeys("14102003");
        driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/button")).click();
    }
}
