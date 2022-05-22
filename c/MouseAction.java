package SeleniumAssignment.com.c;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HMADDILA\\eclipse-workspace-1\\cap.com\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.browserstack.com/");

		Actions a = new Actions(driver);


		//Double click on element

		WebElement trialaction = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));

		a.doubleClick(trialaction).perform();
		driver.close();
		driver.quit();

	}

}




