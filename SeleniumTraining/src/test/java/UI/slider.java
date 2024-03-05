package UI;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker	");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);    
		WebElement greenslide = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		WebElement redslide = driver.findElement(By.xpath("//*[@id=\"red\"]/div"));
		WebElement blueslide = driver.findElement(By.xpath("//*[@id=\"blue\"]/div"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(greenslide, 200, 100).perform();
		Thread.sleep(2000);
		action.dragAndDropBy(redslide, -100, -50).perform();
		Thread.sleep(2000);
		action.dragAndDropBy(blueslide, 200, 150).perform();
		//xài perform() mới thực thi được lệnh của action
		

	}

}
