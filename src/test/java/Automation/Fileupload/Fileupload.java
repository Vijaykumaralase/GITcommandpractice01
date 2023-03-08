package Automation.Fileupload;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				 "H:\\MY AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("pickfiles")).click();
		//driver.findElement(By.linkText("Choose File")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Vijaykumar\\Documents\\upload2\\fileuploadv3.exe");
	

	}

}
