package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyoperation {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();

	      // adding implicit wait of 15 secs
	      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	      // Opening the webpage where we will identify an element
	      driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");

	      // Identify the first input box with path locator
	      WebElement e = driver.findElement(By.xpath("//*[@id='fullname']"));

	      // Actions class
	      Actions a = new Actions(driver);

	      // moving to an input box and clicking on it
	      a.moveToElement(e).click();
	      // key UP and DOWN action for SHIFT
	      a.keyDown(Keys.SHIFT);
	      a.sendKeys("selenium").keyUp(Keys.SHIFT).build().perform();
	      
	      System.out.println("text entered: " + e.getAttribute("value"));
	}

}
