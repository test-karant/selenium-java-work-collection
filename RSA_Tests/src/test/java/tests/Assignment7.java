package tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment7 {

	public static void main(String[] args) {

		By tableBody = By.xpath("//table[@name=\"courses\"]");
		By tableRows = By.xpath("//table[@name=\"courses\"]//tr");
		By tableColumns = By.xpath("//table[@name=\"courses\"]//th");
		By secondColumn = By.xpath("//table[@name=\"courses\"]//tr[3]//td");


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//Javascript js =(Javascript) driver;
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,600)");

		List<WebElement> rows = driver.findElements(tableRows);
		System.out.println("Total number of rows in table including header: "+rows.size());

		List<WebElement> columns = driver.findElements(tableColumns);
		System.out.println("Total number of column in table: "+columns.size());
		
		WebElement Table = driver.findElement(By.id("product"));

		List<WebElement> sColumn = Table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th"));
		
		System.out.println(sColumn.get(0).getText());
		System.out.println(sColumn.get(1).getText());
		System.out.println(sColumn.get(2).getText());

		
//		for(WebElement cell:sColumn) {
//
//			System.out.println("Text in second column rows: "+cell.getText());
//
//		}
		
		System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size());

		System.out.println(driver.findElements(By.cssSelector(".table-display th")).size());

		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());
		driver.quit();
	}

}
