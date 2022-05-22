package SeleniumAssignment.com.c;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FrameExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HMADDILA\\eclipse-workspace-1\\cap.com\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("name")).sendKeys("XYZ");
		System.out.println("Entered name");
		Thread.sleep(3000);

		WebElement frame = driver.findElement(By.id("frm1"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		System.out.println("Entered into the frame");

		Select course=new Select(driver.findElement(By.id("course")));
		course.selectByVisibleText("Java");
		System.out.println("Selected the course");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		System.out.println("Switched to default content");
		Thread.sleep(3000);

		driver.findElement(By.id("name")).sendKeys("Hi");
		System.out.println("Entered name");

		java.util.List <WebElement> fcount= driver.findElements(By.tagName("iframe"));
		System.out.println("Frames count= "+fcount.size());

		driver.close();
	}
}
