package draganddrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DragandDrop1 {

	public DragandDrop1() {
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
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		try {
		String url ="https://jqueryui.com/resources/demos/droppable/default.html";
		driver.get(url);
		driver.manage ().window().maximize();
		
		WebElement sourceElement = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement targetElement = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Thread.sleep(20000);
		Actions actions =new Actions (driver);
		actions.clickAndHold(sourceElement)
		.moveToElement (targetElement)
		.release(targetElement)
		.build();
		actions.perform();
		} finally {
			
			driver.close();
		System.out.println(" workong fine");
	}

}
}