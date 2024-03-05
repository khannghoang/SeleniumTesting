package UI;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSSLErrors {
		public static String browser ="Edge";
		public static WebDriver driver;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			if(browser.equals("Chrome")){
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				 DesiredCapabilities dc = new DesiredCapabilities();
			        dc.setAcceptInsecureCerts(true);
			        ChromeOptions chromeOptions = new ChromeOptions();
			        chromeOptions.setCapability(ChromeOptions.CAPABILITY, dc);
			        // Tắt chế độ an toàn
			        chromeOptions.addArguments("--disable-web-security");
			        WebDriver driver = new ChromeDriver(chromeOptions);
			        driver.get("https://cntttest.vanlanguni.edu.vn:18081/Phancong02/");
		}
			else if(browser.equals("Edge")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				 DesiredCapabilities dc = new DesiredCapabilities();
			        dc.setAcceptInsecureCerts(true);
			        EdgeOptions edgeOptions = new EdgeOptions();
			        edgeOptions.setCapability(EdgeOptions.CAPABILITY, dc);
			        // Tắt chế độ an toàn
			        edgeOptions.addArguments("--disable-web-security");
			        WebDriver driver = new EdgeDriver(edgeOptions);
			        driver.get("https://cntttest.vanlanguni.edu.vn:18081/SEP25Team03/");
			}
		
		         
	}

}
