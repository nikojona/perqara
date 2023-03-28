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

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Top/link_menu top Masuk'), 'Masuk')

WebUI.click(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Top/link_menu top Masuk'), FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat/icon_Chat close'), 1, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat/icon_Chat close'))
}

WebUI.setText(findTestObject('OBJR Web Perqara/OBJR Login Menu/textbox_Email'), 'nikojona@gmail.com')

WebUI.setEncryptedText(findTestObject('OBJR Web Perqara/OBJR Login Menu/textbox_Sandi'), 'p4y+y39Ir5PKtSulDZWcYg==')

WebUI.waitForElementVisible(findTestObject('OBJR Web Perqara/OBJR Login Menu/button_Masuk enabled'), 30)

WebUI.click(findTestObject('OBJR Web Perqara/OBJR Login Menu/button_Masuk enabled'))

WebUI.verifyElementPresent(findTestObject('OBJR Web Perqara/OBJR Home Login Menu/label_initial N'), 30)

WebUI.verifyElementText(findTestObject('OBJR Web Perqara/OBJR Home Login Menu/button_Nickolas'), 'Nickolas')

WebUI.click(findTestObject('OBJR Web Perqara/OBJR Home Login Menu/label_initial N'))

WebUI.verifyElementPresent(findTestObject('OBJR Web Perqara/OBJR Home Login Menu/box_profile'), 30)

WebUI.verifyElementText(findTestObject('OBJR Web Perqara/OBJR Home Login Menu/button_Keluar'), 'Keluar')

WebUI.click(findTestObject('OBJR Web Perqara/OBJR Home Login Menu/button_Keluar'))

WebUI.closeBrowser()

