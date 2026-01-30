package Abc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProvide {

	@Test(dataProvider = "datap")
	public void run(String userid,String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("");
		driver.findElement(By.xpath("")).sendKeys(userid);
		driver.findElement(By.xpath("")).sendKeys(pass);
		
		}

	
	@DataProvider(name = "datap")
	  public Object[][] data() {
		  
		  Object obj[][] = new Object [2][2];
		  obj[0][0]= "vish";
		  obj[0][1]= "123";
		  obj[1][0]= "kish";
		  obj[1][1]= "1234";
		  return obj;
	  }
	
	
	
	
	
	
	
	
	
}
