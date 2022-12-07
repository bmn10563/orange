package orangHrmPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logForm {
	WebDriver driver;
	
	public  logForm(WebDriver driver) {
		this.driver=driver;
	}
	
	By userName= By.name("username");
	By password= By.name("password");
	By clickBtn= By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	public void enterUserName(String u) {
		driver.findElement(userName).sendKeys(u);
	}
	
	public void enterPassword(String p) {
		driver.findElement(password).sendKeys(p);
	}
	
	public void clickBtn() {
		
		driver.findElement(clickBtn).click();
	}
}
