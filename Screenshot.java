package seleniumexercise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public Screenshot() {
		// TODO Auto-generated constructor stub
	}
public static void main (String args[]) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\GUNA\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8122995213");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("guna@123");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	File FirstSrc = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("D:\\GUNA ");
	FileHandler.copy( FirstSrc, dest);
	Thread.sleep(5000);
	driver.quit();

}
}
         