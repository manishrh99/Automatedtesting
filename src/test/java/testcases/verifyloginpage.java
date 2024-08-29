package testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testingpages.webloginpage;
import static reader.configreader.getUrl;
import static reader.configreader.getusername;
import static reader.configreader.getpassword;

public class verifyloginpage extends webloginpage {
	public static WebDriver driver;
	public Properties prop;
	
	@BeforeTest
	//open page method
	public static void openpage() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(getUrl());
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public static void loginfunctionality() throws IOException {
		webloginpage.loginpage(driver).click();
		webloginpage.username(driver).sendKeys(getusername());
		webloginpage.password(driver).sendKeys(getpassword());
		webloginpage.loginclick(driver).click();
		
		
		
	}
	@Test(priority=2)
	
	public static void addproduct() {
		System.out.println("addproduct");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)","");
		webloginpage.selectlaptopbutton(driver).click();
		webloginpage.selectlaptopmodel(driver).click();
		webloginpage.addtocart(driver).click();
	}

}
