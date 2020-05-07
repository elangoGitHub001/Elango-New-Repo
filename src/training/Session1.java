package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("i_ilango81@yahoo.com");
		
		driver.findElement(By.name("pass")).sendKeys("gai3madhu");
		
		driver.findElement(By.id("loginbutton")).click();			
				

	}

}
