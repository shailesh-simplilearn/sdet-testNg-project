package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsClass {
	
	@Test
	public void assetionMethod() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
		WebElement releaseNum = driver.findElement(By.cssSelector("div[class='row justify-content-center p-5'] p:nth-child(1) a:nth-child(1)"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(releaseNum.getText(), "4.1.2");
		softAssert.assertAll();
		driver.quit();
				
	
	}

}
