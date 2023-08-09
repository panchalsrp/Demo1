package testLayerpom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayerPom.HomePage;
import pageLayerPom.ManagerPage;
import pageLayerPom.OpenAccount;

public class OpenNewAccount
{
public static void main(String args[] ) throws InterruptedException
{
  WebDriver driver=new ChromeDriver();	
  driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  HomePage home_pge=new HomePage(driver);
  home_pge.clickOnBankManagerLoginButton();
  
  ManagerPage mang_pge=new ManagerPage(driver);
  mang_pge.clickOnOpenAccountBtn();
  
  OpenAccount opn_acc= new OpenAccount(driver);
  Thread.sleep(2000);
   opn_acc.selectCustomerDropDown("5");
   Thread.sleep(2000);
   opn_acc.selectCurrencyDropDown("Pound") ;
   
   opn_acc.clickOnProcessBtn();
   Thread.sleep(2000);
   opn_acc.clickOnOkPopUp();
   
}
}
