package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sumofpercentages {
public WebDriver driver;

public void sumof(WebDriver driver) throws InterruptedException{
	WebElement webElem = driver.findElement(By.xpath("/html/body/presentation-frame/shop-profile/div/div/div[1]/div/ratings-summary/div[2]/div[2]/div[3]/div[5]/div[3]/span[1]"));
	int a = Integer.parseInt(webElem.getText());
	WebElement webElem1 = driver.findElement(By.xpath("/html/body/presentation-frame/shop-profile/div/div/div[1]/div/ratings-summary/div[2]/div[2]/div[3]/div[4]/div[3]/span[1]"));
	int b = Integer.parseInt(webElem1.getText());
	WebElement webElem2 = driver.findElement(By.xpath("/html/body/presentation-frame/shop-profile/div/div/div[1]/div/ratings-summary/div[2]/div[2]/div[3]/div[3]/div[3]/span[1]"));
	int c = Integer.parseInt(webElem2.getText());
	WebElement webElem3 = driver.findElement(By.xpath("/html/body/presentation-frame/shop-profile/div/div/div[1]/div/ratings-summary/div[2]/div[2]/div[3]/div[2]/div[3]/span[1]"));
	int d = Integer.parseInt(webElem3.getText());
	WebElement webElem4 = driver.findElement(By.xpath("/html/body/presentation-frame/shop-profile/div/div/div[1]/div/ratings-summary/div[2]/div[2]/div[3]/div[1]/div[3]/span[1]"));
	int e = Integer.parseInt(webElem4.getText());
	int add = a + b + c + d + e;
	System.out.print(add + " -> ");
	if((add >= 100)) {
   	 System.out.println("Sum of percentages is greater than 100");
    }
	else {
		System.out.println("Sum of percentages is less than 100");
	}
}
}
