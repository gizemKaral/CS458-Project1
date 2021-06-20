package sampleapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class testClass {

    public static void main(String[] args) {

        System.out.println("hdhdh");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\webdriverselenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://stars.bilkent.edu.tr/accounts/login/c59d6338d96a602b3dfe1b3420965bd9060cf260c");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Find user name
        WebElement txtbx_username = driver.findElement(By.id("LoginForm_username"));
        txtbx_username.sendKeys("21703094");

        //password is sent
        driver.findElement(By.id("LoginForm-p9499d61723")).sendKeys("jsjsjjs");
        driver.findElement(By.name("yt0")).click();

        String expected_title = "Bilkent Accounts :: SMS Verification";
        String actual_title = driver.getTitle();

        //check point
        if(expected_title.equals(actual_title)){
            System.out.println("Login successful");
        }else{
            System.out.println("Login Failed");
        }

    }
}
