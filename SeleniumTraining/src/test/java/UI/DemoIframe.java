package UI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
	//	driver.switchTo().frame(0);  //0 là số index chính là số thự tự được code đầu tiên trong cái mấy frame code
	//cách 2 là xài với id hoặc name có tag iframe chưa cái button đó
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("/html/body/button")).click();   
//		String alerttext = driver.switchTo().alert().getText();  
//		System.out.println(alerttext);
		Thread.sleep(2000);
//		driver.switchTo().alert().accept();	
		Alert alertonpage= driver.switchTo().alert();
		alertonpage.sendKeys("Khang");
		alertonpage.accept();
		
		driver.switchTo().parentFrame();     //sau khi làm việc xong với frame xài switch để thoát khỏi frame
		System.out.print(driver.getTitle());    
		//driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();		
		//driver.close();

	}

}
