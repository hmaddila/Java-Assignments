package SeleniumAssignment.com.c;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunnner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HMADDILA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("Title of page :"+title);
		//driver.close();
		//driver.quit();
		String exUrl="https://www.google.co.in/imghp?hl=en&tab=ri&ogbl";
		driver.getPageSource();
		String cUrl=driver.getCurrentUrl();
		if(exUrl.equals(cUrl)) {

		}
	}

}
