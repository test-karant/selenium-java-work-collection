package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample_test {
	
//	@AfterMethod
//	public void quitDriver() {
//		if(driver==!null) {
//			driver.quit();
//		}
//	}

	public static void main(String[] args) throws InterruptedException {
		
	By StartExploringBtn = By.xpath("//a[text()='Start Exploring']");
	By ProductsDD = By.xpath("(//a[@title=\"Products & Services\"])[1]");
	By DDItem1 = By.xpath("//a[@title=\"Overview\"]");
	By DDItem2 = By.xpath("//a[@title=\"Electronic Health Records\"]");
	
	By NameInput = By.xpath("//label[contains(text(),\"Name\")]//following-sibling::input[@name=\"name\"]");
	By EmailInput = By.xpath("//label[contains(text(),\"Email\")]//following-sibling::input[@name=\"email\"]");
	By PwdInput = By.id("exampleInputPassword1");
	By Tickbox = By.id("exampleCheck1");
	By SelectDD = By.id("exampleFormControlSelect1");
	By StudentRadio = By.id("inlineRadio1");
	By EmployedRadio = By.id("inlineRadio2");
	By DisabledRadio = By.id("inlineRadio3");
	By DObInput = By.xpath("//input[@type=\"date\"]");
	By FormSubmit = By.xpath("//input[@type=\"submit\"]");
	By TwoWayDataBindingInput = By.xpath("//h4[contains(text(),'Two-way Data Binding example')]/input[@name=\"name\"]");
	By SuccessMsg = By.xpath("//div[contains(@class,'alert alert')]");
	By Success2 = By.cssSelector(".alert-success");
	
	By AddProduct = By.xpath("//button[contains(text(),'Add')]");
	By CheckoutBtn = By.xpath("//a[contains(text(),'Checkout')]");
	
	
	    //WebDriverManager.chromedriver().clearDriverCache();
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
//		System.out.println("First tickbox is selected True/False: "+driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
//		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
//		System.out.println("First tickbox is selected True/False: "+driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
//		List<WebElement> Ticks = driver.findElements(By.xpath("//div[@id=\"checkbox-example\"]//input[@type=\"checkbox\"]"));
//		//System.out.println(driver.findElement(By.cssSelector("input[value='checkbox")).getSize());
//		System.out.println("Number of checkboxes in the page: "+Ticks.size());
		
		driver.get("https://rahulshettyacademy.com/angularpractice/#");
		driver.manage().window().maximize();
		driver.findElement(NameInput).sendKeys("Kan");
		driver.findElement(EmailInput).sendKeys("kan@mailinator.com");
		driver.findElement(PwdInput).sendKeys("Test@123");
		driver.findElement(Tickbox).click();
		
		WebElement genderDD = driver.findElement(SelectDD);
		
		Select dd = new Select(genderDD);
		dd.selectByVisibleText("Male");
		
		driver.findElement(StudentRadio).click();
		driver.findElement(DObInput).sendKeys("31/03/2222");
		driver.findElement(FormSubmit).click();
		System.out.println(driver.findElement(Success2).getText());
		Thread.sleep(2000);
		
		driver.quit();
	}
}
