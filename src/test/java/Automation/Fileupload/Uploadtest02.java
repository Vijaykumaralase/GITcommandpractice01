package Automation.Fileupload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadtest02 {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver",
				 "H:\\MY AUTOMATION\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.google.com/");
		System.out.println(Driver.getTitle());
		

	}

}
