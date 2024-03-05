package BAITAPSELENIUM;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bai1 {
//	Bài tập 1: Mở trang web và kiểm tra URL
//	Mở trình duyệt (ví dụ: Chrome).
//	Truy cập trang web bất kỳ.
//	Kiểm tra xem URL có chứa một từ khóa cụ thể hay không.

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/b/Electronics/bn_7000259124");
		driver.manage().window().maximize();	
		String currentURL = driver.getCurrentUrl();
		String keyword = "Electronics";
		if(currentURL.contains(keyword)) {
			System.out.print("Có");
		}
		else {
			System.out.print("Không có");

		}
		driver.close();

	}

}
