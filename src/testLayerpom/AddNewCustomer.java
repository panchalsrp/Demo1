package testLayerpom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayerPom.AddCustomerPage;
import pageLayerPom.HomePage;
import pageLayerPom.ManagerPage;

public class AddNewCustomer 
{

public static void main(String args[]) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	HomePage home_obj=new HomePage(driver);
	home_obj.clickOnBankManagerLoginButton();
     Thread.sleep(2000);
     ManagerPage mang_obj=new ManagerPage(driver);
     mang_obj.clickOnAddCustomerBtn();
     
     AddCustomerPage add_pge=new AddCustomerPage(driver);
     add_pge.enterFirstNamae("charly");
     Thread.sleep(2000);
     add_pge.enterLastNmae("chapan");
     Thread.sleep(2000);
     add_pge.enterPostCode("241615");
     Thread.sleep(2000);
     add_pge.clickOnAddCustomerBtn();
     Thread.sleep(2000);
     add_pge.clickOnOKPopup();
}
}
