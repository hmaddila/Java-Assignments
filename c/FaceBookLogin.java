package SeleniumAssignment.com.c;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
public class FaceBookLogin {
	ChromeDriver driver;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HMADDILA\\eclipse-workspace-1\\cap.com\\drivers\\chromedriver.exe");

		//instantiate a chromedriver class
		WebDriver driver = new ChromeDriver();

		//launch website
		driver.navigate().to("https://www.facebook.com");
		//driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println("Title of page: "+title);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//String url = null;
		//driver.get(url);
		String urlFromWebpage=driver.getCurrentUrl();
		if(urlFromWebpage.equals("https://www.facebook.com/")) {
		System.out.println("PASS");
		}else {
		System.out.println("FAIL");
		}
		//Button activation
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Maddila");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Haritha");//lastname
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("7980000000");//mobile number
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")).sendKeys("7_H/a@ika");//password
		//entering into the dob option
		Select date = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		date.selectByVisibleText("9");
		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByVisibleText("Feb");
		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		year.selectByVisibleText("1998");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click(); //this code is working for female
		//driver.findElement(By.id("#u_9_5_RY").click(); //this code is working for male
		//driver.findElment(By.cssSelector("body.fbIndex.UIPage_LoggedOut._-kb._605a.b_c3pyn-ahh.chrome.webkit.win.x1-5.Locale_en_GB.cores-gte4._19_u.hasAXNavMenubar:nth-child(2) div._n8._3qx._8idq._8esf._8f3m._8fgk.uiLayer._3qw:nth-child(25) div._n9 div._n3 div._8ien div._58mf:nth-child(2) div.registration_redesign div._8fgl._9l2p div.large_form:nth-child(3) div.mtm._5wa2._5dbb:nth-child(7) span._5k_3 span._5k_2._5dba:nth-child(3) > label._58mt")).click();//this is for others
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).submit();
		driver.close();
		driver.quit();

	}
}
