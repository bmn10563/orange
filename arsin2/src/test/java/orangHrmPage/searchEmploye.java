package orangHrmPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class searchEmploye {
	WebDriver driver;
	public  searchEmploye(WebDriver driver) {
		this.driver= driver;
	}
	
	By pim= By.linkText("PIM");
	
	By firstNameSearch= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input");
   
     	By searchBtn= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
	By resetBtn= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]");
	//Select employtStatus = new Select(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div")));
	
	//Select employmentStatus= new Select(null);
	
	public void clickPim() {
		driver.findElement(pim).click();
	} 

	
	public void enterFirtSearch(String asd) {
		driver.findElement(firstNameSearch).clear();
		driver.findElement(firstNameSearch).sendKeys(asd);
	}
	public void clickSearch() {
		
		driver.findElement(searchBtn).click();
	}
	
	
}
