package SeleniumAssignment.com.c;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAssignment {
	private static final WebElement login = null;
	public static void main(String []args) throws InterruptedException {
		String user="harika@gmail.com";
		String pwd="H_a-rika@26";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HMADDILA\\eclipse-workspace-1\\cap.com\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		String title=driver.getTitle();
		System.out.println("Title of page: "+title);	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(pwd);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		//for click on sign in
		driver.findElement(By.xpath("//button[@id=\"SubmitLogin\"]")).click();
		Actions action=new Actions(driver);
		WebElement hover=driver.findElement(By.xpath("//a[@title=\"Women\"]"));
		action.moveToElement(hover).perform();
		Thread.sleep(3000);
		//
		driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
		WebElement hover1=driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
		js.executeScript("window.scrollBy(0,700)");
		action.moveToElement(hover1).perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[2]/span[1]")).click();
		//adding quantity
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/p[1]/a[2]/span[1]")).click();
		//
		Select se=new Select( driver.findElement(By.xpath("//select[@id='group_1']")));
		se.selectByIndex(2);
		//selecting color
		driver.findElement(By.cssSelector("#color_14")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.cssSelector("body.product.product-1.product-faded-short-sleeve-tshirts.category-5.category-tshirts.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div.clearfix div.layer_cart_cart.col-xs-12.col-md-6 div.button-container:nth-child(5) a.btn.btn-default.button.button-medium > span:nth-child(1)")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,800)");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")).click();
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"cgv\"]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
		js.executeScript("window.scrollBy(0,400)");
        driver.close();	
		driver.quit();
		driver.findElement(By.id("user_email_login"));
		WebElement username=driver.findElement(By.id("user_mail_id"));
		driver.findElement(By.id("user_email_login"));
		driver.findElement(By.id("user_password"));
		WebElement password=driver.findElement(By.id("user_password"));
		username.sendKeys("abc@gmail.com");
		password.sendKeys("your_password");
		login.click();

	}
}

