package com.qa.Testscript;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrm {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"password\"]"));
		password.sendKeys("admin123");
		WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();

	/*	WebElement option = driver.findElement(By.xpath("//div[@class=\"oxd-layout-navigation\"]//ul[@class=\"oxd-main-menu\"]//li[2]"));
		option.click();

		WebElement add_btn = driver.findElement(By.xpath("//div[@class=\"oxd-layout-container\"]//button[normalize-space()='Add']"));
		add_btn.click();

		// Add Employee

		String FirstName = "PRASANTH";
		String LastName = "LOKKU";
		WebElement A_F_name = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		A_F_name.sendKeys(FirstName);

		WebElement A_L_name = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		A_L_name.sendKeys(LastName);

		WebElement save_btn = driver.findElement(By.xpath("//button[@type='submit']"));
		save_btn.click();
		Thread.sleep(5000);

//		// Admin Block
		WebElement Admin_opt = driver.findElement(By.xpath("//span[normalize-space()=\"Admin\"]"));
		Admin_opt.click();

		WebElement Add_btn = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
		Add_btn.click();

		WebElement D_D = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i"));
		D_D.click();

		int D_D_Elements = driver.findElements(By.xpath("//div[@class=\"oxd-select-dropdown --positon-bottom\"]//div")).size();

		for (int i = 1; i <= D_D_Elements; i++) {
			// System.out.println(driver.findElement(By.xpath("//div[@class=\"oxd-select-dropdown
			// --positon-bottom\"]//div[" + i + "]")).getText());
			WebElement ele = driver.findElement(By.xpath("//div[@class=\"oxd-select-dropdown --positon-bottom\"]//div[" + i + "]"));
			if (ele.getText().equalsIgnoreCase("ess")) {
				ele.click();
				break;
			}
		}

		WebElement i_name = driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]"));
		i_name.sendKeys("Prasanth");
		Thread.sleep(5000);

		List<WebElement> Auto = driver.findElements(By.xpath("//div[@role=\"option\"][1]"));
		for (int k = 1; k <= Auto.size(); k++) {
			WebElement o_name = driver.findElement(By.xpath("//div[@role=\"option\"][" + k + "]"));
			if (o_name.getText().equalsIgnoreCase(FirstName + " " + LastName)) {
				o_name.click();
				break;
			}
		}

		WebElement D_D_2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i"));
		D_D_2.click();
		int D_D__2_Elements = driver.findElements(By.xpath("//div[@class=\"oxd-select-dropdown --positon-bottom\"]//div")).size();

		for (int j = 1; j <= D_D__2_Elements; j++) {
			WebElement ele_2 = driver.findElement(By.xpath("//div[@class=\"oxd-select-dropdown --positon-bottom\"]//div[" + j + "]"));
			if (ele_2.getText().equalsIgnoreCase("Enabled")) {
				ele_2.click();
				break;
			}
		}

		String A_username = "PRASANTH";
		String accepted_user_name = null;

		try {
			WebElement user_name = driver.findElement(By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"][4]//input"));
			for (char le : A_username.toCharArray()) {
				user_name.sendKeys(String.valueOf(le));
				Thread.sleep(1000);
			}
			Thread.sleep(3000);
			try {
				WebElement alert = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/span"));
				if (alert.isDisplayed() && alert.getText().equalsIgnoreCase("Already exists")) {
					System.out.println("Username is duplicated:" + A_username);
					List<String> names = Arrays.asList("TEJ KAMAL", "TEJ", "KAMAL", "DRAKO");
					for (String new_user_name : names) {
						user_name.sendKeys(Keys.CONTROL + "a");
						user_name.sendKeys(Keys.BACK_SPACE);
						for (char str_to_char : new_user_name.toCharArray()) {
							user_name.sendKeys(String.valueOf(str_to_char));
							Thread.sleep(1000);
						}
						accepted_user_name = new_user_name;
						System.out.println("Accepted username is: " + accepted_user_name);
						if (!(alert.isDisplayed() || alert.getText().equalsIgnoreCase("Already exists"))) {
							break;
						}
					}
				} else {
					accepted_user_name = A_username;
					System.out.println("Accepted user name: " + accepted_user_name);
				}
			} catch (org.openqa.selenium.StaleElementReferenceException e) {
				if (accepted_user_name == null) {
					System.out.println("Encountered stale element exception");
				}
			}
		} catch (Exception e) {
			System.out.println("Accepted user name is : " + A_username);
		}

		WebElement pass = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		pass.sendKeys("PRASpras@034");

		WebElement re_pass = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]"));
		re_pass.sendKeys("PRASpras@034");

//		WebElement save_btn_2 = driver.findElement(By.xpath("//div[@class=\"oxd-form-actions\"]//button[@type=\"submit\"]"));
//		save_btn_2.click();
		
		Thread.sleep(3000);
		
//		WebElement job_option = driver.findElement(By.xpath("//div[@class=\"oxd-topbar-body\"]//li[2]"));
//		job_option.click();
 * 
 */
	}

}
