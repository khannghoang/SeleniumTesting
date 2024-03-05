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

public class resziable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);    
		WebElement resziable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		WebElement resziable2 = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[1]"));
		WebElement resziable3 = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[2]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(resziable, 200, 150).perform();
		Thread.sleep(4000);
		action.dragAndDropBy(resziable2, 200, 0).perform();
		Thread.sleep(4000);
		action.dragAndDropBy(resziable3, 0, 50).perform();
		//xài perform() mới thực thi được lệnh của action
		

	}

}
