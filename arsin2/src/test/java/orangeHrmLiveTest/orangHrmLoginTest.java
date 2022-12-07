package orangeHrmLiveTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import orangeHrmLivePage.loginFormNew;

public class orangHrmLoginTest {
	//WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String user="Admin";
		String pass= "admin123";
		 String incorrectPass="123";
		System.setProperty("webdriver.chrome.driver", "C:\\javasource\\new driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		loginFormNew lgform= new loginFormNew(driver);
		lgform.enterUserName(user);
		lgform.enterPassword(pass);
		lgform.clickBtn();
		//lgform.clickForget();
		System.out.println(lgform.getHeadPage());
		System.out.println(lgform.getmassage());

	}

}
