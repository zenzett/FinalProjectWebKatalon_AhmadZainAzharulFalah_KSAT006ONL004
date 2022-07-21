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

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_first_name'), 'Manusia')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_last_name'), 'Bumi')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_address_1'), 'Jalan Raya')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input_(optional)_billing_address_2'), 'No 100')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_city'), 'Tangerang')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_postcode'), '16417')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_phone'), '081201010101')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/textarea_(optional)_order_comments'), 'Cepet yah!')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Kotakoki/button_Place order'))

WebUI.closeBrowser()

