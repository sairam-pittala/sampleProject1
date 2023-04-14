package com.epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTest1 {
    private WebDriver driver;
    private PracticePage1 practicePage1;

    @BeforeTest
    public void setProperties() {
        System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        practicePage1 = new PracticePage1(driver);
        driver.manage().window().maximize();
    }

    @Test
    public void errorAfterClickingLogin() {
        String errorMessage = practicePage1
                .openWebsite()
                .clickLogin()
                .getErrorMessage();
        System.out.println(errorMessage);
    }

    @Test
    public void errorAfterRefreshing() {
        practicePage1.test();
    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}
