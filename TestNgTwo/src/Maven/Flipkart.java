package Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Yonas Petros\\chromedriver\\chromedriver.exe");
		
		WebDriver web= new ChromeDriver();
		web.get("https://www.flipkart.com/");
		web.manage().window().maximize();
		web.findElement(By.xpath("//button[contains(@class,'2doB4z')]")).click();
		web.findElement(By.xpath("//input[contains(@autocomplete,'off')]")).click();
		web.findElement(By.xpath("//input[contains(@autocomplete,'off')]")).sendKeys("iphone 11");
		web.findElement(By.xpath("//input[contains(@autocomplete,'off')]")).sendKeys(Keys.ARROW_DOWN);
		web.findElement(By.xpath("//input[contains(@autocomplete,'off')]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		web.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*")).click();
		//web.findElement(By.xpath("(//span[contains(.,'Add to Compare')])[1]")).click();
		web.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		//web.findElement(By.xpath("(//button[contains(@class,'3AWRsL')])[1]")).click();
	//	web.findElement(By.xpath("//button[contains(.,'ADD TO CART')]")).click();
		web.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")).click();

	}

}
