import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://perqara.com/')

if (WebUI.verifyElementPresent(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Modal/modal_icon x Kebijakan Privasi'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Modal/modal_icon x Kebijakan Privasi'))
}

WebUI.verifyElementPresent(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat/icon_Chat circle'), 30)

WebUI.click(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat/icon_Chat circle'))

def stringName = WebUI.getText(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Box/label_Chat box Name'))

if (!(stringName.toString().contains('Name'))) {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

def stringEmail = WebUI.getText(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Box/label_Chat box Email Address'))

if (!(stringEmail.toString().contains('Email Address'))) {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

def stringPhone = WebUI.getText(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Box/label_Chat box Phone Number'))

if (!(stringPhone.toString().contains('Phone Number'))) {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

WebUI.setText(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Box/textbox_Chat box Name'), 'Nickolas Jonathan')

WebUI.setText(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Box/textbox_Chat box Email Address'), 'nikojona@gmail.com')

WebUI.setText(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Box/textbox_Chat box Phone Number'), '8568989583')

WebUI.click(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Box/button_Chat box start chatting'))

WebUI.verifyElementPresent(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Message/button_Chat message logout'), 30)

WebUI.verifyElementPresent(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Message/button_Chat message x'), 30)

WebUI.verifyElementPresent(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Message/label_Chat message today'), 30)

WebUI.verifyElementPresent(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Message/icon_Chat message attachment'), 30)

WebUI.verifyElementPresent(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Message/icon_Chat message emoji'), 30)

WebUI.setText(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Message/textbox_Chat message'), 'Testing chat using Automation')

WebUI.sendKeys(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Message/textbox_Chat message'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Message/button_Chat message x'))

WebUI.verifyElementNotPresent(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat Message/box_Chat message conversation'), 30)

WebUI.verifyElementPresent(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat/icon_Chat circle'), 30)

WebUI.click(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat/icon_Chat circle'))

WebUI.verifyElementNotPresent(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat/icon_Chat circle'), 30)

WebUI.closeBrowser()

