package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {
	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://acme-test.uipath.com/login");
			driver.manage().window().maximize();
			driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
			driver.findElement(By.name("password")).sendKeys("leaf@12");
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
			driver.close();
			
			System.out.println(driver.getTitle());
			
	}

}
