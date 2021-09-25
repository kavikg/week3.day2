package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
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
		To.sendKeys("MDU", Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> trainname = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		List<String> trname = new ArrayList<String>();
		
		for (WebElement we : trainname) {
			trname.add(we.getText());
					
		}
		System.out.println(trname);	
		int size = trainname.size();
		System.out.println("Size:" + size);
		
		Set<String> tname = new TreeSet<String>();
		tname.addAll(trname);
		System.out.println(tname);
  
        int size1 = tname.size();
		System.out.println("Size of the set:" + size1);
	}

}
