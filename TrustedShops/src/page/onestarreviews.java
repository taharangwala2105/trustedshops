package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class onestarreviews {
	public WebDriver driver;
	@Test
	public void onestar(WebDriver driver) throws InterruptedException{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-750)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/presentation-frame/shop-profile/div/div/div[1]/div/ratings-summary/div[2]/div[2]/div[3]/div[5]/div[1]")).click();
	}
}
