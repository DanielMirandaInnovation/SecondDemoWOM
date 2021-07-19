package com.wom.poc.steps;

import com.wom.poc.pageobjects.HomePage;
import com.wom.poc.utils.Excel;
import com.wom.poc.utils.SpecialMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomeSteps {

    HomePage homePage = new HomePage();
    Robot robot;
    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void selectAdminOption(){
        SpecialMethods.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        SpecialMethods.waitFor(4);
        SpecialMethods.clickJS(homePage.rolesSelect);
        SpecialMethods.waitFor(1);
        SpecialMethods.clickJS(homePage.adminListOption);
        SpecialMethods.waitFor(1);
        SpecialMethods.clickJS(homePage.rolesSelect);
        SpecialMethods.waitFor(2);
        SpecialMethods.clickJS(homePage.portOutOption);
    }

    public void firstRegister() throws IOException {
        SpecialMethods.waitFor(4);
        homePage.write(SpecialMethods.driver,homePage.searchBarInput, Excel.getCellValue(SpecialMethods.properties.getProperty("filepath"), SpecialMethods.properties.getProperty("sheetName"), 1, 1).substring(3));
        SpecialMethods.waitFor(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        SpecialMethods.waitFor(2);
        SpecialMethods.clickJS(homePage.editButton);
        SpecialMethods.waitFor(2);
        SpecialMethods.scroll(homePage.scroll);
        SpecialMethods.waitFor(1);
        SpecialMethods.clickJS(homePage.carryPhonesOption);
        SpecialMethods.clickJS(homePage.editButton2);
        SpecialMethods.clickJS(homePage.addButton);
        SpecialMethods.clickJS(homePage.reasonForRejectionSelect);
        SpecialMethods.waitFor(2);
        if (Excel.getCellValue(SpecialMethods.properties.getProperty("filepath"), SpecialMethods.properties.getProperty("sheetName"), 1, 9).contains("TITULARIDAD")) {
            SpecialMethods.clickJS(homePage.ownershipOption);
        } else if (Excel.getCellValue(SpecialMethods.properties.getProperty("filepath"), SpecialMethods.properties.getProperty("sheetName"), 1, 9).contains("ROBO")) {
            SpecialMethods.clickJS(homePage.reportedNumberOption);
        } else if (Excel.getCellValue(SpecialMethods.properties.getProperty("filepath"), SpecialMethods.properties.getProperty("sheetName"), 1, 9).contains("FRAUDE")) {
            SpecialMethods.clickJS(homePage.fraudNumberOption);
        } else if (Excel.getCellValue(SpecialMethods.properties.getProperty("filepath"), SpecialMethods.properties.getProperty("sheetName"), 1, 9).contains("MORA")) {
            SpecialMethods.clickJS(homePage.latePaymentOption);
        } else {
            SpecialMethods.clickJS(homePage.fraudRejection);
        }
        SpecialMethods.clickJS(homePage.downloadRejectionInformationButton);
        SpecialMethods.waitFor(3);
        SpecialMethods.clickJS(homePage.pdfForLogs);
        SpecialMethods.waitFor(4);
        SpecialMethods.switchWindow(SpecialMethods.driver);
        SpecialMethods.waitFor(3);
        SpecialMethods.screenshot(SpecialMethods.driver,1);
        SpecialMethods.waitFor(3);
        SpecialMethods.driver.close();
        SpecialMethods.waitFor(2);
        SpecialMethods.driver.switchTo().window(SpecialMethods.defaultContent);
        SpecialMethods.waitFor(1);
        SpecialMethods.clickJS(homePage.saveButton);
        SpecialMethods.clickJS(homePage.acceptButton);
        SpecialMethods.clickJS(homePage.saveButton2);
        SpecialMethods.waitFor(2);
        SpecialMethods.clickJS(homePage.editButton);
        SpecialMethods.simpleClickJS(homePage.actionExecuteButton);
        SpecialMethods.clickJS(homePage.sendAnswerOption);
        SpecialMethods.waitFor(3);
        SpecialMethods.clickJS(homePage.yesAnswerABDButton);
        SpecialMethods.waitFor(3);
        SpecialMethods.clickJS(homePage.selectAnOption);
        SpecialMethods.waitFor(2);
        SpecialMethods.clickJS(homePage.rejectionMotiveOption);
        SpecialMethods.clickJS(homePage.acceptButton2);
    }

    public void allRegistersFromExcel() throws IOException {
        for (int i = 2; i <= 11; i++) {
            SpecialMethods.waitFor(6);
            SpecialMethods.clickJS(homePage.codeDeleteButton);
            SpecialMethods.waitFor(3);
            homePage.write(SpecialMethods.driver, homePage.searchBarInput, Excel.getCellValue(SpecialMethods.properties.getProperty("filepath"), SpecialMethods.properties.getProperty("sheetName"), i, 1).substring(3));
            SpecialMethods.waitFor(1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            SpecialMethods.waitFor(2);
            SpecialMethods.clickJS(homePage.editButton);
            SpecialMethods.waitFor(2);
            SpecialMethods.scroll(homePage.scroll);
            SpecialMethods.waitFor(1);
            SpecialMethods.clickJS(homePage.carryPhonesOption);
            SpecialMethods.clickJS(homePage.editButton2);
            SpecialMethods.clickJS(homePage.addButton);
            SpecialMethods.clickJS(homePage.reasonForRejectionSelect);
            SpecialMethods.waitFor(2);
            if (Excel.getCellValue(SpecialMethods.properties.getProperty("filepath"), SpecialMethods.properties.getProperty("sheetName"), i, 9).contains("TITULARIDAD")) {
                SpecialMethods.clickJS(homePage.ownershipOption);
            } else if (Excel.getCellValue(SpecialMethods.properties.getProperty("filepath"), SpecialMethods.properties.getProperty("sheetName"), i, 9).contains("ROBO")) {
                SpecialMethods.clickJS(homePage.reportedNumberOption);
            } else if (Excel.getCellValue(SpecialMethods.properties.getProperty("filepath"), SpecialMethods.properties.getProperty("sheetName"), i, 9).contains("FRAUDE")) {
                SpecialMethods.clickJS(homePage.fraudNumberOption);
            } else if (Excel.getCellValue(SpecialMethods.properties.getProperty("filepath"), SpecialMethods.properties.getProperty("sheetName"), i, 9).contains("MORA")) {
                SpecialMethods.clickJS(homePage.latePaymentOption);
            } else {
                SpecialMethods.clickJS(homePage.fraudRejection);
            }
            SpecialMethods.clickJS(homePage.downloadRejectionInformationButton);
            SpecialMethods.waitFor(3);
            SpecialMethods.clickJS(homePage.pdfForLogs);
            SpecialMethods.waitFor(4);
            SpecialMethods.switchWindow(SpecialMethods.driver);
            SpecialMethods.waitFor(3);
            SpecialMethods.screenshot(SpecialMethods.driver, 1);
            SpecialMethods.waitFor(3);
            SpecialMethods.driver.close();
            SpecialMethods.waitFor(2);
            SpecialMethods.driver.switchTo().window(SpecialMethods.defaultContent);
            SpecialMethods.waitFor(1);
            SpecialMethods.clickJS(homePage.saveButton);
            SpecialMethods.clickJS(homePage.acceptButton);
            SpecialMethods.clickJS(homePage.saveButton2);
            SpecialMethods.waitFor(2);
            SpecialMethods.clickJS(homePage.editButton);
            SpecialMethods.waitFor(2);
            SpecialMethods.clickJS(homePage.actionExecuteButton);
            SpecialMethods.waitFor(1);
            SpecialMethods.clickJS(homePage.sendAnswerOption);
            SpecialMethods.waitFor(3);
            SpecialMethods.clickJS(homePage.yesAnswerABDButton);
            SpecialMethods.waitFor(3);
            SpecialMethods.clickJS(homePage.selectAnOption);
            SpecialMethods.waitFor(2);
            SpecialMethods.clickJS(homePage.rejectionMotiveOption);
            SpecialMethods.waitFor(2);
            SpecialMethods.simpleClickJS(homePage.acceptButton2);
        }
    }
}
