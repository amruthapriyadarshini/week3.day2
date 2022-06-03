package week3.day2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// Open the browser
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("https://www.ajio.com");

		// maximize
		driver.manage().window().maximize();
		WebElement wb1 ;
		WebElement wb2;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.
				xpath("//div[@class='searchbar-view']/div/input")).
				sendKeys("bags");
		//Clicking on search button
		driver.findElement(By.
				xpath("//div[@class='searchbar-view']//span")).click();
		//Checkbox option for Men
		//driver.findElement(By.xpath("//input[@id='Men']")).click();
		//WebElement findElement = driver.findElement(By.id("Men"));
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(1000);
		//Checkbox option for Fashion bags
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		//Displaying the number of items.
		Thread.sleep(1000); 
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("size of items " + text);
		
		//brand
		 List<WebElement> wbListBrand = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Brand size " + wbListBrand.size());
		for(int i=0;i< wbListBrand.size();i++) {
			wb1 = wbListBrand.get(i);
			System.out.println("Brand name " +wb1.getText());
		}
		//Brand name description
		List<WebElement> lstBrandName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for(int i=0;i< lstBrandName.size();i++) {
			wb2 = lstBrandName.get(i);
			System.out.println("Brand desc " +wb2.getText());
		}


	}

}
