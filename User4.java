package week1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class User4 {

	


		@Test
		public void ui2() throws IOException {
			
			WebDriverManager.chromedriver().firefoxdriver().setup();

			ChromeDriver driver = new ChromeDriver();

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--remote-allow-origins=*");

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.getcalley.com/page-sitemap.xml");
			
			
			driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[4]/td[1]/a")).click();

			File s = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./user/Homepage4.png");
			FileUtils.copyFile(s, dest);

	
	
	
	
	
	
		}	
	
	
}
