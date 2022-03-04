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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("priya");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("muthu");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("abc@gmail.com");
	    driver.findElement(By.xpath("(//input[@type = 'password'])[2]")).sendKeys("Hello123");
	    WebElement elementDropDown = driver.findElement(By.id("day"));
		Select day = new Select(elementDropDown);
		day.selectByValue("8");
		WebElement elementDropDown1 = driver.findElement(By.id("month"));
		Select month = new Select(elementDropDown1);
		month.selectByValue("2");
		WebElement elementDropDown2 = driver.findElement(By.id("year"));
		Select year = new Select(elementDropDown2);
		year.selectByValue("1997");
	    driver.findElement(By.xpath("//label[text() = 'Female']")).click();
	}
		
}

