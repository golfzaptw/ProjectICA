import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import net.bytebuddy.utility.RandomString as RandomString

Mobile.comment('Search location project for find folder android apk.')

def appPath = RunConfiguration.getProjectDir() + GlobalVariable.ANDROID_APP

Mobile.startApplication(appPath, false)

Mobile.waitForElementPresent(findTestObject('Register/btn/btnRegister'), 10)

Mobile.tap(findTestObject('Register/btn/btnRegister'), 0)

Mobile.waitForElementPresent(findTestObject('Register/txt/txt EINEN ACCOUNT ERSTELLEN'), 0)

Mobile.waitForElementPresent(findTestObject('Register/txt/txt Nutzername'), 0)

Mobile.waitForElementPresent(findTestObject('Register/edt/edtName'), 0)

Mobile.setText(findTestObject('Register/edt/edtName'), 'TestAutomated', 0)

Mobile.waitForElementPresent(findTestObject('Register/txt/txt E-Mail-Adresse'), 0)

Mobile.waitForElementPresent(findTestObject('Register/edt/edtEmail'), 0)

Mobile.setText(findTestObject('Register/edt/edtEmail'), FileCode.randomString(), 0)

Mobile.waitForElementPresent(findTestObject('Register/txt/txt Passwort'), 0)

Mobile.waitForElementPresent(findTestObject('Register/edt/edtPass'), 0)

Mobile.setText(findTestObject('Register/edt/edtPass'), '12345678', 0)

Mobile.waitForElementPresent(findTestObject('Register/txt/txt Passwort wiederholen'), 0)

Mobile.waitForElementPresent(findTestObject('Register/edt/edtRepass'), 0)

Mobile.setText(findTestObject('Register/edt/edtRepass'), '12345678', 0)

Mobile.waitForElementPresent(findTestObject('Register/btn/btn SubmitRegister'), 0)

Mobile.tap(findTestObject('Register/btn/btn SubmitRegister'), 0)

Mobile.scrollToText('Bitte überprüfen Sie die E-Mail-Adresse', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

