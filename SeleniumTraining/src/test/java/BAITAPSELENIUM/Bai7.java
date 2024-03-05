package BAITAPSELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://shopping-pclo.onrender.com/shop");
		List<WebElement> productList = driver.findElements(By.className("productList"));
		for(WebElement product: productList) {
			String Text = product.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/figure/figcaption/div")).getText();
			
		if(Text.equals("Dkfindout - Những Điều Sách Giáo Khoa Không Dạy Bạn - Kỹ Thuật Công Nghệ")) {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/figure/figcaption/a/button")).click();
		}
		
		}
	}

}
