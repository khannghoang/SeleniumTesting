package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
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
		driver.get("https://shopping-pclo.onrender.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys("khanghoang");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/table/tbody/tr[2]/td[2]/input\r\n"
				+ "")).sendKeys("14102003");		
		 try {
	            Thread.sleep(5000); // 1000 milliseconds = 1 second
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/div[2]/form/input[1]")).sendKeys("Steam");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/div[2]/form/input[2]")).click();


        try {
            Thread.sleep(10000); // 1000 milliseconds = 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Đóng trình duyệt
        driver.close();
	}
	
}
