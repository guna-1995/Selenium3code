package seleniumexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LinkedinLogin {

	public LinkedinLogin() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\GUNA\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		Thread.sleep(20000);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.linkedin.com/");
				driver.findElement(By.id("//input[@type='text']")).sendKeys("gunaramanujam95@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ramanujam");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}

}
