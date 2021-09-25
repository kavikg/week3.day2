package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erailsort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.erail.in");
		WebElement From = driver.findElement(By.id("txtStationFrom"));
		From.clear();
		From.sendKeys("Chennai Egmore", Keys.ENTER);
		WebElement To = driver.findElement(By.id("txtStationTo"));
		To.clear();
		To.sendKeys("HYB", Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement> trainname = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		List<String> trainlist = new ArrayList<String>();
		int size = trainname.size();
		System.out.println("Size:" + size);

		for (WebElement webElement : trainname) {
			trainlist.add(webElement.getText());
			

		}
		
		Collections.sort(trainlist);
		for (String str : trainlist) {
			System.out.println(str);

		}

		
	}
}
