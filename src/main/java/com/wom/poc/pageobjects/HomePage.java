package com.wom.poc.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    public By avantelImage = By.id("logo_cliente");
    public By portOutOption = By.xpath("//span[text()='Port-Out']");
    public By registerOption = By.xpath("//td[contains(@class,'cdk-column-codigo')]");
    public By searchBarInput = By.xpath("//input[@type='text']");
    public By searchButton = By.xpath("//button[@class='ngx-daterangepicker-action btn btn-primary']");
    public By appliedCodeValidation = By.xpath("//span[@class='tags-input__tag label label-default badge badge-default ng-star-inserted']");
    public By scroll = By.xpath("//div[@class='mat-tab-labels']");
    public By carryPhonesOption = By.xpath("(//div[@class='mat-tab-labels']//div[@id])[2]");

    public By rolesSelect = By.xpath("//a[@class='m-r-sm text-muted welcome-message']");
    public By adminListOption = By.xpath("//a[text()='Admin']");
    public By editButton = By.xpath("//button[@class='btn btn-default btn-sm' and not (@disabled)]");
    public By editButton2 = By.xpath("//button[@class='btn btn-xs btn-default']");
    public By addButton = By.xpath("//button[contains(text(),'Agregar')]");
    public By reasonForRejectionSelect = By.xpath("//span[text()='Motivo de rechazo']");
    public By ownershipOption = By.xpath("(//mat-option[@class='mat-option ng-star-inserted']//span)[1]");
    public By reportedNumberOption = By.xpath("(//mat-option[@class='mat-option ng-star-inserted']//span)[2]");
    public By fraudNumberOption = By.xpath("(//mat-option[@class='mat-option ng-star-inserted']//span)[3]");
    public By latePaymentOption = By.xpath("(//mat-option[@class='mat-option ng-star-inserted']//span)[4]");
    public By fraudRejection = By.xpath("(//mat-option[@class='mat-option ng-star-inserted']//span)[5]");
    public By downloadRejectionInformationButton = By.xpath("//button[@class='btn btn-xs btn-default pull-right ng-star-inserted']");
    public By saveButton = By.xpath("//button[@class='btn btn-sm btn-primary']");
    public By rejectionInformation = By.xpath("(//span[@class='text-muted'])[2]");
    public By acceptButton = By.xpath("//button[@class='pull-right mat-button mat-button-base ng-star-inserted']");
    public By saveButton2 = By.xpath("//button[@class='btn btn-primary mat-stroked-button mat-button-base']");
    public By actionExecuteButton = By.xpath("//button[@class='btn btn-xs btn-primary pull-right mat-menu-trigger ng-star-inserted']");
    public By sendAnswerOption = By.xpath("//span[@class='text-muted small']");
    public By yesAnswerABDButton = By.xpath("//span[text()='Si ']");
    public By selectAnOption = By.xpath("//mat-label[@class='ng-star-inserted' and text()='Seleccione un motivo']");
    public By rejectionMotiveOption = By.xpath("//span[text()=' MOTIVO DE RECHAZO ']");
    public By acceptButton2 = By.xpath("//span[@class='mat-button-wrapper' and text()='Aceptar ']");
    public By codeResults = By.xpath("//*[@class='tags-input__tag label label-default badge badge-default ng-star-inserted']");
    public By codeDeleteButton = By.xpath("//button[@class='btn btn-default btn-options']");
    public By pdfForLogs = By.xpath("//span[contains(@class, 'material-icons ng')]");

    public void write(WebDriver driver,By by, String string){
        driver.findElement(by).sendKeys(string);
    }

    public void waitUntil(By elementBy, WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }


}
