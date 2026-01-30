package Abc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTable {
	
	@Test
	public void run() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");	
	String ele = driver.findElement(By.xpath("//table//tr[5]//td[6]")).getText();
	System.out.println(ele);
	
	WebElement table = driver.findElement(By.cssSelector(".table.table-striped.mt-3"));
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	for (WebElement row : rows) {
	    List<WebElement> cells = row.findElements(By.tagName("td"));
	    for (WebElement cell : cells) {
	        System.out.print(cell.getText() + " | ");
	    }
	    System.out.println();
	}
	
	
	List<WebElement> datas = driver.findElements(By.xpath("//table//tbody//tr"));
	for (WebElement data : datas) {
		
		if (data.getText().contains("Vega")) {
			
			System.out.println("Found row: " + data.getText());
	        break;
		}
	}
	
	
	driver.findElement(By.xpath("//table//tr[3]//td[7]")).click();
	
	}
	

}
