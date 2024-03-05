package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAuthentications {

	public static void main(String[] args) throws InterruptedException {
		String username = "admin";
		String password = "admin";
		// TODO Auto-generated method stub
		//System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		//http://admin:admin@the-internet.herokuapp.com/basic_auth
			//	username : password 

	}

}
