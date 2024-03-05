package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Democlass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.youtube.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Automation Testing");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();	
		Thread.sleep(2000);
		driver.close();
		System.out.println("My second commit");

	}

}
