package seleniumexercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PromptAlert {

	public PromptAlert() {
		// TODO Auto-generated constructor stub
	}

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
		driver.findElement(By.name("prompt")).click();
		Alert promptAlert =  driver.switchTo().alert();
		Thread.sleep(5000);
		promptAlert.sendKeys(" guna");
		promptAlert.accept();
		Thread.sleep(5000);
        String name = driver.findElement(By.id(" myName")).getText();
        driver.quit();
	System.out.println(name);
	System.out.println("promptAlert accepted ");
	}

}
