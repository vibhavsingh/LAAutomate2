import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoTest1Sel
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhavsingh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String urladd="http://demo.guru99.com/test/newtours/";
		String expectedTitle="Welcome:Mercury Tours";
		String actualTitle="";
		driver.get(urladd);
		actualTitle=driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Not Passed");
		}
	driver.close();
	}
}