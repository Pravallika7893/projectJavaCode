package com.qa.Testscript;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Parabank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
      WebElement register =  driver.findElement(By.xpath("//a[normalize-space()=\"Register\"]"));
      register.click();
      String randomString = UUID.randomUUID().toString().substring(0, 5); // Generates 8 characters
      System.out.println("Random String: " + randomString);

      // Generate a random number
//      Random random = new Random();
//      int randomNumber = random.nextInt(10); // Generates a number between 0 and 999
//      System.out.println("Random Number: " + randomNumber);
      
	    WebElement Fname = driver.findElement(By.xpath("//input[@id=\"customer.firstName\"]"));
		Fname.sendKeys("prava");
		WebElement Lname = driver.findElement(By.xpath("//input[@id=\"customer.lastName\"]"));
		Lname.sendKeys("llika");
		WebElement address = driver.findElement(By.xpath("//input[@id=\"customer.address.street\"]"));
		address.sendKeys("ppm street,ppm");
		WebElement city = driver.findElement(By.xpath("//input[@id=\"customer.address.city\"]"));
		city.sendKeys("ppm");
		WebElement state = driver.findElement(By.xpath("//input[@id=\"customer.address.state\"]"));
		state.sendKeys("andhrapradesh");
		WebElement zipcode = driver.findElement(By.xpath("//input[@id=\"customer.address.zipCode\"]"));
		zipcode.sendKeys("12345");
		WebElement phone = driver.findElement(By.xpath("//input[@id=\"customer.phoneNumber\"]"));
		phone.sendKeys("1234567891");
		WebElement ssn = driver.findElement(By.xpath("//input[@id=\"customer.ssn\"]"));
		ssn.sendKeys("175432");
		
		WebElement username = driver.findElement(By.xpath("//input[@id=\"customer.username\"]"));
		username.sendKeys(randomString);
		WebElement pswd = driver.findElement(By.xpath("//input[@id=\"customer.password\"]"));
		pswd.sendKeys("mercury");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", pswd);
		WebElement cpswd = driver.findElement(By.xpath("//input[@id=\"repeatedPassword\"]"));
		cpswd.sendKeys("mercury");
		
		WebElement submit = driver.findElement(By.xpath("//input[@value=\"Register\"]"));
		submit.click();
		
		Thread.sleep(1000);
//		 WebElement messageElement = driver.findElement(By.xpath("//div[@id=\"rightPanel\"]//p"));
//        System.out.println(messageElement);
//        Thread.sleep(2000);
//		 if(messageElement.getText().contains("Your account was created successfully. You are now logged in.")) {
//				System.out.println("Your account was created successfully. You are now logged in.");
//			}
//			else {
//				System.out.println("An internal error has occurred and has been logged.");
//			}
		 
		 WebElement Username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		 Username.sendKeys(randomString);
		 Username.getText();
		 WebElement Pswd = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		 Pswd.sendKeys("mercury");
		 Pswd.getText();
		 WebElement Submitbtn = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
			Submitbtn.click();
		 
		 //open new account
		/* Thread.sleep(2000);
		 WebElement openAcc = driver.findElement(By.xpath("//a[normalize-space()=\"Open New Account\"]"));
		 openAcc.click();
		 
		 WebElement dp = driver.findElement(By.xpath("//select[@id=\"type\"]"));
		 dp.click();
		 Select sel = new Select(dp);
		 sel.selectByValue("0");
		 
	     WebElement account = driver.findElement(By.xpath("//select[@id=\"fromAccountId\"]"));
	     account.click();
	     Select sele = new Select(account);
	     sele.selectByIndex(0);
		 
		 Thread.sleep(1000);
		 WebElement openacc = driver.findElement(By.xpath("//input[@value=\"Open New Account\"]"));
		 openacc.click();
		 
		 Thread.sleep(1000);
		 WebElement Account_opened = driver.findElement(By.id("openAccountResult"));
		 System.out.println(Account_opened.getText());
		 
		 WebElement successMessage = driver.findElement(By.xpath("//h1[contains(text(),'Account Opened!')]"));
         if (successMessage.isDisplayed()) {
             System.out.println("New account successfully opened.");
         } else {
             System.out.println("Failed to open a new account.");
         }
		 
		 
		 //System.out.println(driver.findElement(By.id("openAccountResult")).getText());
		 Thread.sleep(1000);
		 
		 WebElement newaccount = driver.findElement(By.id("newAccountId"));
		 newaccount.click();

		 Thread.sleep(2000);
		 WebElement accountDetails = driver.findElement(By.xpath("//div[@id=\"accountDetails\"]"));
		 System.out.println(accountDetails.getText());
		 
		 WebElement month = driver.findElement(By.id("month"));
		 month.click();
		 Select selec = new Select(month);
		 selec.selectByValue("January");
		// System.out.println(month.getText());
		 
		 WebElement type = driver.findElement(By.id("transactionType"));
		 type.click();
		 Select select = new Select(type);
		 select.selectByValue("Credit");
		 
		 WebElement go = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		 go.click();
		 
		WebElement tables = driver.findElement(By.xpath("//table[@id=\"transactionTable\"]"));
		js.executeScript("arguments[0].scrollIntoView(true);", tables);
	 	 System.out.print(tables.getText());
	 	 
	 	 
	 	WebElement transfer = driver.findElement(By.xpath("//a[normalize-space()=\"Funds Transfer Received\"]"));
		 transfer.click();

	 	WebElement Transaction = driver.findElement(By.xpath("//div[@id=\"rightPanel\"]"));
	 	System.out.println(Transaction.getText());*/
	 	
	 	
	 	//transfer funds
//	 	Thread.sleep(2000);
		 /*	WebElement transferfunds = driver.findElement(By.xpath("//a[normalize-space()=\"Transfer Funds\"]"));
	 	transferfunds.click();
	 	
	 	WebElement amount = driver.findElement(By.id("amount"));
	 	amount.sendKeys("100");
		
	 	WebElement From_account = driver.findElement(By.id("fromAccountId"));
	 	From_account.click();
	 	Select sa = new Select(From_account);
	 	sa.selectByIndex(0);
	 	
//	 	Thread.sleep(000);
	 	WebElement To_account = driver.findElement(By.id("toAccountId"));
	 	To_account.click();
	 	Select se = new Select(To_account);
	 	se.selectByIndex(0);
	 	
	 	Thread.sleep(1000);
	 	WebElement transferbtn = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
	 	transferbtn.click();
	 	Thread.sleep(2000);
	 	WebElement Transfer_complete = driver.findElement(By.id("showResult"));
	 	System.out.println(Transfer_complete.getText());*/
	 	
	 	//Bill pay
	 	  /*  WebElement Bill_Pay = driver.findElement(By.xpath("//a[normalize-space()=\"Bill Pay\"]"));
	 	    Bill_Pay.click();
	 	
	 	    WebElement Payee_Name = driver.findElement(By.xpath("//input[@name=\"payee.name\"]"));
			Payee_Name.sendKeys("prava");
	
			WebElement Address = driver.findElement(By.xpath("//input[@name=\"payee.address.street\"]"));
			Address.sendKeys("ppm street,ppm");
			WebElement City = driver.findElement(By.xpath("//input[@name=\"payee.address.city\"]"));
			City.sendKeys("ppm");
			WebElement State = driver.findElement(By.xpath("//input[@name=\"payee.address.state\"]"));
			State.sendKeys("andhrapradesh");
			WebElement Zipcode = driver.findElement(By.xpath("//input[@name=\"payee.address.zipCode\"]"));
			Zipcode.sendKeys("12345");
			Thread.sleep(1000);
			WebElement Phone1 = driver.findElement(By.xpath("//input[@name=\"payee.phoneNumber\"]"));
			Phone1.sendKeys("9876543210");
			WebElement Account = driver.findElement(By.xpath("//input[@name=\"payee.accountNumber\"]"));
			Account.sendKeys("175432");
			WebElement Verify_Account = driver.findElement(By.xpath("//input[@name=\"verifyAccount\"]"));
			Verify_Account.sendKeys("175432");
			WebElement Amount = driver.findElement(By.xpath("//input[@name=\"amount\"]"));
			Amount.sendKeys("1000");
			Thread.sleep(1000);
//			WebElement errormsg =driver.findElement(By.xpath("//span[@id=\"validationModel-amount-invalid\"]"));
//			System.out.println(errormsg.getText());	
			WebElement From_Account1 = driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]"));
			From_Account1.click();
			Select s3 = new Select(From_Account1);
			s3.selectByIndex(0);
			System.out.println(s3.getFirstSelectedOption().getText());
			Thread.sleep(1000);
			WebElement Send_Payment = driver.findElement(By.xpath("//input[@value=\"Send Payment\"]"));
			Send_Payment.click();
			Thread.sleep(2000);
			WebElement BillPayment = driver.findElement(By.xpath("//div[@id=\"billpayResult\"]"));
		 	System.out.println(BillPayment.getText());*/
		 	
		 	//Requestloan
		
		 /*  WebElement request_loan = driver.findElement(By.xpath("//a[normalize-space()=\"Request Loan\"]"));
		    request_loan.click();
		 
		    WebElement Loan_Amount = driver.findElement(By.xpath("//input[@id=\"amount\"]"));
			Loan_Amount.sendKeys("1000");
			WebElement Down_Payment = driver.findElement(By.xpath("//input[@id=\"downPayment\"]"));
			Down_Payment.sendKeys("100");
			WebElement From_Account2 = driver.findElement(By.xpath("//select[@id=\"fromAccountId\"]"));
			From_Account2.click();
			Select s2 = new Select(From_Account2);
			s2.selectByIndex(0);
			
			driver.findElement(By.xpath("//input[@type=\"button\"]")).click();
			
           Thread.sleep(2000);
           
			WebElement message = driver.findElement(By.xpath("//h1[@class=\"title\"]"));
	        System.out.println(message.getText());*/
			
			 //update profile
		
		WebElement Fname1 = driver.findElement(By.xpath("//input[@id=\"customer.firstName\"]"));
		Fname1.sendKeys("prava");
		WebElement Lname1 = driver.findElement(By.xpath("//input[@id=\"customer.lastName\"]"));
		Lname1.sendKeys("llika");
		WebElement address1 = driver.findElement(By.xpath("//input[@id=\"customer.address.street\"]"));
		address1.sendKeys("ppm street,ppm");
		WebElement city1 = driver.findElement(By.xpath("//input[@id=\"customer.address.city\"]"));
		city1.sendKeys("ppm");
		WebElement state1 = driver.findElement(By.xpath("//input[@id=\"customer.address.state\"]"));
		state1.sendKeys("andhrapradesh");
		WebElement zipcode1 = driver.findElement(By.xpath("//input[@id=\"customer.address.zipCode\"]"));
		zipcode1.sendKeys("12345");
		WebElement phone11 = driver.findElement(By.xpath("//input[@id=\"customer.phoneNumber\"]"));
		phone11.sendKeys("1234567891");

	 	
			
	}

}
