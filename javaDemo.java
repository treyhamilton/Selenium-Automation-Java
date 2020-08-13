package automation.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class javaDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/treyhamilton/Documents/z15 Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String actualTitle = driver.getTitle();
		String expectedTitle = "google";
		
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		searchBox.sendKeys("Hello, this is automated using Selenium");
		
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
		searchButton.click();
		
		if (actualTitle.equalsIgnoreCase(expectedTitle)) 
		{
			System.out.println("Automation Test Successful");
		}
		else 
		{
			System.out.println("Automation Test Failure");
		}

		driver.close();
	}

}
