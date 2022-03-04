package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		driver.findElement(By.linkText("Contacts")).click();
	    driver.findElement(By.linkText("Create Contact")).click();
	    driver.findElement(By.id("firstNameField")).sendKeys("hello");
	    driver.findElement(By.id("lastNameField")).sendKeys("world");
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("welcome");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("to testleaf");
	    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("safety");
	    driver.findElement(By.id("createContactForm_description")).sendKeys("i know java");
	    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abcxyz@gmail.com");
	    WebElement elementDropDown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(elementDropDown);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Hello Everyone");
		driver.findElement(By.xpath("(//input[@ Class = 'smallSubmit'])[1]")).click();
		System.out.println("The title is :"+ driver.getTitle());
   }
}
