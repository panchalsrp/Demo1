package testLayerpom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayerPom.CustomersPage;
import pageLayerPom.HomePage;
import pageLayerPom.ManagerPage;

public class CustomerListPage
{
public static void main(String args[])
{
  WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
  driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  HomePage home_pge_obj=new HomePage(driver);
  home_pge_obj.clickOnBankManagerLoginButton();
  
  ManagerPage mang=new ManagerPage(driver);
  mang.clickOnCustomersBtn();
  
  CustomersPage cust=new CustomersPage(driver);
  cust.entertSearchTxt("charly");
  //cust.clickOnDeleteBtn();
  
}
}
