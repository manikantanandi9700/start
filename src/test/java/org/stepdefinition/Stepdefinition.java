package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefinition {
WebDriver driver;
@Given("user launches browser")
public void user_launches_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\UpdatePackage\\Log\\Ramana\\library\\chromedriver.exe");
 driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
   
}

@When("user enter username {string} and  password{string}")
public void user_enter_username_and_password(String s1, String s2) {
	driver.findElement(By.id("email")).sendKeys(s1);
	driver.findElement(By.id("pass")).sendKeys(s2);
}

@When("user hit the login button")
public void user_hit_the_login_button() {
	WebElement w = driver.findElement(By.xpath("//button[@name='login']"));
 w.click();   
}

@Then("user navigate to home page")
public void user_navigate_to_home_page() {
	 String m = driver.getCurrentUrl();
	  Assert.assertTrue(m.contains("face"));
	  driver.close();
 
}



}
