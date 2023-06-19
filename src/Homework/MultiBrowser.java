package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String  browser ="Chrome";
    static  String baseUrl ="http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        //1/ Setup Multibrowser
        if (browser.equalsIgnoreCase("Chrome")){
            driver= new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver =new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver= new FirefoxDriver();
        } else System.out.println("Invalid Input");
        //1Setup chrome Browser
        WebDriver driver = new ChromeDriver();

        //2. Open URL
        driver.get(baseUrl);
        //maximze screen
        driver.manage().window().maximize();
        //implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // 3. Print the title of the page
        System.out.println("Page title is  ;"+driver.getTitle());
        //4.print the current Url
        driver.getCurrentUrl();
        System.out.println("current Url name is :"+driver.getCurrentUrl());
        //5. Print the pagesource
        driver.getPageSource();
        System.out.println("Page sources :"+driver.getPageSource());
        // 6. Enter the email to email field
        driver.findElement(By.name("username"));
        WebElement userFieldName =driver.findElement(By.name("username"));
        userFieldName.sendKeys("nj123@gmail.com");
        // 7. Enter the password to password field
        WebElement passwordField =driver.findElement(By.id("password"));
        passwordField.sendKeys("nj123");
        // 8. Close the browser
        Thread.sleep(2000);
        driver.close();
    }
}
