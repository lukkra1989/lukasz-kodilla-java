package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {
    public static final String XPATH_COOKIE = "//div[contains(@class, '9o-r')]/button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//a[contains(@data-testid, 'open-registration-form-button')]";

    public static final String XPATH_FIRSTNAME = "//input[contains(@name, 'firstname')]";
    public static final String XPATH_LASTNAME = "//input[contains(@name, 'lastname')]";

    public static final String XPATH_MAIL = "//input[contains(@name, 'reg_email__')]";
    public static final String XPATH_MAIL_CONFIRM = "//input[contains(@name, 'reg_email_confirmation')]";

    public static final String XPATH_PASSWORD = "//input[contains(@name, 'reg_passwd__')]";

    public static final String XPATH_DAY = "//select[contains(@id, 'day')]";
    public static final String XPATH_MONTH = "//select[contains(@id, 'month')]";
    public static final String XPATH_YEAR = "//select[contains(@id, 'year')]";

    public static final String XPATH_GENDER = "//label[contains(@class, '_58mt')]";

    public static final String XPATH_REGISTER = "//button[contains(@name, 'websubmit')]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_COOKIE)).isDisplayed()) ;
        driver.findElement(By.xpath(XPATH_COOKIE)).click();
        driver.findElement(By.xpath(XPATH_NEW_ACCOUNT)).click();

        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(d -> d.findElement(By.xpath(XPATH_FIRSTNAME)));

        driver.findElement(By.xpath(XPATH_FIRSTNAME)).sendKeys("Luke");
        driver.findElement(By.xpath(XPATH_LASTNAME)).sendKeys("Skywalker");

        driver.findElement(By.xpath(XPATH_MAIL)).sendKeys("xyz@net.pl");

        while (!driver.findElement(By.xpath(XPATH_MAIL_CONFIRM)).isDisplayed()) ;
        driver.findElement(By.xpath(XPATH_MAIL_CONFIRM)).sendKeys("xyz@net.pl");

        driver.findElement(By.xpath(XPATH_PASSWORD)).sendKeys("USER");

        Select selectDay = new Select(driver.findElement(By.xpath(XPATH_DAY)));
        Select selectMonth = new Select(driver.findElement(By.xpath(XPATH_MONTH)));
        Select selectYear = new Select(driver.findElement(By.xpath(XPATH_YEAR)));

        selectDay.selectByIndex(0);
        selectMonth.selectByIndex(11);
        selectYear.selectByValue("1989");

        driver.findElement(By.xpath(XPATH_GENDER)).click();
        driver.findElement(By.xpath(XPATH_REGISTER)).click();
    }
}
