package BAITAPSELENIUM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bai8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.getProperty("webdriver.chrome.driver","C:\\Users\\AN515-45\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
		addButton.click();
		Thread.sleep(2000);
		WebElement inputFirstName = driver.findElement(By.id("firstName"));
		inputFirstName.sendKeys("Khang");
		Thread.sleep(2000);
		WebElement inputLastName = driver.findElement(By.id("lastName"));
		inputLastName.sendKeys("Hoang");
		Thread.sleep(2000);
		WebElement inputEmail = driver.findElement(By.id("userEmail"));
		inputEmail.sendKeys("hok74554@gmail.com");
		Thread.sleep(2000);
		WebElement inputAge = driver.findElement(By.id("age"));
		inputAge.sendKeys("21");
		Thread.sleep(2000);
		WebElement inputSalary = driver.findElement(By.id("salary"));
		inputSalary.sendKeys("2000000");
		Thread.sleep(2000);
		WebElement inputDepartment = driver.findElement(By.id("department"));
		inputDepartment.sendKeys("TPHCM");
		Thread.sleep(2000);
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		
		//chọn sửa thôn tin
		WebElement fixButton = driver.findElement(By.id("edit-record-4"));
		fixButton.click();
		
		//Cập nhật thông tin
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("Hoàng");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		
		//Kiểm tra thông tin
		String updateLastName = driver.findElement(By.id("lastName")).getAttribute("value");
		if(updateLastName.contentEquals("Hoàng")) {
			System.out.println("Thông tin cập nhật đã đúng");
		}
		else {
			System.out.println("Thông tin cập nhật đã sai");

		}
		//Xóa thông tin
		Thread.sleep(2000);
		WebElement deleteButton = driver.findElement(By.id("delete-record-4"));
		deleteButton.click();

	}

}
