package com.wom.poc.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{


    public By usernameInput = By.name("username");
    public  By passwordInput = By.name("password");
    public By signInButton = By.xpath("//button");

    public void write(WebDriver driver,By by, String string){
        driver.findElement(by).sendKeys(string);
    }

    public void waitUntil(By elementBy, WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }



}
