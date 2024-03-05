package BAITAPSELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		WebElement username=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement click=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		click.click();
		
		String currentURL = driver.getCurrentUrl();
		if(currentURL.equals("https://www.saucedemo.com/v1/inventory.html")) {
            System.out.println("Đăng nhập thành công. Chuyển hướng đến trang chính.");

		}
		else {
            System.out.println("Đăng nhập không thành công hoặc chuyển hướng không đúng.");
        }


	}

}
