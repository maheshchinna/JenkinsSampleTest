package facebooktests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test1 {
    WebDriver driver;
    @Test
    void FacebookSite() throws IOException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://facebook.com");
        Assert.assertEquals("Facebook – log in or sign up",driver.getTitle());
    }

    @Test
    void Login() throws IOException, InterruptedException {
        driver.findElement(By.name("email")).sendKeys("Mahesh");
        driver.findElement(By.name("pass")).sendKeys("Test");
        driver.findElement(By.linkText("Create New Account")).click();

    }


}
