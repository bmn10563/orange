package orangHrmPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class deleteUser {
	WebDriver driver;
	public  deleteUser(WebDriver driver) {
		//this.driver= driver;
		
	}	
	By clickImageDelete = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[1]/div[2]/div/div/button[1]/i");
	
	public void clickDelete() {
		
		driver.findElement(clickImageDelete).click();
	}

}
