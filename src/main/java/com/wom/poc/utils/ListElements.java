package com.wom.poc.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListElements {

    public static WebElement randomElement(WebDriver driver, By by) {
        List<WebElement> listElements = driver.findElements(by);
        int elementPosition = (int) (Math.random()*listElements.size());
        return listElements.get(elementPosition);
    }

    public static List<WebElement> elements(WebDriver driver, By by){
        List<WebElement> listElements = driver.findElements(by);
        return listElements;
    }
}
