package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataroviderExample {
	
	@Test(dataProvider = "myDP")
	public void methodToUseDP(String name, String location) {
		System.out.println(name+" - "+location);
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(location);
		
	}
	
	@DataProvider(name="myDP")
	public Object[][] DPMethod() {
		Object[][] value = {{"shailesh", "ahmedabad"},{"Jyothsna", "Chennai"},{"Vishkha", "mumbai"}};
		return value;
		
	}

}
