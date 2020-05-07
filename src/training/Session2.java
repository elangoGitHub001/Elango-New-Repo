package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.sc.com/in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@title='Login']")).click();
		
		Actions
		
		driver.findElement(By.className("sc-minimgnv__linl bank-login")).click();			
				
		System.out.println(driver.findElement(By.id("checkbox-1")).isSelected());
		
		System.out.println(driver.findElement(By.className("button-content")).isEnabled());
		
		driver.findElement(By.id("sc-hdr__btn sc-hdr__login-btn")).click();

	}

	private static Actions findElement(By className) {
		// TODO Auto-generated method stub
		return null;
	}

}
