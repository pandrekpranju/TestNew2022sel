import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartPage {
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement wb=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		wb.click();
		wb.sendKeys("iphone Mobiles");
		
		WebElement wb1= driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		wb1.click();
		
	
		
		
		
		
	}

}
