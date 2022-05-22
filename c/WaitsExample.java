package SeleniumAssignment.com.c;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitsExample {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HMADDILA\\eclipse-workspace-1\\cap.com\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//lunch the browser
		driver.get("https://google.com");
		//displays name of the page
		String title=driver.getTitle();
		System.out.println("Title of page: "+title);
		driver.findElement(By.name("q")).sendKeys("automation step by step"+Keys.ENTER);
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement mylink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step: Never Stop Learning ...")));
		mylink.click();
		//fluent wait
		//Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
			/*.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(1))
			.ignoring(org.openqa.selenium.NoSuchElementException.class);
		   fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath(null)));*/
		
			driver.close();
		    driver.quit();
	}

	
}
