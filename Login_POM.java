package pom.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POM {
	
	
	public WebDriver driver;
	public Login_POM(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver,this);
			
		}
	
	@FindBy(id = "username")
	private WebElement user;
	
	public WebElement getUser() {
		return user;
	}
	
	@FindBy(name = "password")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}
	
    @FindBy(xpath = "//input[@name='login']")
	private WebElement Login;

	public WebElement getLogin() {
		return Login;
	}
	
}
