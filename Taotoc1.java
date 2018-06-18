
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Taotoc1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhavsingh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String urladd="http://10.0.1.86/tatoc";
	driver.get(urladd);
	driver.findElement(By.linkText("Basic Course")).click();
	driver.findElement(By.className("greenbox")).click();
	driver.close();
	}
	

}
