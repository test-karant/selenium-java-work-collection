package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		String URL = "https://rahulshettyacademy.com/AutomationPractice/";		
		By DD = By.id("autocomplete");
		By suggestions = By.xpath("//ul[@id=\"ui-id-1\"]//div[@class=\"ui-menu-item-wrapper\"]");

		driver.get(URL);
		wait.until(ExpectedConditions.visibilityOfElementLocated(DD));
		driver.findElement(DD).sendKeys("Ind");
		wait.until(ExpectedConditions.visibilityOfElementLocated(suggestions));

		List<WebElement> ac = driver.findElements(suggestions);

		for(WebElement suggestion: ac) {
			if(suggestion.getText().equalsIgnoreCase("India")) {
				suggestion.click();
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}
}