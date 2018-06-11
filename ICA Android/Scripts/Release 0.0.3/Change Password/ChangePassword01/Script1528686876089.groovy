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

Mobile.startApplication(appPath, true)

Mobile.waitForElementPresent(findTestObject('Login/btn/btn LOGINPAGE'), 0)

Mobile.tap(findTestObject('Login/btn/btn LOGINPAGE'), 0)

Mobile.waitForElementPresent(findTestObject('Login/txt/txt LOGIN'), 0)

Mobile.waitForElementPresent(findTestObject('Login/txt/txt E-Mail-Adresse'), 0)

Mobile.setText(findTestObject('Login/edt/edtEmail'), 'psgolf12@gmail.com', 0)

Mobile.waitForElementPresent(findTestObject('Login/txt/txt Passwort'), 0)

Mobile.setText(findTestObject('Login/edt/edtPassword'), '123123123', 0)

Mobile.waitForElementPresent(findTestObject('Login/btn/btnSubmitLOGIN'), 0)

Mobile.tap(findTestObject('Login/btn/btnSubmitLOGIN'), 0)

Mobile.waitForElementPresent(findTestObject('Logout/btn Logout'), 0)

Mobile.tap(findTestObject('Logout/btn Logout'), 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt Passwort ndern'), 0)

Mobile.tap(findTestObject('Changepassword/txt/txt Passwort ndern'), 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt Head Page Changepass'), 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt  OldPass'), 0)

Mobile.setText(findTestObject('Changepassword/edt/edt OldPass'), '123123123', 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt NewPass'), 0)

Mobile.setText(findTestObject('Changepassword/edt/edt NewPass'), '12121212', 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt ReNewPass'), 0)

Mobile.setText(findTestObject('Changepassword/edt/edt ReNewPass'), '12121212', 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt SPEICHERN'), 0)

Mobile.tap(findTestObject('Changepassword/txt/txt SPEICHERN'), 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt ChangePassSuccess'), 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt OK'), 0)

Mobile.tap(findTestObject('Changepassword/txt/txt OK'), 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt Passwort ndern'), 0)

Mobile.tap(findTestObject('Changepassword/txt/txt Passwort ndern'), 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt Head Page Changepass'), 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt  OldPass'), 0)

Mobile.setText(findTestObject('Changepassword/edt/edt OldPass'), '12121212', 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt NewPass'), 0)

Mobile.setText(findTestObject('Changepassword/edt/edt NewPass'), '123123123', 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt ReNewPass'), 0)

Mobile.setText(findTestObject('Changepassword/edt/edt ReNewPass'), '123123123', 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt SPEICHERN'), 0)

Mobile.tap(findTestObject('Changepassword/txt/txt SPEICHERN'), 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt ChangePassSuccess'), 0)

Mobile.waitForElementPresent(findTestObject('Changepassword/txt/txt OK'), 0)

Mobile.tap(findTestObject('Changepassword/txt/txt OK'), 0)

Mobile.closeApplication()

