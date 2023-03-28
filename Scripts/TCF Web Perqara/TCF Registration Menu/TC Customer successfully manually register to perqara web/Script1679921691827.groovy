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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

WebUI.openBrowser('')

WebUI.navigateToUrl('https://perqara.com/')

if (WebUI.verifyElementPresent(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Modal/modal_icon x Kebijakan Privasi'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Modal/modal_icon x Kebijakan Privasi'))
}

WebUI.click(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Top/link_menu top Daftar'))

def title = WebUI.getText(findTestObject('OBJR Web Perqara/OBJR Registration Menu/title_Buat Akun Perqara'))

if (!(title.toString().contains('Buat Akun Perqara'))) {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

def subtitle = WebUI.getText(findTestObject('OBJR Web Perqara/OBJR Registration Menu/subtitle_Daftar Sebagai'))

if (!(subtitle.toString().contains('Daftar Sebagai'))) {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

WebUI.click(findTestObject('OBJR Web Perqara/OBJR Registration Menu/combo_Advokat'))

def ajakan = WebUI.getText(findTestObject('OBJR Web Perqara/OBJR Registration Menu/label_recruitment ajakan'))

if (!(ajakan.toString().contains('Kenali kami lebih lanjut atau daftarkan diri Anda melalui:'))) {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

WebUI.verifyElementText(findTestObject('OBJR Web Perqara/OBJR Registration Menu/label_recruitment email'), 'recruitment@perqara.com')

WebUI.click(findTestObject('OBJR Web Perqara/OBJR Registration Menu/combo_Klien'))

WebUI.verifyElementVisible(findTestObject('OBJR Web Perqara/OBJR Registration Menu/button_Daftar disabled'))

WebUI.verifyElementText(findTestObject('OBJR Web Perqara/OBJR Registration Menu/label_Nama Lengkap'), 'Nama Lengkap')

WebUI.verifyElementText(findTestObject('OBJR Web Perqara/OBJR Registration Menu/label_Email'), 'Email')

WebUI.verifyElementText(findTestObject('OBJR Web Perqara/OBJR Registration Menu/label_Sandi'), 'Sandi')

WebUI.setText(findTestObject('OBJR Web Perqara/OBJR Registration Menu/textbox_Nama Lengkap'), 'Nickolas Jonathan')

String pattern = 'yyyyMMddHHmmss'

SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale('en', 'UK'))

String date = simpleDateFormat.format(new Date())

System.out.println(date)

String originalEmail = 'nikojona'

String domainEmail = '@gmail.com'

String newEmail = originalEmail.concat(date).concat(domainEmail)

System.out.println(newEmail)

WebUI.setText(findTestObject('OBJR Web Perqara/OBJR Registration Menu/textbox_Email'), newEmail)

WebUI.setEncryptedText(findTestObject('OBJR Web Perqara/OBJR Registration Menu/textbox_Sandi'), 'p4y+y39Ir5PKtSulDZWcYg==')

if (WebUI.verifyElementPresent(findTestObject('OBJR Web Perqara/OBJR Registration Menu/icon_Chat box x'), 1, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('OBJR Web Perqara/OBJR Registration Menu/icon_Chat box x'))
}

if (WebUI.verifyElementPresent(findTestObject('OBJR Web Perqara/OBJR Registration Menu/icon_Chat circle'), 1, FailureHandling.CONTINUE_ON_FAILURE)) {
	WebUI.click(findTestObject('OBJR Web Perqara/OBJR Registration Menu/icon_Chat circle'))
}

if (WebUI.verifyElementPresent(findTestObject('OBJR Web Perqara/OBJR Registration Menu/button_Chat message x'), 1, FailureHandling.CONTINUE_ON_FAILURE)) {
	WebUI.click(findTestObject('OBJR Web Perqara/OBJR Registration Menu/button_Chat message x'))
}

WebUI.verifyElementVisible(findTestObject('OBJR Web Perqara/OBJR Registration Menu/button_Daftar enabled'))

WebUI.click(findTestObject('OBJR Web Perqara/OBJR Registration Menu/button_Daftar enabled'))

def registrationMsg1 = WebUI.getText(findTestObject('OBJR Web Perqara/OBJR Registration Success Menu/title_Registrasi berhasil'))

if (!(registrationMsg1.toString().contains('Registrasi berhasi'))) {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

def registrationMsg2 = WebUI.getText(findTestObject('OBJR Web Perqara/OBJR Registration Success Menu/title_arahan periksa email'))

if (!(registrationMsg2.toString().contains('Silahkan periksa email anda untuk melakukan verifikasi'))) {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

def registrationMsg3 = WebUI.getText(findTestObject('OBJR Web Perqara/OBJR Registration Success Menu/title_arahan 10 menit'))

if (!(registrationMsg3.toString().contains('Apabila dalam 10 menit tidak menerima email verifikasi,'))) {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

def registrationMsg4 = WebUI.getText(findTestObject('OBJR Web Perqara/OBJR Registration Success Menu/link_Klik disini'))

if (!(registrationMsg4.toString().contains('klik disini'))) {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

WebUI.closeBrowser()

