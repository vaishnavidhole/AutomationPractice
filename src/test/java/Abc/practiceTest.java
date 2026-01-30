package Abc;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceTest {

	
		@Test
		public void run() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle()); 
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		
		//screenshot
		
		TakesScreenshot sc= (TakesScreenshot)driver;
		File source = sc.getScreenshotAs(OutputType.FILE);
		File des = new File ("");
		FileUtils.copyFile(source, des);
		
		// for perticular elemt
		
		WebElement ele = driver.findElement(By.xpath("//table//tr[5]//td[6]"));
		File s = ele.getScreenshotAs(OutputType.FILE);
		File de = new File ("");
		FileUtils.copyFile(source, de);
		
		
		}
	

}
