package UI;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class BasicsWebDriverMethods {
	public static String browser ="Chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("Edge")){
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		else if(browser.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		driver.get("https://www.saucedemo.com/");
		//get(linkURL) để mở trang web
		driver.manage().window().maximize();
		//manage để tùy chọn độ lớn
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);  //in ra cái link
		
		String gettitle=driver.getTitle();
		System.out.println(gettitle);  //in ra cái title của trang web đặt trong html
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);  //in ra page source
		
//		driver.navigate().to("http://google.com"); //navigate cho phép chuyển từ trang ban đầu sang trang khác
		
		WebElement we = driver.findElement(By.id("user-name"));
		we.sendKeys("standard_user"); //có thể đặt tên biến như trên để chứa và thao tác ở dưới như này
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
		
		WebElement webelement= driver.findElement(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelement);
		
		driver.navigate().to("http://google.com"); //chuyến đến trang mới
		String handle = driver.getWindowHandle();
		System.out.println(handle); //Mỗi cửa sổ trình duyệt mà WebDriver mở sẽ có một "window handle" duy nhất, được sử dụng để định danh cửa sổ đó trong quá trình tương tác. Khi bạn mở một cửa sổ
		//mới, ví dụ như mở một cửa sổ popup hoặc một tab mới, một "window handle" mới sẽ được tạo.
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"glue-carousel-1\"]/div/a[3]/img")).click();
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);
		//getWindowHandle() sẽ trả về handle của cửa sổ trình duyệt hiện tại.
		//getWindowHandles() sẽ trả về tất cả các window handles mà WebDriver đang biết đến.
		
//		driver.close(); //đóng trang broswer còn quit thì đóng luôn browser
		
		
		
		
		
	}
	
}
