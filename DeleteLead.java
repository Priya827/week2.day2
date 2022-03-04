package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@ id = 'username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@ id = 'password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@ Class = 'decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[35]")).sendKeys("1234567890");
		driver.findElement(By.xpath("(//button[@Class='x-btn-text'])[7]")).click();
		driver.findElement(By.id("ext-gen946")).click();
		//driver.findElement(By.xpath("(//a[@Class='linktext'])[4]")).sendKeys("17743");
		//driver.findElement(By.xpath("(//a[@Class='linktext'])[4]")).click();
		driver.findElement(By.xpath("//a[@Class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[29]")).sendKeys("10744");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    driver.close();	
	
	}
	
}
