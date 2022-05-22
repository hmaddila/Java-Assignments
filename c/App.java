package SeleniumAssignment.com.c;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
   
    {
        System.out.println( "Hello World!" );
    }
    public static void main(String[] args) throws InterruptedException
    { // TODO Auto-generated method stub

    String url = "http://www.facebook.in/";
    System.setProperty("webdriver.chrome.driver","C:\\Users\\HMADDILA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(url);
    Thread.sleep(3000);
    }
}
