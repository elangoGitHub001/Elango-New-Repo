package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("12345");
		
		driver.findElement(By.name("pass")).sendKeys("abcde");
		
		driver.findElement(By.id("loginbutton")).click();	
		
		

	}

}
