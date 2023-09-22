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

WebUI.callTestCase(findTestCase('Cart and Purchase/Check Detail Product'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Cart/Detail Product/Button Add to Cart'))

WebUI.click(findTestObject('Menu Bar/Cart'))

WebUI.verifyElementPresent(findTestObject('Cart/Cart Page/Text Name Product in Cart'), 1)

WebUI.verifyElementPresent(findTestObject('Cart/Cart Page/Text Price in Cart'), 1)

WebUI.verifyElementPresent(findTestObject('Cart/Cart Page/Button Place Order'), 1)

WebUI.verifyElementPresent(findTestObject('Cart/Cart Page/Button Delete in Cart'), 1)

WebUI.click(findTestObject('Cart/Cart Page/Button Delete in Cart'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

