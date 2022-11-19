package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {
public static	WebDriver driver;
	public login_page(WebDriver driver)
	{
		
	//this.driver=driver;
		
	}
	
	public void credentials(String user , String pass) {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		
	}
	
	public void click() {
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
