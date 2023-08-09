package pageLayerPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCustomerPage
{
  private WebElement first_name_txt;
  private WebElement last_name_txt;
  private WebElement post_code_txt;
  private WebElement add_customer_btn;
  WebDriver driver;
  
   public AddCustomerPage(WebDriver driver)
  {
	   this.driver=driver;
	  first_name_txt=driver.findElement(By.xpath("//input[contains(@class,\"form-control ng\")]"));
	  last_name_txt=driver.findElement(By.xpath("(//input[contains(@class,\"form-control ng\")])[2]"));
	  post_code_txt=driver.findElement(By.xpath("(//input[contains(@class,\"form-control ng\")])[3]"));
	  add_customer_btn=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
  }
  
   public void enterFirstNamae(String Firstname)
   {
	   first_name_txt.sendKeys(Firstname);
   }
   
   public void enterLastNmae(String Lastname)
   {
	   last_name_txt.sendKeys(Lastname);
   }
   
   public void enterPostCode(String postcode)
   {
	   post_code_txt.sendKeys(postcode);
   }
   
   public void clickOnAddCustomerBtn()
   {
	   add_customer_btn.click();
   }
   
   public void clickOnOKPopup()
   {
	   driver.switchTo().alert().accept();
   }
}
