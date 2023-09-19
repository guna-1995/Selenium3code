package seleniumexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignin {

	public FacebookSignin() {
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
		driver.get("https://www.facebook.com/reg/");
		driver.findElement(By.xpath("//input [@name=\"firstname\"]")).sendKeys("guna");
		driver.findElement(By.xpath("//input [@name=\"lastname\"]")).sendKeys("Ramanujam");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("gunaramanujam95@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("8122995213");
		Thread.sleep(2000);
	WebElement day=	driver.findElement(By.id("day"));
	Select  select=new Select(day);
	select.selectByValue("15");
	Thread.sleep(5000);
	WebElement month=	driver.findElement(By.id("month"));
	Select select1=new Select(month);
	select1.selectByValue("05"); 
	
	WebElement year=	driver.findElement(By.id("year"));
	Select select2=new Select(year);
	select2.selectByValue("1995"); 
	WebElement radioButton1 =driver.findElement(By.xpath("//input[@value='2']"));
	//check if the radio button is already selected
	if (!radioButton1.isSelected()) {
	//select the radio button
	radioButton1.click();
	}	
	driver.findElement(By.xpath("//input[@id='u_0_s_Xz']")).click();
	}

}
