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

public class Mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/?mkcid=1&mkrid=711-53200-19255-0&siteid=0&campid=5338933784&customid=gxdefault&toolid=10001&mkevt=1");
		driver.manage().window().maximize();
		WebElement hover = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(hover).perform();  //di chuyển tới giữa element;
		//xài perform() mới thực thi được lệnh của move
		

	}

}
