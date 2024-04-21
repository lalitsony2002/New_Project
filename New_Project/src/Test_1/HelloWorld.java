package Test_1;

import java.util.HashMap;
import java.util.Map;

//import Test_1.ClassImport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HelloWorld  {
	
	

	public static void main(String[] args) {
		
		
		//ClassImport.test_2();
		
		 
		
		
		ChromeOptions options = new ChromeOptions(); 
		Map prefs = new HashMap();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		options.setExperimentalOption("prefs", prefs);
		
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String baseUrl = "https://gventure.in/user_staging";
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9391081116");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789");

		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='My Plots Order']")));
		
		driver.findElement(By.xpath("//span[text()='My Plots Order']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='My Statement']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Overview'][1]")));
		
		String title = "//h6[text()='Overview'][1]";
		
		if (title == "//h6[text()='Overview'][1]") 
			System.out.println("My Statement Screen Open");
		
		
		driver.findElement(By.xpath("//span[text()='My Invoice']")).click();
		
		
		
		//span[text()='history_edu']
		
		
		//String My_Invoice = "//span[text()='Previous Receipt']";
		
		if (title == "//h6[text()='Overview'][1]") 
			System.out.println("My Statement Screen Open");
		
		
		
	}

}
