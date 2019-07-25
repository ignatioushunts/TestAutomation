package com.automation.support

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

import java.util.concurrent.TimeUnit

class DriverHelper {

    static WebDriver driver

    static WebDriver getDriver() {
        return driver
    }

    static def openBrowser(String baseUrl){

        System.setProperty("webdriver.chrome.driver","/Users/ShawonBiswas/Documents/Projects/Project_Testing/ChromeDriver/chromedriver")
        driver = new ChromeDriver()
        driver.get(baseUrl)
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
        driver.manage().window().maximize()
    }

    static def closeBrowser(){

        driver.quit()
    }
}