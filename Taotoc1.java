
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
	WebElement actualcolour=driver.findElement(By.cssSelector("#answer"));
	Boolean b=false;
	while(!b)
	{
		WebElement varcolour=driver.findElement(By.id("child"));
	driver.findElement(By.cssSelector("body > center > a:nth-child(7)")).click();
	b=varcolour.equals(actualcolour);
	if(b==true)
		break;
	}
	driver.findElement(By.linkText("Proceed")).click();
	
	driver.close();
	}
	

}
