

import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
class Tatocnew {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhavsingh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc");
		driver.findElement(By.linkText("Basic Course")).click();
		driver.findElement(By.className("greenbox")).click();
		driver.switchTo().frame("main");
		String s1=driver.findElement(By.id("answer")).getAttribute("class");
		boolean b=true;
		while(b)
		{
			driver.switchTo().frame("child");
			String s2=driver.findElement(By.id("answer")).getAttribute("class");
			if(s1.equals(s2))
			{
				b=false;
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.switchTo().parentFrame();
			driver.findElement(By.linkText("Proceed")).click();
			
			}
			else
			{
				driver.switchTo().parentFrame();
				driver.findElement(By.linkText("Repaint Box 2")).click();
			}
		}
		driver.close();
	
		
	}
		

}
