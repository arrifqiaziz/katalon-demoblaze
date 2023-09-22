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

WebUI.verifyElementPresent(findTestObject('Menu Bar/Login'), 1)

WebUI.click(findTestObject('Menu Bar/Login'))

WebUI.setText(findTestObject('Register and Login Form/Input Username - Login'), 'username')

WebUI.setText(findTestObject('Register and Login Form/Input Password - Login'), 'password')

WebUI.click(findTestObject('Register and Login Form/Button Login'))

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('Menu Bar/Logout'), 1, FailureHandling.OPTIONAL)) {
    println('Success Login')

    WebUI.verifyElementPresent(findTestObject('Menu Bar/Logout'), 1)

    WebUI.click(findTestObject('Menu Bar/Logout'))
} else {
    println('Failed Login - Wrong Username or Password')

    WebUI.verifyElementPresent(findTestObject('Register and Login Form/Error Login'), 1)
}

WebUI.closeBrowser()

