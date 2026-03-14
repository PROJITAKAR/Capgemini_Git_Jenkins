package jenkinsProgram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jenkins2Test {
	@Test
	public void sample2Test()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.youtube.in//");
		System.out.println("Title: "+ driver.getTitle());
		driver.quit();
	}

}
