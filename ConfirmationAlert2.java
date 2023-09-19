package seleniumexercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ConfirmationAlert2 extends ConfirmationAlert{

public static void main (String []args) throws InterruptedException { 
	ConfirmationAlert2 ca = new  ConfirmationAlert2();
			ca.cofimationAlert();
	
	
	
}
public void cofimationAlert() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\GUNA\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	options.merge(capabilities);
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	driver.findElement(By.name("confirmation")).click();
	Thread.sleep(20000);
	Alert  simpleAlert =driver.switchTo().alert();
	Thread.sleep(5000);
String alertText = simpleAlert.getText();
System.out.println("Confirmation Text : "+  "I am confirm ");
Thread.sleep(7000);
simpleAlert.dismiss();
System.out.println("Confirmation Alert accepted ");
driver.quit();
super.cofimationAlert();
	
}

}
