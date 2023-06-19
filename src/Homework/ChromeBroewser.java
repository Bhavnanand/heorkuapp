package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBroewser {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl ="http://the-internet.herokuapp.com/login";
   // 1   Setup chrome browser
        WebDriver driver =new ChromeDriver();
         //2. Open URL
        driver.get(baseUrl);
        //Maximise Screen
        driver.manage().window().maximize();
        //Imlicit Wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3. Print the title of the page
        System.out.println("Page Title is:"+driver.getTitle());
        // 4. Print the current url
        driver.getCurrentUrl();
        System.out.println("Current Url Name :"+driver.getCurrentUrl());
        // 5. Print the page source
        driver.getPageSource();
        System.out.println("Page sources :"+driver.getPageSource());
        // 6. Enter the email to email field
        //Find the Emailfield
        WebElement usernameField = driver.findElement(By.name("username"));
        //action is to type Username
        usernameField.sendKeys("Nj123@gmail.com");
        // 7. Enter the password to password field
        WebElement idField =driver.findElement(By.id("password"));
        idField.sendKeys("nj123");
        //Hold screen
        Thread.sleep(2000);
        // 8. Close the browse
        driver.close();
    }
}
