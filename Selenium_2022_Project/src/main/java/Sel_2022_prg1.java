import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Sel_2022_prg1 {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='Register.html']")).click();
//		Thread.sleep(20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Pranjali");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Pandrekar");
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("H.No:123434,Tamsewada,Karwar");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test1@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8934759348");
		
		//Radio Button-Radio Buttons too can be toggled on by using the click() method.
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='FeMale']"));
		radiobutton.click();
		boolean rdbtnenabled=radiobutton.isEnabled();
		System.out.println("rdbtnenabled");
		
		//Selects the check box 1
		
		WebElement checkbox1= driver.findElement(By.xpath("//input[@id='checkbox1']"));
		checkbox1.click();
		checkbox1.isEnabled();
		System.out.println("checkbox1");
		

		WebElement checkbox2= driver.findElement(By.xpath("//input[@id='checkbox3']"));
		checkbox2.click();
		checkbox2.isEnabled();
		System.out.println("checkbox2");
		
		

		
		
		
	}

	
}
