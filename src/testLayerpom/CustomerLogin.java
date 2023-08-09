package testLayerpom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayerPom.HomePage;
import pageLayerPom.LoginPage;

public class CustomerLogin {
	public static void main(String args[])
	{
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  HomePage home_obj=new HomePage(driver);
	  home_obj.clickOnCustomerLoginButton();
	  
	  LoginPage log_obj=new LoginPage(driver);
	  log_obj.yourName_dropdown("4");
	  log_obj.LoginButton();
}
}