package handling_web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers.chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	//driver.manage().window().maximize();
	
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
driver.findElement(By.xpath("//input[@id='btnLogin']")).click();


	}

}
