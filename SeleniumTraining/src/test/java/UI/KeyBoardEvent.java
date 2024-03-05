package UI;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		WebElement storetextarea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/pre/span"));
		WebElement pastearea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[6]/pre/span"));
		Actions action = new Actions(driver);
		action.keyDown(storetextarea,Keys.CONTROL).sendKeys("a").sendKeys("c").perform();
		Thread.sleep(3000);
		action.keyDown(pastearea,Keys.CONTROL).sendKeys("a").sendKeys("v").perform();
		

	}

}
