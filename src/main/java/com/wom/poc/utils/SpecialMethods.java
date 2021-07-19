package com.wom.poc.utils;

import net.serenitybdd.core.pages.WebElementState;
import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SpecialMethods {

    public static Properties properties;

    public static String defaultContent;
    public static JavascriptExecutor executor;

    public static void objectAvailability(By element) {
        Assert.assertTrue("[Error] El Elemento " + element.toString() + ", no est? habilitado", driver.findElement(element).isDisplayed());
        Assert.assertTrue("[Error] El Elemento " + element.toString() + ", no est? visible", driver.findElement(element).isEnabled());
    }

    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickJS(By by) {
        objectAvailability(by);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(by));
    }
    public static void simpleClickJS(By by) {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        boolean validarElemento = false;
        while (validarElemento == false) {
            try {
                waitFor(1);
                executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(by));
                validarElemento = true;
            } catch (Exception e) {

            }
        }
    }


    public static void configProperties (){
        properties = new Properties();
        try {
            properties.load(new FileReader("C:\\RPASQA\\conf.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void screenshot(WebDriver driver, int rowNumber) {
        configProperties();
        Date date = new Date();
        String datos = "hh mm ss a dd-MMM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datos);

        java.io.File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("C:\\RPASQA\\Evidences\\"+ Excel.getCellValue(properties.getProperty("filepath"),properties.getProperty("sheetName"), rowNumber, 1)
                    + "-" + simpleDateFormat.format(date) +".png"));
        }
        catch (IOException e)

        {
            System.out.println(e.getMessage());
        }
    }

    public static void switchWindow(WebDriver driver){
        defaultContent = driver.getWindowHandle();
        java.util.Set<String> lista = driver.getWindowHandles();
        Iterator<String> Il = lista.iterator();
        while(Il.hasNext()) {
            String child_windows = Il.next();
            if (!defaultContent.equals(child_windows)) {
                driver.switchTo().window(child_windows);
            }
        }
    }

    public static void sendEmail(){
        configProperties();
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(properties.getProperty("userForEmail"), properties.getProperty("passwordForEmail")));
        email.setSSLOnConnect(true);
        try {
            email.setFrom(properties.getProperty("destinationMail"));
            email.setSubject(properties.getProperty("subject"));
            email.setMsg(properties.getProperty("message"));
            email.addTo(properties.getProperty("destinationMail"));
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }

    }

    public static WebDriver driver;

    public static void chromeHisBrowserWeb(String url) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");
        driver = new ChromeDriver(options);
        driver.get(url);
    }
    

    public static void scroll(By element) {
        executor.executeScript("arguments[0].scrollIntoView(true);", new Object[]{driver.findElement(element)});
    }






}
