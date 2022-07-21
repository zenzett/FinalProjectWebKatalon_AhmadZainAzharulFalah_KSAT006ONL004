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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('Object Repository/Page_Kotakoki  Welcome to my Website/span_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login  Kotakoki/input_Username or E-mail_username-298'), 'wiquecbry874328@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Kotakoki/input_Password_user_password-298'), 'zq2vx7dj4c2Jn3q1GlaSnTY0zQ4ms0Wg')

WebUI.click(findTestObject('Object Repository/Page_Login  Kotakoki/input_Keep me signed in_um-submit-btn'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Login  Kotakoki/p_Password is incorrect. Please try again'), 
    3, FailureHandling.OPTIONAL) == true) {
    println('Yah gagal cuy.')

    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Login  Kotakoki/p_Password is incorrect. Please try again'), 
        3, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Object Repository/Page_Kotakoki  Welcome to my Website/span_Register Now'))

    WebUI.setText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Username_user_login-297'), 'aping')

    WebUI.setText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_E-mail Address_user_email-297'), 'aping@gmail.com')

    WebUI.setText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Phone Number_phone_number-297'), '081201010101')

    WebUI.setText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Password_user_password-297'), 'QWEqwe123')

    WebUI.setText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Confirm Password_confirm_user_password-297'), 
        'QWEqwe123')

    WebUI.setText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Address_Relative_adress-297'), 'Tangerang')

    WebUI.click(findTestObject('Page_Register Now  Kotakoki/input_Only fill in if you are not human_um-_fc91b5'))
} else {
    println('Nah berhasil nih.')
}

