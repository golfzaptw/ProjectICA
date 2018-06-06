import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Release 0.0.1/Register')

suiteProperties.put('name', 'Register')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\iDolphinz\\git\\ProjectICA\\ICA Android\\Reports\\Release 0.0.1\\Register\\20180606_124257\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Release 0.0.1/Register', suiteProperties, [new TestCaseBinding('Test Cases/Release 0.0.1/Authentication/Register/Register01', 'Test Cases/Release 0.0.1/Authentication/Register/Register01',  null), new TestCaseBinding('Test Cases/Release 0.0.1/Authentication/Register/Register02', 'Test Cases/Release 0.0.1/Authentication/Register/Register02',  null), new TestCaseBinding('Test Cases/Release 0.0.1/Authentication/Register/Register03', 'Test Cases/Release 0.0.1/Authentication/Register/Register03',  null), new TestCaseBinding('Test Cases/Release 0.0.1/Authentication/Register/Register04', 'Test Cases/Release 0.0.1/Authentication/Register/Register04',  null), new TestCaseBinding('Test Cases/Release 0.0.1/Authentication/Register/Register05', 'Test Cases/Release 0.0.1/Authentication/Register/Register05',  null), new TestCaseBinding('Test Cases/Release 0.0.1/Authentication/Register/Register06', 'Test Cases/Release 0.0.1/Authentication/Register/Register06',  null), new TestCaseBinding('Test Cases/Release 0.0.1/Authentication/Register/Register07', 'Test Cases/Release 0.0.1/Authentication/Register/Register07',  null), new TestCaseBinding('Test Cases/Release 0.0.1/Authentication/Register/Register09', 'Test Cases/Release 0.0.1/Authentication/Register/Register09',  null)])
