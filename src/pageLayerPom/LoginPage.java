package pageLayerPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage 
{
 private WebElement YourName_dropdown;
 private WebElement Login_btn;
 
 public LoginPage(WebDriver driver)
 {
	 YourName_dropdown.findElement(By.xpath("//select[@id='userSelect'] "));
	 Login_btn.findElement(By.xpath("//button[@class='btn btn-default']"));
 }
 
 public void yourName_dropdown(String value)
 {
	 Select s= new Select(YourName_dropdown);
	 s.selectByVisibleText(value);
 }
 
 public void LoginButton()
 {
	 Login_btn.click();
 }
}
