package orangeHrmLivePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginFormNew {
	
	WebDriver driver;
	
	public  loginFormNew(WebDriver driver) {
		this.driver= driver;
	}
	
	By headPage= By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/h5");
	By userName= By.cssSelector("input[placeholder='Username']");
	By password= By.cssSelector("input[placeholder='Password']");
	By loginBtn= By.cssSelector("button.oxd-button");
	By forgetLink= By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p");
	By massageBox = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
	
	public String getHeadPage() {
		String head= driver.findElement(headPage).getText();
		return head;
	}
	
	public void enterUserName(String un) {
		driver.findElement(userName).sendKeys(un);
	}
	public void enterPassword(String ps) {
		driver.findElement(password).sendKeys(ps);
	}
	public void clickBtn() {
		driver.findElement(loginBtn).click();
	}
	public void clickForget() {
		driver.findElement(forgetLink).click();
	}
	public String getmassage() {
		String massage= driver.findElement(massageBox).getText();
		return massage;
	}
}

