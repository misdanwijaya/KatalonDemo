import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://demo.midtrans.com/")
selenium.click("link=BUY NOW")
selenium.click("//div[@id='container']/div/div/div[2]/div[2]/div")
selenium.selectFrame("index=0")
selenium.click("//div[@id='application']/div[3]/div/div/div")
selenium.click("link=Continue")
selenium.click("//div[@id='payment-list']/div/a/div[2]/div")
selenium.click("link=Pay Now")
selenium.click("name=cardnumber")
selenium.click("xpath=(//input[@type='tel'])[2]")
selenium.click("xpath=(//input[@type='tel'])[2]")
selenium.type("xpath=(//input[@type='tel'])[2]", "01 / 23")
selenium.click("xpath=(//input[@type='tel'])[3]")
selenium.type("xpath=(//input[@type='tel'])[3]", "123")
selenium.click("link=Pay Now")
selenium.selectFrame("index=0")
selenium.type("id=PaRes", "112233")
selenium.click("name=ok")
selenium.selectFrame("relative=parent")
selenium.click("xpath=(//input[@type='tel'])[2]")
selenium.click("link=Done")
