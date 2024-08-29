package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class excelreadandwrite {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\manis\\eclipse-workspace\\electronics\\TestData\\manish.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String username = w1.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		String password = w1.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);
		System.out.println( password);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		WebElement firstname =driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/div/input"));
		firstname.sendKeys(username);
		WebElement lastname = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/div/input"));
		lastname.sendKeys(password);
		
		

	}

}
