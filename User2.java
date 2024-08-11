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

public class User2 {

	@Test
	public void ui1() throws IOException {
		
		WebDriverManager.chromedriver().firefoxdriver().setup();

		ChromeDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		
		
        driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[2]/td[1]")).click();
		
		File sr = driver.getScreenshotAs(OutputType.FILE);
		File destin = new File("./user/Homepage2.png");
		FileUtils.copyFile(sr, destin);
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
}
