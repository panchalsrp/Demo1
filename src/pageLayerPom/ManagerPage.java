package pageLayerPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManagerPage
{
 private WebElement add_customer_btn;
 private WebElement open_account_btn;
 private WebElement customers_btn;

  public ManagerPage(WebDriver driver)
  {
	 
	  add_customer_btn=driver.findElement(By.xpath("//button[@class='btn btn-lg tab']"));
	  open_account_btn=driver.findElement(By.xpath("//button[@class='btn btn-lg tab'][2]"));
	  customers_btn=driver.findElement(By.xpath("//button[@class='btn btn-lg tab'][3]"));
  }
  
  public void clickOnAddCustomerBtn()
  {
	  add_customer_btn.click();
  }
  public void clickOnOpenAccountBtn()
  {
	  open_account_btn.click();
  }
  
  public void clickOnCustomersBtn()
  {
	customers_btn.click();
	
  }
}
