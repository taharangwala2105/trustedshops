package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Grade {
public WebDriver driver;

	public void grade(WebDriver driver)throws InterruptedException{
		Boolean Display = driver.findElement(By.xpath("/html/body/presentation-frame/shop-profile/div/div/div[1]/div/ratings-summary/div[2]/div[1]/div[1]/div[1]/span[1]")).isDisplayed();
		System.out.println("Element displayed is :"+Display);
		WebElement webElem = driver.findElement(By.xpath("/html/body/presentation-frame/shop-profile/div/div/div[1]/div/ratings-summary/div[2]/div[1]/div[1]/div[1]/span[1]"));
		float i = Float.parseFloat(webElem.getText());
        System.out.print(i +" -> ");
		if((i >= 0.0)) {
        	 System.out.println("Value greater than 0");
         }
		else {
			System.out.println("Not greater than 0");
		}
		Thread.sleep(3000);
	}
}
