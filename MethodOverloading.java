package seleniumexercise;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import seleniumexercise.MethodOverloading;

public class MethodOverloading {

 

	

public static void  main (String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\GUNA\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	Thread.sleep(20000);
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	options.merge(capabilities);
	ChromeDriver driver = new ChromeDriver(options);}



}


