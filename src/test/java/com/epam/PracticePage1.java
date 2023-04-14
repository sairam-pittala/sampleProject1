package com.epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class PracticePage1 {
    private WebDriver driver;
    private PracticePage1 practicePage1;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement login;

    @FindBy(xpath = "//div[@class='error-message-container error']/h3")
    private WebElement error;

    public PracticePage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public PracticePage1 openWebsite() {
        driver.get("https://www.saucedemo.com/");
        return new PracticePage1(driver);
    }

    public PracticePage1 clickLogin() {
        login.click();
        return new PracticePage1(driver);
    }

    public String getErrorMessage() {
        return error.getText();
    }

    public void test() {
        practicePage1 = openWebsite();
        login.click();
        String errorMessage = error.getText();
        System.out.println(errorMessage);
        driver.navigate().refresh();
        errorMessage = error.getText();
    }
}
