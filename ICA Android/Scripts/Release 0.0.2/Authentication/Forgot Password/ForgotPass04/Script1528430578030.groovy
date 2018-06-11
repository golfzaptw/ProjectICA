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

Mobile.comment('Search location project for find folder android apk.')

def appPath = RunConfiguration.getProjectDir() + GlobalVariable.ANDROID_APP

Mobile.startApplication(appPath, false)

Mobile.waitForElementPresent(findTestObject('ForgotPass/btn/btn LOGIN'), 0)

Mobile.tap(findTestObject('ForgotPass/btn/btn LOGIN'), 0)

Mobile.waitForElementPresent(findTestObject('ForgotPass/txt/txt Passwort vergessen'), 0)

Mobile.tap(findTestObject('ForgotPass/txt/txt Passwort vergessen'), 0)

Mobile.waitForElementPresent(findTestObject('ForgotPass/txt/txt Passwort vergessen Top Page'), 0)

Mobile.waitForElementPresent(findTestObject('ForgotPass/txt/txt E-Mail-Adresse'), 0)

Mobile.waitForElementPresent(findTestObject('ForgotPass/edt Email'), 0)

Mobile.setText(findTestObject('ForgotPass/edt Email'), FileCode.randomString() + '@gmail.com', 0)

Mobile.waitForElementPresent(findTestObject('ForgotPass/btn/btn SENDEN'), 0)

Mobile.tap(findTestObject('ForgotPass/btn/btn SENDEN'), 0)

Mobile.scrollToText('Passwort vergessen ist fehlgeschlagen.', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Entschuldigung! Diese E-Mail-Adresse ist nicht gefunden.', FailureHandling.STOP_ON_FAILURE)

'close application'
Mobile.closeApplication()
