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

WebUI.click(findTestObject('Cart/Cart Page/Button Place Order'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Cart/Receipt Page/Input Name - Receipt'), 1)

WebUI.setText(findTestObject('Cart/Receipt Page/Input Name - Receipt'), 'Arrifqi Aziz')

WebUI.verifyElementPresent(findTestObject('Cart/Receipt Page/Input Country - Receipt'), 1)

WebUI.setText(findTestObject('Cart/Receipt Page/Input Country - Receipt'), 'Indonesia')

WebUI.verifyElementPresent(findTestObject('Cart/Receipt Page/Input City  - Receipt'), 1)

WebUI.setText(findTestObject('Cart/Receipt Page/Input City  - Receipt'), 'Bogor')

WebUI.verifyElementPresent(findTestObject('Cart/Receipt Page/Input Credit Card - Receipt'), 1)

WebUI.setText(findTestObject('Cart/Receipt Page/Input Credit Card - Receipt'), '1234567890')

WebUI.verifyElementPresent(findTestObject('Cart/Receipt Page/Input Month - Receipt'), 1)

WebUI.setText(findTestObject('Cart/Receipt Page/Input Month - Receipt'), '07')

WebUI.verifyElementPresent(findTestObject('Cart/Receipt Page/Input Year - Receipt'), 1)

WebUI.setText(findTestObject('Cart/Receipt Page/Input Year - Receipt'), '2025')

WebUI.verifyElementPresent(findTestObject('Cart/Receipt Page/Button Purchase'), 1)

WebUI.click(findTestObject('Cart/Receipt Page/Button Purchase'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Cart/Receipt Page/Text Detail Purchase'), 1)

WebUI.verifyElementPresent(findTestObject('Cart/Receipt Page/Button Ok'), 1)

WebUI.click(findTestObject('Cart/Receipt Page/Button Ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

