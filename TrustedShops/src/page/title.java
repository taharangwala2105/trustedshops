package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class title {
	protected WebDriver driver;
	@Test
	public void Pagetitle() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trustedshops.de/bewertung/info_X77B11C1B8A5ABA16DDEC0C30E7996C21.html");
		System.out.println("Page title is : " + driver.getTitle());

	}
}
