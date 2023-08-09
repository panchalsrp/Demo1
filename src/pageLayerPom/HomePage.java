package pageLayerPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
	 private WebElement bank_manager_login_btn;
	 private WebElement Customer_login_btn;	
  
	 public HomePage(WebDriver driver)
  {
	bank_manager_login_btn=driver.findElement(By.xpath("//button[text()=\"Bank Manager Login\"] "));
	Customer_login_btn=driver.findElement(By.xpath("//button[text()=\"Customer Login\"] "));
  }
  
	public void clickOnBankManagerLoginButton() 
	{
		bank_manager_login_btn.click();
	}
	
	public void clickOnCustomerLoginButton()
	{
	   Customer_login_btn.click();
	}
}
