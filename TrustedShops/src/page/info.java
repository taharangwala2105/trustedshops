package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class info {
	public WebDriver driver;
	@Test
	public void infoicon(WebDriver driver) throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)", "");
		WebElement icon = driver.findElement(By.xpath("/html/body/presentation-frame/shop-profile/div/div/div[1]/review-area/async-list/review[1]/review-header/loading-line[2]/div"));
		Actions actions = new Actions(driver);
		actions.moveToElement(icon).perform();
		Thread.sleep(2000);
	}
}

