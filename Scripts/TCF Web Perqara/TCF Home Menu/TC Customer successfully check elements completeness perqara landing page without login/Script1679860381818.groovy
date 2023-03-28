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

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Home Unlogin Menu/OBJR Menu Top/icon_perqara Menu Top'))

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Top/link_menu top Beranda'), 'Beranda')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Top/link_menu top Cari Advokat'), 
    'Cari Advokat')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Top/link_menu top Blog'), 'Blog')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Top/link_menu top FAQ'), 'FAQ')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Top/link_menu top Kebijakan Privasi'), 
    'Kebijakan Privasi')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Top/link_menu top Masuk'), 'Masuk')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Top/link_menu top Daftar'), 'Daftar')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Cari Pengacara/button_Cari'), 'Cari')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/h2_Pilih berdasarkan kategori'), 
    'Pilih berdasarkan kategori')

def mes = WebUI.getText(findTestObject('OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/label_Kategori temukan advokat'))

if (!(mes.toString().contains('Pilih kategori dan temukan advokat yang tepat untuk menjawab'))) {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

WebUI.verifyElementPresent(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Pidana/link_box kategori Pidana'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Pidana/link_label Pidana'), 
    'Pidana')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Pidana/link_label Detail Kategori Pidana'), 
    'Detail Kategori')

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Pidana/img_kategori Pidana'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori perdata/link_box kategori Perdata'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori perdata/link_label Perdata'), 
    'Perdata')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Pidana/link_label Detail Kategori Pidana'), 
    'Detail Kategori')

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori perdata/img_kategori Perdata'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Ketenagakerjaan/link_kategori Ketenagakerjaan'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Ketenagakerjaan/link_label Ketenagakerjaan'), 
    'Ketenagakerjaan')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Pidana/link_label Detail Kategori Pidana'), 
    'Detail Kategori')

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Ketenagakerjaan/img_kategori Ketenagakerjaan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Perkawinan dan Perceraian/link_box kategori Perkawinan dan Perceraian'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Perkawinan dan Perceraian/link_label Perkawinan dan Perceraian'), 
    'Perkawinan dan Perceraian')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Pidana/link_label Detail Kategori Pidana'), 
    'Detail Kategori')

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Perkawinan dan Perceraian/img_kategori Perkawinan dan Perceraian'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Pertanahan/link_box kategori Pertanahan'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Pertanahan/link_label Pertanahan'), 
    'Pertanahan')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Pidana/link_label Detail Kategori Pidana'), 
    'Detail Kategori')

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Pertanahan/img_kategori Pertanahan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Perpajakan/link_box kategori Perpajakan'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Perpajakan/link_label Perpajakan'), 
    'Perpajakan')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Pidana/link_label Detail Kategori Pidana'), 
    'Detail Kategori')

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/OBJR Kategori Perpajakan/img_kategori Perpajakan'))

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Kategori/button_Lihat lebih banyak'), 'Lihat lebih banyak')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Advokat Online/label_Advokat Online'), 
    'Advokat Online')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Advokat Online/label_Tidak ada advokat yang tersedia'), 
    'Tidak ada advokat yang tersedia')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Top Advokat/label_Top Advokat Bulan Ini'), 
    'Top Advokat Bulan Ini')

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Top Advokat/OBJR Top Advokat 1/img_top advokat 1'))

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Top Advokat/OBJR Top Advokat 1/label_top advokat title 1'), 
    'Pidana')

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Top Advokat/OBJR Top Advokat 1/label_top advokat nama 1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Top Advokat/OBJR Top Advokat 2/img_top advokat 2'))

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Top Advokat/OBJR Top Advokat 2/label_top advokat title 2'), 
    'Perkawinan dan Perceraian')

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Top Advokat/OBJR Top Advokat 2/label_top advokat nama 2'))

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Mitra Kami/h2_Mitra Kami'), 'Mitra Kami')

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Mitra Kami/img_Mitra Kami 1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Mitra Kami/img_Mitra Kami 2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Mitra Kami/img_Mitra Kami 3'))

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Home Unlogin Menu/OBJR Menu Bottom/icon_perqara Menu Bottom'))

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Bottom/link_menu bottom Beranda'), 
    'Beranda')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Bottom/link_menu bottom Cari Advokat'), 
    'Cari Advokat')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Bottom/link_menu bottom Blog'), 'Blog')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Bottom/link_menu bottom FAQ'), 'FAQ')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Bottom/link_menu bottom Kebijakan Privasi'), 
    'Kebijakan Privasi')

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Bottom/icon_menu bottom instagram'))

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Bottom/icon_menu bottom linkedin'))

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Bottom/label_menu bottom Jakarta Indonesia'), 
    'Jakarta, Indonesia')

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Menu Bottom/label_menu bottom Hak Cipta Dilindungi'), 
    '2023 Perqara. Hak Cipta Dilindungi')

WebUI.verifyElementPresent(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat/icon_Chat circle'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat/label_Chat kendala'), 'Kendala saat akses Perqara? Klik disini')

WebUI.verifyElementPresent(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat/baloon_Chat kendala akses Perqara'), 
    30)

WebUI.verifyElementVisible(findTestObject('Object Repository/OBJR Web Perqara/OBJR Home Unlogin Menu/OBJR Chat/icon_Chat close'))

WebUI.closeBrowser()

