package com.wom.poc.stepdefinitions;

import com.wom.poc.steps.HomeSteps;
import com.wom.poc.steps.LoginSteps;
import com.wom.poc.utils.SpecialMethods;
import net.thucydides.core.annotations.Managed;
import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class StepsMain {


    public static void main(String[] args) throws IOException {

        LoginSteps loginSteps = new LoginSteps();
        HomeSteps homeSteps = new HomeSteps();
        loginSteps.openAvantel();
        loginSteps.loginAvantel();
        homeSteps.selectAdminOption();
        homeSteps.firstRegister();
        homeSteps.allRegistersFromExcel();
        SpecialMethods.sendEmail();
        SpecialMethods.driver.quit();
    }
}
