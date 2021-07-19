package com.wom.poc.steps;

import com.wom.poc.pageobjects.HomePage;
import com.wom.poc.pageobjects.LoginPage;
import com.wom.poc.utils.SpecialMethods;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    private static WebDriverWait wait;



    public void openAvantel() {
        SpecialMethods.configProperties();
        SpecialMethods.chromeHisBrowserWeb(SpecialMethods.properties.getProperty("url"));
    }


    public void loginAvantel() {
        SpecialMethods.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        SpecialMethods.configProperties();
        loginPage.write(SpecialMethods.driver,loginPage.usernameInput,SpecialMethods.properties.getProperty("user"));
        loginPage.write(SpecialMethods.driver,loginPage.passwordInput, SpecialMethods.properties.getProperty("password"));
        SpecialMethods.clickJS(loginPage.signInButton);
        SpecialMethods.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }


}
