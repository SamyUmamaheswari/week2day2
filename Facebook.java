package week2.day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Umamaheswari");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Samydurai");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876512345");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("*Uma123");
		
		WebElement dropdown = driver.findElement(By.id("day"));
		Select dd = new Select(dropdown);
		dd.selectByIndex(3);
		
		WebElement dropdown2 = driver.findElement(By.id("month"));
		Select dd2 = new Select(dropdown2);
		dd2.selectByValue("5");
		
		WebElement dropdown3 = driver.findElement(By.id("year"));
		Select dd3 = new Select(dropdown3);
		dd3.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
		
		
		
		
		
		
	}
	
}
