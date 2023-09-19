package seleniumexercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SimpleAlert {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\GUNA\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		Thread.sleep(2000);
		Alert  simpleAlert =driver.switchTo().alert();
		Thread.sleep(5000);
String alertText = simpleAlert.getText();
System.out.println("Simple Alert Text : "+  "I am alert ");
Thread.sleep(2000);
simpleAlert.accept();
System.out.println("Simple Alert accepted ");
driver.quit();
}

}
