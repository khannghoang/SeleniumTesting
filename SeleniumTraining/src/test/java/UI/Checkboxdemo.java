package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo");  
		driver.manage().window().maximize();
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[7]/div/div[3]/div/div/a"));  //
		Actions action = new Actions(driver);
		action.moveToElement(radio);
		action.perform();
		//4 dòng trên để scrolling tới vị trí mong muốn
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[7]/div/div[2]/div/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[7]/div/div[2]/div/div/div/div[3]/button[1]")).click();
//		
		
		

		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys(Keys.ARROW_DOWN); //dùng để thao tác với phím
	//	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys(Keys.ENTER);

	}

}
