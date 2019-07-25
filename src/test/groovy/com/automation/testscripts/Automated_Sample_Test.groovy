package com.automation.testscripts

import org.openqa.selenium.By
import spock.lang.Specification

import static com.automation.support.DriverHelper.*
import static com.automation.support.BrowserHelper.*

class Automated_Sample_Test extends Specification {

    def setupSpec(){

        //This is to Open the Target Website
        openBrowser('https://www.google.com')
    }

    def cleanupSpec(){

        //This is to Close the Web Browser When Test is completed
        closeBrowser()
    }

    def "Automated Sample Test"(){

        when: "Go to Google and Search"

        //Type in the Search Bar
        sendKeys By.xpath("//input[@class='gLFyf gsfi']"),'Artcell'
        sleep(10)

        //Click the Search Button
        click(By.xpath("//input[@class='gNO89b']"))
        sleep(10)

        then: "Validate Artcell Displays"

        isElementDisplayed (By.xpath("//*[@class='kno-ecr-pt kno-fb-ctx PZPZlf gsmt']//span[contains(text(),'Artcell')]"))

        noExceptionThrown()
    }
}