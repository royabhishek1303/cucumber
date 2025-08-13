package Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginToVtiger {
	
	WebDriver driver;
	@Given("Launch a browser")
	public void launch_a_browser() {
		driver=new EdgeDriver();
	  
	}
	@Given("Navigate to URL")
	public void navigate_to_url() {
		driver.get("http://localhost:8888/");
	    
	}
	@When("enter valid username")
	public void enter_valid_username() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
	    
	}
	@When("enter valid password")
	public void enter_valid_password() {
		driver.findElement(By.name("user_password")).sendKeys("admin");
	    
	}
	@When("click to login button")
	public void click_to_login_button() {
		driver.findElement(By.id("submitButton")).click();
	    
	}
	@Then("Verify whether home page is displayed")
	public void verify_whether_home_page_is_displayed() {
		String title = driver.getTitle();
		if(title.contains("Home")) {
			System.out.println("Successfully home page displayed");
		}else {
			System.out.println("Home page not displayed");
		}
	   
	}

}
