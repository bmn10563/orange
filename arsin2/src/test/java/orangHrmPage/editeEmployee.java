package orangHrmPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class editeEmployee {
	WebDriver driver;

	public editeEmployee(WebDriver driver) {
		//this.driver= driver;
	}	

	By editLink = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[1]/div[2]/div/div/button[2]/i");
	By firstName= By.name("firstName");
	By middleName= By.name("middleName");
	By plastName= By.name("lastName");

By saveBtn= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button");
	public void clickEditLink() {

		driver.findElement(editLink).click();
	}

	public void enterInformation() {

		driver.findElement(firstName).clear();
		driver.findElement(firstName).sendKeys();

		driver.findElement(middleName).clear();
		driver.findElement(middleName).sendKeys();

		driver.findElement(plastName).clear();
		driver.findElement(plastName).sendKeys();
	}
	
	public void clickSaveBtn() {
		
		driver.findElement(saveBtn).click();
	}
}
