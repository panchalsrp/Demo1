package pageLayerPom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomersPage 
{
 private WebElement  search_txt;
 //private WebElement delete_btn;
  
 public CustomersPage(WebDriver driver)
 {
	search_txt=driver.findElement(By.xpath("//Input[@class='form-control ng-pristine ng-untouched ng-valid']"));
	//delete_btn=driver.findElement(By.xpath("(//button[text()=\"Delete\"])[5]"));
 }
 
 public void entertSearchTxt(String text)
 {
	 search_txt.sendKeys(text);
 }
 
 //public void clickOnDeleteBtn()
 //{
//	 delete_btn.click();
 //}
}
