package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(sourceElement, targetElement).build().perform();
		//identify element after drop
		WebElement i = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/div[1]/div[2]/p"));
		System.out.println(" after drag and drop complete message is :"+ i.getText());		
		

	}

}
