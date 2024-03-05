package UI;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/?mkcid=1&mkrid=711-53200-19255-0&siteid=0&campid=5338933784&customid=gxdefault&toolid=10001&mkevt=1");
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/div/div/div/div[2]/a/div[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(scroll).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/div/div/div/div[2]/a/div[2]")).click();
	}

}
