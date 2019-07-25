package com.automation.support

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class BrowserHelper {

    static WebDriver driver = DriverHelper.getDriver()

    static def sendKeys(By by, String keys){
        driver.findElement(by).sendKeys(keys)
    }

    static def click(By by){
        driver.findElement(by).click()
    }

    static boolean isElementDisplayed(By by) {

        try {
            driver.findElement(by)
            return true
        }
        catch (NoSuchElementException e) {
            return false
        }
    }
}