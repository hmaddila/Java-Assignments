package SeleniumAssignment.com.c;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HMADDILA\\eclipse-workspace-1\\cap.com\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String e=driver.getTitle();
		System.out.println("Page Title: "+e);
		driver.findElement(By.name("q")).sendKeys("https://clarity.fs.capgemini.com/"+Keys.ENTER);
		System.out.println("Successfully navigated");
		String PageSource = driver.getPageSource();
		System.out.println("Page Source: "+PageSource);
		boolean result = driver.getPageSource().contains("Google");
		System.out.println("Webpage contains : "+result);
		driver.navigate().to("https:/amazon.in");
		System.out.println("Navigated into  the given website");
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Navigated back from google.in");
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println("Navigated forward to amazon.in");
		Thread.sleep(3000);
		driver.navigate().refresh();
		System.out.println("Website refreshed");
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/login/");
		System.out.println("Navigated forward to Facebook.com");
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("123@gmail.com");
		System.out.println("Entered username");
		Thread.sleep(3000);
		element.clear();
		System.out.println("Element cleared");
		WebElement check=driver.findElement(By.xpath("//div[@class='_9axz']"));
		check.isDisplayed();
		System.out.println(check);
		driver.close();
	}

}
