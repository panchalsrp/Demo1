package pageLayerPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OpenAccount 
{
	  private WebElement customer_dropdown;
	  private WebElement currency_dropdown;
	  private WebElement process_btn;
	  WebDriver driver;
	  
  public OpenAccount(WebDriver driver)
  {
	  this.driver=driver;
	  customer_dropdown=driver.findElement(By.xpath("//select[@id='userSelect']"));
	  currency_dropdown=driver.findElement(By.xpath("//select[@id='currency']"));
	  process_btn=driver.findElement(By.xpath("//button[text()=\"Process\"]"));
  }
  public void selectCustomerDropDown(String DropDown)
  {
	  	Select s=new Select(customer_dropdown);
	  	s.selectByValue(DropDown);
  }
  
   public void selectCurrencyDropDown(String DropDown1)
  {
	  Select sl=new Select(currency_dropdown);
	  sl.selectByVisibleText(DropDown1);
  }
  
  public void clickOnProcessBtn()
  {
	  process_btn.click();  
  }
  
  public void clickOnOkPopUp()
  {
	  driver.switchTo().alert().accept();
  }          
}
