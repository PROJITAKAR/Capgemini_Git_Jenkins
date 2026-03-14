package jenkinsProgram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jenkins1Test {
	
	@Test
	public void sample1Test()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leetcode.com/");
		System.out.println("Title: "+ driver.getTitle());
		driver.quit();
	}
}

//cd location of project
//mvn validate
//mvn compile
//mvn test
