package mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MouseOverAction {

	public MouseOverAction() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\GUNA\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		WebElement txtUsername = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement txtpassword =driver.findElement(By.xpath("//input[@type='password']")); 
		WebElement txtlogin =driver.findElement(By.xpath("//button[@type='submit']"));
                 

                    Actions builder = new Actions(driver);
                    builder .moveToElement(txtUsername)
                    .click()
                    .keyDown(txtUsername, Keys.SHIFT)
                    .sendKeys(txtUsername,"8122995213")
                    .keyUp(txtUsername, Keys.SHIFT)
                    .moveToElement(txtpassword)
                    .click()
                    .keyDown(txtpassword, Keys.SHIFT)
                    .sendKeys(txtpassword,"guna@123")
                    .keyDown(txtlogin, Keys.SHIFT)
                    .build();
                     builder.perform();
	}
}









