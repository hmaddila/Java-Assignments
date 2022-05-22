package SeleniumAssignment.com.c;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//system property for chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HMADDILA\\eclipse-workspace-1\\cap.com\\drivers\\chromedriver.exe");
		
		//instantiate a chromedriver class
		WebDriver driver = new ChromeDriver();
		
		//launch website
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
		//using select class for selecting value from dropdown
		Select dropdown=new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Dtabase Testing");
		
		//close the browser
		driver.close();
	}

}
