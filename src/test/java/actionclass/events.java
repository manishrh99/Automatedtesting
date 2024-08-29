package actionclass;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class events {

	public static void main(String[] args) {
		//initiate webdriver
		WebDriver driver = new ChromeDriver();
		//adding implicit wait of 15secs
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//opening the page
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		//identify  element xpath
		WebElement m =driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]"));
		//object of Actions class to move then click
		Actions a = new Actions(driver);
		a.moveToElement(m).click().build().perform();
		//get text after click
		WebElement t = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div"));
		System.out.println("Text after click :"  +t.getText());
		
		
		//identify xpath element for double click
		WebElement n = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[3]"));
		//object of actions to move and then click
		Actions b = new Actions(driver);
		b.moveToElement(n).doubleClick().build().perform();
		//get text after click
		WebElement q = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/p"));
		System.out.println("Text after click:" + q.getText());
		
		//identify xpath for right click
		WebElement r =driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]"));
		//action class
		Actions c= new Actions(driver);
		c.moveToElement(r).contextClick().build().perform();
		// closing browser
		driver.quit();
	}
	
	

}
