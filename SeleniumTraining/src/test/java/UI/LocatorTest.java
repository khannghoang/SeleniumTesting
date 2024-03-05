package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class LocatorTest {
	public static String browser ="Chrome";
	public static WebDriver  driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("Edge")){
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		else if(browser.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		driver.get("https://www.saucedemo.com/");
		WebElement emailElement = driver.findElement(
                   RelativeLocator.with(By.tagName("input")).above(By.id("password"))
           );
		WebElement passwordElement=driver.findElement(
				RelativeLocator.with(By.tagName("input")).below(By.id("user-name")));
		WebElement buttonElement=driver.findElement(
				RelativeLocator.with(By.tagName("input")).below(By.id("password")));

           emailElement.sendKeys("Testing");
           passwordElement.sendKeys("Test");
           buttonElement.click();
           //https://www.selenium.dev/documentation/webdriver/elements/locators/#above vô đây đọc thêm
           
//		driver.manage().window().maximize();  cái này để phóng to màn hình
//		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Michael Jackson");
//		driver.findElement(By.id("search-icon-legacy")).click();	cái này chọn phần tử theo id 
//		gồm xpath,classname,xpath,cssselector
//		driver.findElement(By.linkText("Josh Hutcherson || Whistle")).click();
//		cái này sẽ chọn phần text của link a
		
//		driver.findElement(By.partialLinkText("Michael Jackson - Smooth")).click();
		//cái này lấy một phần text của link a
		
		
//	      // Chờ 10 giây
        try {
            Thread.sleep(5000); // 1000 milliseconds = 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Đóng trình duyệt
        driver.close();
	}
	private static RelativeBy withTagName(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
