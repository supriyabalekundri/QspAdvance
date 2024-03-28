package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchPizza_Test {

	@Test
	public void pizza()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pizzahut.co.in/menu/pizzas");
		driver.quit();

	}
}
