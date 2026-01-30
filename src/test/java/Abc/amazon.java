package Abc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com");
		List<WebElement> options = driver.findElements(By.cssSelector(".tVzyDb"));
		System.out.println(options.size());
		
		List<WebElement> texts = driver.findElements(By.cssSelector(".vpQU2r"));
		System.out.println(texts.size());
		
		for (WebElement text : texts) {
			
			System.out.println(text.getText());
			
		}
	}

}
