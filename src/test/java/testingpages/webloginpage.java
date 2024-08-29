package testingpages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class webloginpage {
private static WebElement element;
//method 1
	public static   WebElement loginpage(WebDriver driver) {
		element = driver.findElement(By.id("login2"));
		return element;
		}
	//method 2
	public static WebElement username(WebDriver driver) {
		 element = driver.findElement(By.id("loginusername"));
		 return element;
	}
	//method 3
	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.id("loginpassword"));
		 return element;
	}
	//method 4 
	public static WebElement loginclick(WebDriver driver) {
		 element = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"and@onclick=\"logIn()\"]"));
		 return element;
	}
	
	//method 5 
	public static WebElement selectlaptopbutton(WebDriver driver) {
		 element = driver.findElement(By.xpath("//a[@id=\"itemc\"][2]"));
		 return element;
	}
	//method6
	public static WebElement selectlaptopmodel(WebDriver driver) {
		 element = driver.findElement(By.xpath("//*[contains(text(),'Sony vaio i5')]"));
		 return element;
	}
	//method7 
	public static WebElement addtocart(WebDriver driver) {
		 element = driver.findElement(By.xpath("//a[@class=\"btn btn-success btn-lg\"]"));
		 return element;
	}

	
	}

