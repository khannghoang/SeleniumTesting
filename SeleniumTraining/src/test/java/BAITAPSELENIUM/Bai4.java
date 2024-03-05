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

public class Bai4 {
//	Bài tập 4: Thao tác với trường nhập liệu và nút submit
//	Mở trang web có một biểu mẫu đăng nhập (ví dụ: Facebook).
//	Nhập thông tin đăng nhập vào các trường cần thiết.
//	Click nút đăng nhập và kiểm tra xem bạn đã đăng nhập thành công hay không.
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
