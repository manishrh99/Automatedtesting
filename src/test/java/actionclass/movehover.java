package actionclass;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movehover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/selenium/practice/menu.php#");
		WebElement a = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/nav/div/a"));
		//get colour in rgb format
	String s = a.getCssValue("color");
	System.out.println("The rgb colour of element is:"+s);
	//actions for click and hold
	Actions b=new Actions(driver);
	b.clickAndHold(a).build().perform();
	 
	//get element colour
	String t = a.getCssValue("color");
	System.out.println("The rgb colour of the element after is:" +t);
	
	
		
		

	}

}
