package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionTest {

	public void getLogin(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("student123");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("qa1234");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
}
