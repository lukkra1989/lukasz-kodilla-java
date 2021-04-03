package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static final String SEARCHFIELD="_nkw";

    public static void main(String[] args) {
        WebDriver webDriverConfig=WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        webDriverConfig.get("https://www.ebay.pl/");

        WebElement findLaptop= webDriverConfig.findElement(By.name(SEARCHFIELD));
        findLaptop.sendKeys("Laptop");
        findLaptop.submit();
    }
}
