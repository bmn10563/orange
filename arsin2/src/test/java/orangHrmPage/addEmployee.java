package orangHrmPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addEmployee {
	WebDriver driver;
	public  addEmployee(WebDriver driver) {
		
		this.driver= driver;
	}
	// click on pim
	
	
	// click on add employee tab
	By addEmployee= By.linkText("Add Employee");
	
	By imageEmp= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/div/img");
	By firstName= By.name("firstName");
	By middleName= By.name("middleName");
	By lastName= By.name("lastName");
	By empId= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");
	By save= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");
	
	
	public void clickaddEmployee() {
		driver.findElement(addEmployee).click();
	}

	public void clickImage(String img) {
		
		 String filePath = "C:\\Users\\43660\\Desktop\\madarek maryam\\m.jpg";
		 driver.findElement(imageEmp).sendKeys(filePath);
	}
	public void enterFirstname(String name) {
		driver.findElement(firstName).sendKeys(name);
	}
	public void enterMiddleName(String id) {
		driver.findElement(middleName).sendKeys(id);
	}
	
	public void enterLastName(String ss) {
		driver.findElement(lastName).sendKeys(ss);
		
	}
	public String checkempId() {
		 String head= driver.findElement(empId).getText();
		return head;
		 
	}
	public void clickSave() {
		driver.findElement(save).click();
	}
}
