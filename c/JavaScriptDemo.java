package SeleniumAssignment.com.c;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class JavaScriptDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HMADDILA\\eclipse-workspace-1\\cap.com\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Title of page: "+title);

		driver.findElement(By.name("username")).sendKeys("harika@yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'stay signed')]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('persistent').click()");		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='persistent']"));
		js.executeScript("arguiment[0].clcik()", checkbox);
		driver.findElement(By.name("//input[@id='passwd']")).sendKeys("****");

		driver.close();
		driver.quit();
	}

}
