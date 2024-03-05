package UI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://vn.fifaaddict.com");
		driver.manage().window().maximize();	
//		WebElement dropdown=driver.findElement(By.id("select-nations"));
//		Select select = new Select(dropdown); //Tạo biến select gắn vào element Select 
//		select.selectByValue("algeria");  //chọn theo value trong html
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  //dùng cái này để làm chậm thời gian chạy 
//		
//		select.selectByIndex(3);  //chọn theo cột index
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  //dùng cái này để làm chậm thời gian chạy 
//		
//		select.selectByVisibleText("Brazil");  //chọn giá trị
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  //dùng cái này để làm chậm thời gian chạy 
		
		//driver.close();
		WebElement dropdown2=driver.findElement(By.id("__BVID__45"));
		Select select = new Select(dropdown2);
		select.selectByIndex(5);
		Thread.sleep(2000); 
		select.selectByValue("shotpower");
		Thread.sleep(2000); 
		List<WebElement> allitems = select.getAllSelectedOptions();
		System.out.println(allitems.size());
		select.deselectAll();
		Thread.sleep(2000);
		select.selectByIndex(5);
		Thread.sleep(2000);
		select.selectByValue("shotpower");
		Thread.sleep(2000);
		select.deselectByValue("shotpower");
		Thread.sleep(2000); 
		List<WebElement> allitems1 = select.getAllSelectedOptions();
		System.out.println(allitems1.size());


	}

}
