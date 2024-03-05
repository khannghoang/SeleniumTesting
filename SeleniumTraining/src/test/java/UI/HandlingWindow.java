package UI;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"1666820637520_9ph\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
		Thread.sleep(3000);
		Set<String> window = driver.getWindowHandles();  //Lấy danh sách các cửa sổ đang mở trong trình duyệt và đặt chúng vào một Set (tập hợp).
		System.out.print(window); //in ra console các trình duyệt web đang mở để kiểm soat 
		Iterator<String> iterator = window.iterator();  //Tạo một iterator để lặp qua từng cửa sổ trong danh sách cửa sổ.
		String parentwindow = iterator.next(); //Lấy ra cửa sổ đầu tiên từ danh sách (cửa sổ cha) và gán vào biến parentwindow.
		String childwindow= iterator.next();  //Lấy ra cửa sổ thứ hai từ danh sách (cửa sổ con) và gán vào biến childwindow
		
		driver.switchTo().window(childwindow); //Chuyển đổi sự quản lý của trình duyệt từ cửa
		//sổ cha sang cửa sổ con để thực hiện các thao tác trên cửa sổ con.
		driver.findElement(By.name("UserFirstName")).sendKeys("RCV");
		driver.findElement(By.name("UserLastName")).sendKeys("Academy");
		Thread.sleep(3000);
		driver.switchTo().window(parentwindow); //chuyển về trang cha
		

		
		

	}

}
