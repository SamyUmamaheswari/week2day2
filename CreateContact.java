package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Umamaheswari");
		driver.findElement(By.id("lastNameField")).sendKeys("Samydurai");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Uma");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Tester");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Selenium testing with Java");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("umacivil95@gmail.com");
		WebElement dropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Meeting");
		driver.findElement(By.xpath("//input[contains(@name,'submitButton')]")).click();
		
		 String title = driver.getTitle();
			System.out.println(title);
		
		
		
		
		
		
		
		
		
	}

}
