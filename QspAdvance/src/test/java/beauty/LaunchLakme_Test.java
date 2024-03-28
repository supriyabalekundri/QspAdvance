package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchLakme_Test {

	@Test
	public void lakme()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Running script in command prompt using url only
		String Url = System.getProperty("url");
		driver.get(Url);
	
		//driver.quit();
	}
}
