package testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class openhulk {

	
	ChromeDriver driver= null;
	
	
	@BeforeTest
	
	public void setup()
	
	//public static void main(String[] args) throws InterruptedException, IOException 
	
	{	
		System.setProperty("webdriver.chrome.driver", "/Users/temp/Desktop/chromedriver");
		driver= new ChromeDriver();
		
		
	}
	
	
	@Test
	
	public void login() throws IOException, InterruptedException
	
	{
		driver.get("http://hulk.nearbuydev.in");
		driver.manage().window().maximize();
	
		File src= new File("/Users/temp/Documents/testdata/data1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1= wb.getSheetAt(0);
		String user_name= sheet1.getRow(0).getCell(0).getStringCellValue();
		String password= sheet1.getRow(0).getCell(1).getStringCellValue();
		
		
		
		WebElement signin= driver.findElement(By.xpath("//a[@class='btn red default']"));
		signin.click();
		
		Thread.sleep(5000);
		WebElement emailid=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", emailid);
		emailid.sendKeys(user_name);
		
		
		Thread.sleep(5000); 
		WebElement next=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next.click();
		
		Thread.sleep(5000); 
		WebElement pass=driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
		pass.sendKeys(password);
		
		Thread.sleep(5000); 
		WebElement next2=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next2.click();
		
		Thread.sleep(5000); 
		WebElement allow=driver.findElement(By.xpath("//span[text()='Allow']"));
		allow.click();
		
		Thread.sleep(5000); 
		driver.get("http://hulk.nearbuydev.in");
		
		}

		@AfterTest

		public void teardowntest() {
	
			driver.close();
			driver.quit();
			System.out.println("Test is complete");
	
									}


}


