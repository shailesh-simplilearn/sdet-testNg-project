package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTestNGClass {
	@Test
	@Parameters (value = {"browser", "city" })
	public void firestTestMethod(String browser, String city) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome will be launched");
		}
		else if (browser.equalsIgnoreCase("firefox")){
			System.out.println("Firefox will be launched");
		}
		System.out.println(city);
		System.out.println("First TestNG Method");
		
	}
	/*
	 * @Test (groups = "sanity", priority = 3) public void sanityMethod1() {
	 * 
	 * System.out.println("Sanity Method"); }
	 * 
	 * @Test (groups = "smoke", priority = 2) public void smokeMethod() {
	 * 
	 * System.out.println("Smoke Method"); }
	 * 
	 * @Test (groups = {"sanity", "regression"}, priority = 4) public void
	 * firestTestMethod1() {
	 * 
	 * System.out.println("Second TestNG Method"); }
	 */
	
	/*
	 * @BeforeSuite public void IWantTOExecuteThisFirst() {
	 * System.out.println("This is a before Suite Method"); }
	 * 
	 * @BeforeTest public void beforeTestMethod() {
	 * System.out.println("Before Test method"); }
	 */

}
