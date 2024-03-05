package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("Testing");
		driver.findElement(By.name("email")).clear();  //dùng để xóa giá trị
	//	System.out.println(driver.findElement(By.name("firstname")).getAttribute("class")) ;
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("text-transform")); //lấy giá trị của thuộc tính css
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize()); 
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation()); 
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName()); 
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled()); 
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected()); 



//		driver.close();

	}

}
