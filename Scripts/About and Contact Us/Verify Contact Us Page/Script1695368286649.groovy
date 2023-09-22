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

WebUI.navigateToUrl(GlobalVariable.base_url)

WebUI.click(findTestObject('Menu Bar/Contact'))

WebUI.verifyElementPresent(findTestObject('Contact Us/Head Contact Us'), 1)

WebUI.verifyElementPresent(findTestObject('Contact Us/Input Text Email'), 1)

WebUI.setText(findTestObject('Contact Us/Input Text Email'), email)

WebUI.verifyElementPresent(findTestObject('Contact Us/Input Text Name'), 1)

WebUI.setText(findTestObject('Contact Us/Input Text Name'), name)

WebUI.verifyElementPresent(findTestObject('Contact Us/Input Text Message'), 1)

WebUI.setText(findTestObject('Contact Us/Input Text Message'), message)

WebUI.verifyElementPresent(findTestObject('Contact Us/Close Contact Us'), 1)

WebUI.verifyElementPresent(findTestObject('Contact Us/Send Message'), 1)

WebUI.click(findTestObject('Contact Us/Send Message'))

WebUI.closeBrowser()

