package seleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class SeleniumHW3 extends Hooks{
	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.get("https://demo.nopcommerce.com/"); 
		  Thread.sleep(2000); 
              System.out.println("**TRYING ..TO GIT***..."); 
		//Click REGISTER link
		WebElement registerBtn = driver.findElement(By.className("ico-register"));
		registerBtn.click(); 
		Thread.sleep(2000);      
		  
		  Thread.sleep(2000); 

		  WebElement genderField = driver.findElement(By.id("gender-female"));
		  genderField.click();     
		  Thread.sleep(2000); 

		  WebElement firstnameField = driver.findElement(By.id("FirstName"));
		  firstnameField.sendKeys("Soliana"); 
		  Thread.sleep(2000); 

		  WebElement lastnameField = driver.findElement(By.id("LastName"));
		  lastnameField.sendKeys("Yemane"); 
		  Thread.sleep(2000); 

	       // DateOfBirthDay 

		  WebElement dobField = driver.findElement(By.name("DateOfBirthDay"));
		  dobField.sendKeys("21"); 
		  Thread.sleep(2000); 

		  WebElement monthField = driver.findElement(By.name("DateOfBirthMonth"));
		  monthField.sendKeys("11"); 
		  Thread.sleep(2000); 
		
		  WebElement emailField = driver.findElement(By.id("Email"));
		  emailField.sendKeys("solianayemane97@gmail.com"); 
		  Thread.sleep(2000); 
		  
		  
		  WebElement companyField = driver.findElement(By.id("Company"));
		  companyField.sendKeys("Vero Moda");  
		  Thread.sleep(2000);
		
		  
		  WebElement newsL = driver.findElement(By.id("Newsletter"));
		  newsL.click(); 
			
		  
		  WebElement passwordField = driver.findElement(By.id("Password"));
		  passwordField.sendKeys("Test123");  
		  Thread.sleep(2000);  

		  
		  //Locate the password then VALUE 
		  WebElement reinterPass = driver.findElement(By.id("ConfirmPassword"));
		  reinterPass.sendKeys("Test123");  
		  
		  WebElement registerButton = driver.findElement(By.name("register-button"));
		  registerButton.click(); 
			 
		  WebElement confirmationText = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")); 
		  
         String re = confirmationText.getText();
		  
		  Thread.sleep(2000); 

		  if(re.contains("Your registration completed!!!")){
			  System.out.println("TestCase Passed" + confirmationText);
			  
			  System.out.println("************");

		  } else {
			  System.out.println("TestCase Failed" + confirmationText); 
			  System.out.println("************");
 
		  }  
		tearDown();  
	}   

}
