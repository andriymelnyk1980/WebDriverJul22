package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
				WebElement CreatNewAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
				CreatNewAccount.click();
				
				WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
				FirstName.sendKeys("Andrew");
				WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
				LastName.sendKeys("Melnyk");
				WebElement MobileNum = driver.findElement(By.xpath("//input[@name='reg_email__']"));
				MobileNum.sendKeys("aby@com");
				WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
				Password.sendKeys("abc@com");
			
						WebElement Day = driver.findElement(By.name("birthday_day"));
						Select ddDay = new Select(Day);
						ddDay. selectByVisibleText("30");
						
						WebElement Month = driver.findElement(By.name("birthday_month"));
						Select ddMonth = new Select(Month);
						ddMonth. selectByVisibleText("Apr");
						
						WebElement Year = driver.findElement(By.name("birthday_year"));
						Select ddYear = new Select(Year);
						ddYear. selectByVisibleText("1980");
						
						System.out.println("Selected Month is " + ddMonth.getFirstSelectedOption().getText());
						
					List<WebElement> Months = ddMonth.getOptions();
					
					for (WebElement elm: Months) {
						System.out.println(elm.getText());
						
					}
					List<WebElement> AllMonths = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
					for(WebElement elm: AllMonths) {
						System.out.println(elm.getText());
						
				
						}
						
						String Gender = "Male";
						
						WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
						WebElement Male = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
						WebElement Other = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
						
						if(Gender.equals("Female")) {
							Female.click();
						}else if(Gender.equals("Male")) {
							Male.click();
						}else {
							Other.click();
						}

			WebElement GenderRadioBtn = driver.findElement(By.xpath("//label[text()='" + Gender +"']/following-sibling::input"));	
			GenderRadioBtn.click();
				
			
			String Xpath = "//label[text()='" + Gender + "']/following-sibling::input";
	        
	        WebElement GendgerRadioBtn = driver.findElement(By.xpath(Xpath));
	        GendgerRadioBtn.click();
						
	        String XPath = "//label[text()='PlaceHolder']/following-sibling::input";
	        String newxpath = XPath.replace("PlaceHolder", Gender);
	        WebElement GenderRadioBtn1 = driver.findElement(By.xpath(newxpath));        
	        GenderRadioBtn.click();	
	}

}

