package googleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitTest {

	public static void main(String[] args) {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println("Title :"+title);
		String gmail = driver.findElement(By.xpath("//*[@class='gb_h gb_i']/a")).getText();
		System.out.println("gmail :"+gmail);
		driver.quit();

	}

}
