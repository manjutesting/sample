package org.testingworld.automation.testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testingworld.automation.createDriverInstance;
import org.testingworld.automation.pages.LoginPage;

//import com.sun.jna.platform.FileUtils;

import cucumber.annotation.en.*;

public class Steps {
	WebDriver driver;
	LoginPage login;
	@Given("^User is on Login page$")
	public void User_is_on_Login_page() throws Throwable {
		createDriverInstance dinstance=new createDriverInstance();
		driver=dinstance.generateDriverInstance();
		
	    }

	@When("^User enter username$")
	public void User_enter_username() throws Throwable {
		
		 login=new LoginPage(driver);
		 login.enterUsername("admin");
	   }

	@When("^User enter password$")
	public void User_enter_password() throws Throwable {
		login.enterPassword("manager");
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("D:\\NEWCUCUMBER\\BDDAutomationProject\\target\\Screenshots\\manju.png"));
	
	    }

	@When("^User click on sigin button$")
	public void User_click_on_sigin_button() throws Throwable {
		login.clickSigninButton();
	    }
	@Then("^User login page successfully$")
	public void User_login_successfully()throws Throwable{
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("D:\\NEWCUCUMBER\\BDDAutomationProject\\target\\Screenshots\\manju1.png"));
	}

	@When("^User enter incorrect username$")
	public void User_enter_incorrect_username() throws Throwable {
	    }



}
